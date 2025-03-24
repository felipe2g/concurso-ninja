package com.concursoninja.demo.controllers;

import com.concursoninja.demo.dtos.UsuarioCreateDTO;
import com.concursoninja.demo.dtos.UsuarioDTO;
import com.concursoninja.demo.entities.Usuario;
import com.concursoninja.demo.services.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping(
            value = "/registrar",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<UsuarioDTO> registrarUsuario(@RequestBody @Valid UsuarioCreateDTO dto) {
        UsuarioDTO usuario = authService.registrarUsuario(dto);
        return ResponseEntity.ok(usuario);
    }
}
