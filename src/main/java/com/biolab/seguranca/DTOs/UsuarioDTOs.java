package com.biolab.seguranca.DTOs;

import com.biolab.seguranca.entitiy.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import org.aspectj.bridge.Message;

import java.util.UUID;

public class UsuarioDTOs {
    private UUID Id;
    private String name;
    @Email
    private String email;
    @Size(min = 6,message = "a senha deve ter 6 caracteres " )
    private String Senha;
    private Role role;
}
