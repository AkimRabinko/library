package com.akimrabinko.library.entity;

import lombok.Value;

import java.time.LocalDate;

@Value
public class Period {
    LocalDate start;
    LocalDate end;
}
