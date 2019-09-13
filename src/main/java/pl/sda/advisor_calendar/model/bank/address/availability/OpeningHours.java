package pl.sda.advisor_calendar.model.bank.address.availability;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

public enum OpeningHours {
    FROM_7(LocalTime.of(7,0)),
    FROM_8(LocalTime.of(8,0)),
    FROM_9(LocalTime.of(9,0)),
    FROM_10(LocalTime.of(10,0)),
    FROM_11(LocalTime.of(11,0)),
    FROM_12(LocalTime.of(12,0));

    @Getter
    @Setter
    LocalTime availableFrom;

    OpeningHours(LocalTime availableFrom) {
        this.availableFrom = availableFrom;
    }
}
