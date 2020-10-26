package com.akimrabinko.library.controller;

import com.akimrabinko.library.dto.UserDto;
import com.akimrabinko.library.entity.User;
import com.akimrabinko.library.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {
    private final UserService userService;

    @GetMapping("{id}")
    public User getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }

    @GetMapping("{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping("create")
    public boolean createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
