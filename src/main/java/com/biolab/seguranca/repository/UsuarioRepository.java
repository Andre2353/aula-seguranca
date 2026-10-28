package com.biolab.seguranca.repository;

import com.biolab.seguranca.entitiy.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
