package com.webservice.service;

import com.webservice.entity.UserEntity;

import java.util.List;

public interface UserService {
    List<UserEntity> getAll();
}
