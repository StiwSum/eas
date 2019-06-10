package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Client{
    private final LocalDateTime up = LocalDateTime.now();
    private LocalDateTime addTime;
    private String fName;
    private String sName;
    private LocalDate burnDate;
    private LocalDateTime registedDate;
    private FitnessServiceEnumeration clientStatus;

    public Client(String fName, String sName, LocalDate burnDate) {
        this.fName = fName;
        this.sName = sName;
        this.burnDate = burnDate;
        this.registedDate = LocalDateTime.now();
    }

    public Client(String fName, String sName, LocalDate burnDate, LocalDateTime registedDate) {
        this.fName = fName;
        this.sName = sName;
        this.burnDate = burnDate;
        this.registedDate = registedDate;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setBurnDate(LocalDate burnDate) {
        this.burnDate = burnDate;
    }

    public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public LocalDate getBurnDate() {
        return burnDate;
    }

    public LocalDateTime getRegistedDate() {
        return registedDate;
    }

    public FitnessServiceEnumeration getClientStatus() {
        return clientStatus;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }
    
    

    public void setClientStatus(FitnessServiceEnumeration clientStatus) {
        if (getRegistedDate().getHour() < 8 || getRegistedDate().getHour() > 22)
            throw new NoAccessException("rerr");
        if (clientStatus == FitnessServiceEnumeration.GROUP) {
            throw new IllegalArgumentException(" Illegal Argumen tException");
        } else {
            this.clientStatus = clientStatus;
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s \n %s \nClient on %s", getfName(),
                getsName(),
                getClass(),
                getClientStatus());
    }
    
    public String toStringForFile() {
        return String.format("Name: %s %s    Вид занятия: %s    Time: %s", getfName(),
                getsName(),
                getClientStatus(),
                getAddTime().toString());
    }
}
