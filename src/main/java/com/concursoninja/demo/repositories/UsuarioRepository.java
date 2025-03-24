package com.concursoninja.demo.repositories;

import com.concursoninja.demo.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
