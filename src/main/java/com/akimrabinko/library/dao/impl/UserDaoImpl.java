package com.akimrabinko.library.dao.impl;

import com.akimrabinko.library.dao.UserDao;
import com.akimrabinko.library.dto.UserDto;
import com.akimrabinko.library.entity.User;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.akimrabinko.library.jooqData.tables.User.USER;
import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;

@Repository
@RequiredArgsConstructor
public class UserDaoImpl implements UserDao {
    private final DSLContext dslContext;

    @Override
    public User getUserById(long id) {
        return dslContext.select()
                .from(USER)
                .where(USER.ID.eq((int) id))
                .fetchSingle(recordMapper -> new User(
                        recordMapper.get(USER.ID),
                        recordMapper.get(USER.NAME),
                        recordMapper.get(USER.SURNAME),
                        recordMapper.get(USER.EMAIL),
                        recordMapper.get(USER.BIRTHDAY)));
    }

    @Override
    public User getUserByEmail(String email) {
        return dslContext.select()
                .from(USER)
                .where(USER.EMAIL.eq(email))
                .fetchSingle(recordMapper -> new User(
                        recordMapper.get(USER.ID),
                        recordMapper.get(USER.NAME),
                        recordMapper.get(USER.SURNAME),
                        recordMapper.get(USER.EMAIL),
                        recordMapper.get(USER.BIRTHDAY)));
    }

    @Override
    public boolean createUser(UserDto userDto) {
        return dslContext.insertInto(USER)
                .set(USER.NAME, userDto.getName())
                .set(USER.SURNAME, userDto.getSurname())
                .set(USER.EMAIL, userDto.getEmail())
                .set(USER.BIRTHDAY, userDto.getBirthday())
                .set(USER.PASSWORD, userDto.getPassword())
                .execute() > INTEGER_ZERO;
    }
}
