package com.concursoninja.demo.services;

import com.concursoninja.demo.dtos.UsuarioCreateDTO;
import com.concursoninja.demo.dtos.UsuarioDTO;
import com.concursoninja.demo.entities.Usuario;
import com.concursoninja.demo.mappers.UsuarioMapper;
import com.concursoninja.demo.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UsuarioRepository repository;
    private final UsuarioMapper usuarioMapper;

    public AuthService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {
        this.repository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    public UsuarioDTO registrarUsuario(UsuarioCreateDTO dto) {
        Usuario usuario = repository.save(usuarioMapper.toUsuario(dto));
        return usuarioMapper.toUsuarioDTO(usuario);
    }
}
