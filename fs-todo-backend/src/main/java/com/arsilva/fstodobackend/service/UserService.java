package com.arsilva.fstodobackend.service;

import com.arsilva.fstodobackend.models.User;
import com.arsilva.fstodobackend.resource.dto.UserDto;

import java.util.List;

public interface UserService {

    User addUser(UserDto userDto);
    User updateUser(UserDto userDto);
    void deleteUser(Long id);
    User findUserById(Long id);
    List<User> listUsers();

}
