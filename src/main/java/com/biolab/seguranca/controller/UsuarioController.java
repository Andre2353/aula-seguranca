package com.biolab.seguranca.controller;

import com.biolab.seguranca.DTOs.UsuarioDTO;
import com.biolab.seguranca.service.Usuarioservice;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final Usuarioservice service;

    public UsuarioController(Usuarioservice service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> saveUser(@Valid @RequestBody UsuarioDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveUser(dto));
    }
}