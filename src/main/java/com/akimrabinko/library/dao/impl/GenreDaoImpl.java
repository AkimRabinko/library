package com.akimrabinko.library.dao.impl;

import com.akimrabinko.library.dao.GenreDao;
import com.akimrabinko.library.entity.GenreInfo;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.akimrabinko.library.jooqData.tables.Genre.GENRE;

@Repository
@RequiredArgsConstructor
public class GenreDaoImpl implements GenreDao {
    private final DSLContext dslContext;

    @Override
    public List<GenreInfo> getGenresDescription() {
        return dslContext.select()
                .from(GENRE)
                .fetch()
                .into(GenreInfo.class);
    }
}
