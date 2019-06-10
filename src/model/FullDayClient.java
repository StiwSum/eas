package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class FullDayClient extends DayClient {

    private LocalDateTime addTime;
    private FitnessServiceEnumeration clientStatus;

    public FitnessServiceEnumeration getClientStatus() {
        return clientStatus;
    }

    public FullDayClient(String fName, String sName, LocalDate burnDate) {
        super(fName, sName, burnDate);
    }
    
    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }
    
    public void setFullDayClientStatus(FitnessServiceEnumeration clientStatus) {
         if (getRegistedDate().getHour() < 8 || getRegistedDate().getHour() > 22)
            throw new NoAccessException("rerr");
        this.clientStatus = clientStatus;
    }
}
