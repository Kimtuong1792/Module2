package BAI_TAP_LAM_THEM.BAI_1.MODEL;

import java.time.LocalDate;

public class Normal extends Patient{
    private Double costs;


    public Normal(String id,
            String numberPatient,
                  String idCode,
                  String name,
                  LocalDate arriveDay,
                  LocalDate leaveDay,
                  String reason,
                  Double costs) {
        super(id,numberPatient, idCode, name,
                arriveDay, leaveDay, reason);
        this.costs = costs;
    }

    public Double getCosts() {
        return costs;
    }

    public void setCosts(Double costs) {
        this.costs = costs;
    }

    @Override
    public String getInFor() {return
            String.format("%s,%s,%s,%s,%s,%s,%s,%s"
                    , super.getId()
                    , super.getNumberPatient()
                    , super.getIdCode()
                    , super.getName()
                    , super.getArriveDay()
                    , super.getLeaveDay()
                    , super.getReason()
                    , this.getCosts());

    }

    @Override
    public String toString() {
        return super.toString()+
                "costs=" + costs +
                '}';
    }
}
