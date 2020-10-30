package com.akimrabinko.library.controller;

import com.akimrabinko.library.entity.GenreInfo;
import com.akimrabinko.library.service.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;

    @GetMapping("genres/description")
    public List<GenreInfo> getGenresDescription() {
        return genreService.getGenresDescription();
    }
}
