package com.akimrabinko.library.service.impl;

import com.akimrabinko.library.dao.GenreDao;
import com.akimrabinko.library.entity.GenreInfo;
import com.akimrabinko.library.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreDao genreDao;

    @Override
    public List<GenreInfo> getGenresDescription() {
        return genreDao.getGenresDescription();
    }
}
