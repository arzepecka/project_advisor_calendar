package pl.sda.advisor_calendar.model.bank.employee.type;

import lombok.Getter;
import lombok.Setter;

public enum JobTitle {

    JUNIOR_ADVISOR("Młodszy Doradca Klienta"),
    ADVISOR("Doradca Klienta"),
    SENIOR_ADVISOR("Starszy Doradca Klienta"),
    COMPANY_ADVISOR("Doradca Klienta Firmowego"),
    INDIVIDUAL_ADVISOR("Doradca Klienta Indywidualnego"),
    MORTAGE_ADVISOR("Doradca ds. Kredytów Hipotecznych");

    @Getter
    @Setter
    String jobTitle;

    JobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
