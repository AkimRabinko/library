package com.akimrabinko.library.dao;

import com.akimrabinko.library.entity.GenreInfo;

import java.util.List;

public interface GenreDao {
    List<GenreInfo> getGenresDescription();
}
