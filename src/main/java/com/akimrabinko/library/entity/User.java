package com.akimrabinko.library.entity;

import lombok.Value;

import java.time.LocalDate;

@Value
public class User {
    long id;
    String name;
    String surname;
    String email;
    LocalDate birthday;
}
