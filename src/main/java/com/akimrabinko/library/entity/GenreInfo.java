package com.akimrabinko.library.entity;

import com.akimrabinko.library.entity.enums.Genre;
import lombok.Value;

@Value
public class GenreInfo {
    Genre name;
    String description;
}
