package com.akimrabinko.library.dto;

import com.akimrabinko.library.entity.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;

@Value
@Builder(toBuilder = true)
public class UserDto {
    String name;
    String surname;
    String email;
    LocalDate birthday;
    UserRole userRole;
    String password;

    @JsonCreator
    public UserDto(@JsonProperty("name") String name,
                   @JsonProperty("surname") String surname,
                   @JsonProperty("email") String email,
                   @JsonProperty("birthday") LocalDate birthday,
                   @JsonProperty("userRole") UserRole userRole,
                   @JsonProperty("password") String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.userRole = userRole;
        this.password = password;
    }
}
