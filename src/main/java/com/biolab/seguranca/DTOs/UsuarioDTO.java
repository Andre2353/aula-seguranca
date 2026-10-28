package com.biolab.seguranca.DTOs;

import com.biolab.seguranca.entitiy.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
    private UUID Id;
    private String nome;
    @Email
    private String email;
    @Size(min = 6,message = "a senha deve ter 6 caracteres " )
    private String Senha;
    private Role role;
}
