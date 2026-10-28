package com.biolab.seguranca.service;

import com.biolab.seguranca.DTOs.UsuarioDTO;
import com.biolab.seguranca.entitiy.Usuario;
import com.biolab.seguranca.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class Usuarioservice {

    private final UsuarioRepository repo;
    private final PasswordEncoder passwordEncoder;

    public Usuarioservice(UsuarioRepository repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder = passwordEncoder;
    }

    public Usuario saveUser(UsuarioDTO dto) {
        Usuario u = new Usuario();
        u.setNome(dto.getNome());
        u.setEmail(dto.getEmail());
        u.setSenha(passwordEncoder.encode(dto.getSenha()));
        u.setRole(dto.getRole());

        return repo.save(u);
    }
}