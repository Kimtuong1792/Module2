package BAI_TAP_LAM_THEM.BAI_1.MODEL;

import java.time.LocalDate;

public abstract class Patient {
    public static int count = 0;
    private String id;
    private String numberPatient;
    private String idCode;
    private String name;
    private LocalDate arriveDay;
    private LocalDate leaveDay;
    private String reason;

    public Patient() {
    }

    public Patient(String id,
                   String numberPatient,
                   String idCode,
                   String name,
                   LocalDate arriveDay,
                   LocalDate leaveDay,
                   String reason) {
        this.id = id;
        this.numberPatient = numberPatient;
        this.idCode = idCode;
        this.name = name;
        this.arriveDay = arriveDay;
        this.leaveDay = leaveDay;
        this.reason = reason;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumberPatient() {
        return numberPatient;
    }

    public void setNumberPatient(String numberPatient) {
        this.numberPatient = numberPatient;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getArriveDay() {
        return arriveDay;
    }

    public void setArriveDay(LocalDate arriveDay) {
        this.arriveDay = arriveDay;
    }

    public LocalDate getLeaveDay() {
        return leaveDay;
    }

    public void setLeaveDay(LocalDate leaveDay) {
        this.leaveDay = leaveDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public abstract String getInFor();

    @Override
    public String toString() {
        return "Patient{" + id +
                ", numberPatient=" + numberPatient +
                ", idCode='" + idCode + '\'' +
                ", name='" + name + '\'' +
                ", arriveDay='" + arriveDay + '\'' +
                ", leaveDay=" + leaveDay +
                ", reason='" + reason + '\'' +
                '}';
    }
}
