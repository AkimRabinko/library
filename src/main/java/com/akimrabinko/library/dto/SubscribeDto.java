package com.akimrabinko.library.dto;

import com.akimrabinko.library.entity.Period;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

@Value
public class SubscribeDto {
    long userId;
    long bookId;
    Period period;

    @JsonCreator
    public SubscribeDto(@JsonProperty("user_id") long userId,
                        @JsonProperty("book_id") long bookId,
                        @JsonProperty("period") Period period) {
        this.userId = userId;
        this.bookId = bookId;
        this.period = period;
    }
}
