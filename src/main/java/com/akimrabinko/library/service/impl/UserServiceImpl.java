package com.akimrabinko.library.service.impl;

import com.akimrabinko.library.dao.UserDao;
import com.akimrabinko.library.dto.UserDto;
import com.akimrabinko.library.entity.User;
import com.akimrabinko.library.service.PasswordEncoderService;
import com.akimrabinko.library.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    private final PasswordEncoderService passwordEncoderService;

    @Override
    public User getUserById(long id) {
        return userDao.getUserById(id);
    }

    @Override
    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    @Override
    public boolean createUser(UserDto userDto) {
        UserDto userWithEncodedPassword = userDto.toBuilder()
                .password(passwordEncoderService.encode(userDto.getPassword()))
                .build();
        return userDao.createUser(userWithEncodedPassword);
    }
}
