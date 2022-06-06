package BAI_TAP_LAM_THEM.BAI_1.MODEL;

import java.time.LocalDate;

public class VIP extends Patient {
    private String typeVIP;
    private LocalDate time;

    public VIP() {
    }

    @Override
    public String getInFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s"
                , super.getId()
                , super.getNumberPatient()
                , super.getIdCode()
                , super.getName()
                , super.getArriveDay()
                , super.getLeaveDay()
                , super.getReason()
                , this.getTypeVIP()
                , this.getTime());
    }

    public VIP(String typeVIP, LocalDate time) {
        this.typeVIP = typeVIP;
        this.time = time;
    }

    public VIP(String id,
               String numberPatient,
               String idCode,
               String name,
               LocalDate arriveDay,
               LocalDate leaveDay,
               String reason,
               String typeVIP,
               LocalDate time) {
        super(id, numberPatient, idCode, name, arriveDay, leaveDay, reason);
        this.typeVIP = typeVIP;
        this.time = time;
    }


    public String getTypeVIP() {
        return typeVIP;
    }

    public void setTypeVIP(String typeVIP) {
        this.typeVIP = typeVIP;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeVIP='" + typeVIP + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
