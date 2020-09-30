package com.webservice.service.impl;

import com.webservice.entity.UserEntity;
import com.webservice.repository.UsersRepository;
import com.webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<UserEntity> getAll() {
        return usersRepository.findAll();
    }
}
