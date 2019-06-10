package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DayClient extends Client {

    private LocalDateTime addTime;
    private LocalDate endDate;
    private FitnessServiceEnumeration clientStatus;

    public FitnessServiceEnumeration getClientStatus() {
        return clientStatus;
    }

    public DayClient(String fName, String sName, LocalDate burnDate) {
        super(fName, sName, burnDate);
        this.endDate = LocalDate.now().plusYears(1);
    }

    public DayClient(String fName, String sName, LocalDate burnDate, LocalDateTime registedDate, int monthCount) {
        super(fName, sName, burnDate, registedDate);
        this.endDate = LocalDate.now().plusMonths(monthCount);
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    public void setDayClientStatus(FitnessServiceEnumeration clientStatus) {
        if (getRegistedDate().getHour() < 8 || getRegistedDate().getHour() > 16) {
            throw new NoAccessException("rerr");
        }
        if (clientStatus == FitnessServiceEnumeration.POOL) {
            throw new IllegalArgumentException("Illegal Argumen tException");
        }
        this.clientStatus = clientStatus;
    }

}
