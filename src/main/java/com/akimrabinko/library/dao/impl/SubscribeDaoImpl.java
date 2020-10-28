package com.akimrabinko.library.dao.impl;

import com.akimrabinko.library.dao.SubscribeDao;
import com.akimrabinko.library.dto.SubscribeDto;
import com.akimrabinko.library.entity.Subscribe;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.akimrabinko.library.jooqData.tables.Subscribe.SUBSCRIBE;
import static org.apache.commons.lang3.math.NumberUtils.INTEGER_ZERO;

@Repository
@RequiredArgsConstructor
public class SubscribeDaoImpl implements SubscribeDao {
    private final DSLContext dslContext;

    @Override
    public List<Subscribe> getSubscribesByUserId(long userId) {
        return dslContext.select()
                .from(SUBSCRIBE)
                .where(SUBSCRIBE.USER_ID.eq(userId))
                .fetch()
                .into(Subscribe.class);
    }

    @Override
    public boolean addSubscribe(SubscribeDto subscribeDto) {
        return dslContext.insertInto(SUBSCRIBE)
                .set(SUBSCRIBE.USER_ID, subscribeDto.getUserId())
                .set(SUBSCRIBE.BOOK_ID, subscribeDto.getBookId())
                .set(SUBSCRIBE.PERIOD_START, subscribeDto.getPeriod().getPeriodStart())
                .set(SUBSCRIBE.PERIOD_END, subscribeDto.getPeriod().getPeriodEnd())
                .execute() > INTEGER_ZERO;
    }
}
