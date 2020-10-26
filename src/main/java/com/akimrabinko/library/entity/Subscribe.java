package com.akimrabinko.library.entity;

import lombok.Value;

import java.util.Set;

@Value
public class Subscribe {
    long id;
    long userId;
    Set<Long> bookIds;
}
