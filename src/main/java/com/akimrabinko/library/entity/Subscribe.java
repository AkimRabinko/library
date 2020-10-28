package com.akimrabinko.library.entity;

import lombok.Value;

@Value
public class Subscribe {
    long id;
    long userId;
    long bookId;
    Period period;
}
