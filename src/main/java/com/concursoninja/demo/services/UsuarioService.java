package com.concursoninja.demo.services;

import com.concursoninja.demo.dtos.UsuarioCreateDTO;
import com.concursoninja.demo.exceptions.ResourceNotFoundException;
import com.concursoninja.demo.entities.Usuario;
import com.concursoninja.demo.mappers.UsuarioMapper;
import com.concursoninja.demo.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    private final UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {
        this.repository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    public List<Usuario> findAll() {
        return repository.findAll();
    }

    public Usuario findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id."));
    }

    public Usuario create(UsuarioCreateDTO dto) {
        Usuario usuario = usuarioMapper.toUsuario(dto);
        return repository.save(usuario);
    }
}
