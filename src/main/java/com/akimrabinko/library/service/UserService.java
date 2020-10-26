package com.akimrabinko.library.service;

import com.akimrabinko.library.dto.UserDto;
import com.akimrabinko.library.entity.User;

public interface UserService {
    User getUserById(long id);

    User getUserByEmail(String email);

    boolean createUser(UserDto userDto);
}
