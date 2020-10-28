package com.akimrabinko.library.service.impl;

import com.akimrabinko.library.dao.SubscribeDao;
import com.akimrabinko.library.dto.SubscribeDto;
import com.akimrabinko.library.entity.Subscribe;
import com.akimrabinko.library.service.SubscribeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubscribeServiceImpl implements SubscribeService {
    private final SubscribeDao subscribeDao;

    @Override
    public List<Subscribe> getSubscribesByUserId(long userId) {
        return subscribeDao.getSubscribesByUserId(userId);
    }

    @Override
    public boolean addSubscribe(SubscribeDto subscribeDto) {
        return subscribeDao.addSubscribe(subscribeDto);
    }
}
