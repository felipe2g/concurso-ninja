package com.concursoninja.demo.services;

import com.concursoninja.demo.dtos.UserCreateDTO;
import com.concursoninja.demo.entities.User;
import com.concursoninja.demo.exceptions.ResourceNotFoundException;
import com.concursoninja.demo.mappers.UserMapper;
import com.concursoninja.demo.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.repository = userRepository;
        this.userMapper = userMapper;
    }

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id."));
    }

    public User create(UserCreateDTO dto) {
        User user = userMapper.toUser(dto);
        return repository.save(user);
    }
}
