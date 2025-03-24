package com.concursoninja.demo.services;

import com.concursoninja.demo.dtos.UserCreateDTO;
import com.concursoninja.demo.dtos.UserDTO;
import com.concursoninja.demo.entities.User;
import com.concursoninja.demo.mappers.UserMapper;
import com.concursoninja.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    private final UserRepository repository;
    private final UserMapper userMapper;

    public AuthService(UserRepository userRepository, UserMapper userMapper) {
        this.repository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDTO registrarUsuario(UserCreateDTO dto) {
        User user = repository.save(userMapper.toUser(dto));
        return userMapper.toUserDTO(user);
    }
}
