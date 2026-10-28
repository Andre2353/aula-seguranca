package com.biolab.seguranca.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desabilita CSRF (recomendado para APIs REST que usam POST/PUT/DELETE)
                .authorizeHttpRequests(auth -> auth
                        // Permite acesso público às rotas de cadastro ou login se houver (ex: POST /usuarios)
                        .requestMatchers("/usuarios/**").permitAll()
                        // Exige que o usuário tenha a Role ALUNO para acessar a rota /tcc
                        .requestMatchers("/tcc/**").hasRole("ALUNO")
                        // Qualquer outra requisição precisa estar autenticada
                        .anyRequest().authenticated()
                )
                .httpBasic(Customizer.withDefaults()); // Usa autenticação HTTP Basic (usuário e senha via Headers)

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}