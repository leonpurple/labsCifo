package com.cruz.apph2.service;

import com.cruz.apph2.model.User;

public interface UserService {

    User  saveUserId(User user);

    User getUser(Long idUser);

    User updateUser(Long id, User updateToUser);

    boolean deleteUser(Long id);


}
