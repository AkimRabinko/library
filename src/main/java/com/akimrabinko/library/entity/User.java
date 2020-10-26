package com.akimrabinko.library.entity;

import com.akimrabinko.library.entity.enums.UserRole;
import lombok.Value;

import java.time.LocalDate;

@Value
public class User {
    long id;
    String name;
    String surname;
    String email;
    LocalDate birthday;
    UserRole userRole;
}
