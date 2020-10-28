package com.akimrabinko.library.controller;

import com.akimrabinko.library.dto.SubscribeDto;
import com.akimrabinko.library.entity.Subscribe;
import com.akimrabinko.library.service.SubscribeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("subscribes")
public class SubscribeController {
    private final SubscribeService subscribeService;

    @GetMapping("users/{userId}")
    public List<Subscribe> getSubscribesByUserId(@PathVariable long userId) {
        return subscribeService.getSubscribesByUserId(userId);
    }

    @PostMapping("create")
    public boolean addSubscribe(@RequestBody SubscribeDto subscribeDto) {
        return subscribeService.addSubscribe(subscribeDto);
    }
}
