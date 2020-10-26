package com.akimrabinko.library.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Value;

import java.time.LocalDate;

@Value
public class Period {
    LocalDate periodStart;
    LocalDate periodEnd;

    @JsonCreator

    public Period(@JsonProperty("periodStart") LocalDate periodStart,
                  @JsonProperty("periodEnd") LocalDate periodEnd) {
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
    }
}
