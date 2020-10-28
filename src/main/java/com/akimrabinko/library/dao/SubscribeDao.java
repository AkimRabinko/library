package com.akimrabinko.library.dao;

import com.akimrabinko.library.dto.SubscribeDto;
import com.akimrabinko.library.entity.Subscribe;

import java.util.List;

public interface SubscribeDao {
    List<Subscribe> getSubscribesByUserId(long userId);

    boolean addSubscribe(SubscribeDto subscribeDto);
}
