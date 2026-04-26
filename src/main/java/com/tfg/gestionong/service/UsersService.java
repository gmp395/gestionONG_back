package com.tfg.gestionong.service;

import com.tfg.gestionong.model.User;

public interface UsersService {

    User createUser(User user);

    User getUserById(int id);

    User updateUser(int id, User user);

    void deleteUser(int id);
}
