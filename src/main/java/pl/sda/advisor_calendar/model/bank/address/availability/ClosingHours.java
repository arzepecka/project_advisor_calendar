package pl.sda.advisor_calendar.model.bank.address.availability;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

public enum ClosingHours {
    TO_15(LocalTime.of(15,0)),
    TO_16(LocalTime.of(16,0)),
    TO_17(LocalTime.of(17,0)),
    TO_18(LocalTime.of(18,0)),
    TO_19(LocalTime.of(19,0)),
    TO_20(LocalTime.of(20,0));

    @Getter
    @Setter
    LocalTime availableTo;

    ClosingHours(LocalTime availableTo) {
        this.availableTo = availableTo;
    }
}

