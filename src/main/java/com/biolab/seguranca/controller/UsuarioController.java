package com.biolab.seguranca.controller;

import com.biolab.seguranca.DTOs.UsuarioDTO;
import com.biolab.seguranca.service.Usuarioservice;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class UsuarioController {
    private final Usuarioservice service;

    public UsuarioController(Usuarioservice service) {
        this.service = service;
    }


    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody UsuarioDTO dto) {
        return ResponseEntity.ok(service.saveUser(dto));
    }
}


