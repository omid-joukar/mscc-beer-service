package com.microservices.msccbeerservice.web.mappers;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Component
public class DateMapper {
    public OffsetDateTime asOffsetDateTime(LocalDateTime ts){
        if (ts != null){
            return OffsetDateTime.of(ts.getYear(), ts.getMonthValue(),
                    ts.getDayOfMonth(), ts.getHour(), ts.getMinute(),
                    ts.getSecond(), ts.getNano(), ZoneOffset.UTC);
        } else {
            return null;
        }
    }

    public LocalDateTime asTimestamp(OffsetDateTime offsetDateTime){
        if(offsetDateTime != null) {
            return LocalDateTime.from(offsetDateTime.atZoneSameInstant(ZoneOffset.UTC).toLocalDateTime());
        } else {
            return null;
        }
    }
}
