package com.akimrabinko.library.dao;

import com.akimrabinko.library.dto.UserDto;
import com.akimrabinko.library.entity.User;

public interface UserDao {
    User getUserById(long id);

    User getUserByEmail(String email);

    boolean createUser(UserDto userDto);
}
