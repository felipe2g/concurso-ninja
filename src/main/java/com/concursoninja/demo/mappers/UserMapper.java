package com.concursoninja.demo.mappers;

import com.concursoninja.demo.dtos.UserCreateDTO;
import com.concursoninja.demo.dtos.UserDTO;
import com.concursoninja.demo.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper(componentModel = "spring")
@Component
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toUserDTO(User user);

    @Mapping(target = "id", ignore = true)
    User toUser(UserCreateDTO userCreateDTO);
}
