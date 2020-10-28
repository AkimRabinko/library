package com.akimrabinko.library.service;

import com.akimrabinko.library.dto.SubscribeDto;
import com.akimrabinko.library.entity.Subscribe;

import java.util.List;

public interface SubscribeService {
    List<Subscribe> getSubscribesByUserId(long userId);

    boolean addSubscribe(SubscribeDto subscribeDto);
}
