package com.concursoninja.demo.mappers;

import com.concursoninja.demo.controllers.UsuarioController;
import com.concursoninja.demo.dtos.UsuarioCreateDTO;
import com.concursoninja.demo.dtos.UsuarioDTO;
import com.concursoninja.demo.entities.Usuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UsuarioMapper {
    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    UsuarioDTO toUsuarioDTO(Usuario usuario);

    @Mapping(target = "id", ignore = true)
    Usuario toUsuario(UsuarioCreateDTO usuarioDTO);
}
