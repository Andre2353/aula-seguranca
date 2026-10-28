package com.biolab.seguranca.service;

import com.biolab.seguranca.DTOs.UsuarioDTO;
import com.biolab.seguranca.entitiy.Usuario;
import com.biolab.seguranca.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class Usuarioservice {
    private final UsuarioRepository repo;

    public Usuarioservice(UsuarioRepository repo) {
        this.repo = repo;
    }
    public Usuario saveUser(UsuarioDTO dto){
        Usuario u = new Usuario();
        u.setNome(dto.getNome());
        u.setEmail(dto.getNome());
        u.setSenha(dto.getSenha());
        u.setRole(dto.getRole());
        repo.save(u);
        return u;
    }
}

