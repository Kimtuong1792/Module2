package ss4.bai_tap;


import java.util.Date;

public class StopWatch {

    private Date startTime;
    private Date endTime;
    private Date elapsedTime;


    public Date getStartTime() {

        return startTime;
    }

    public void setStartTime(Date startTime)
    {
        this.startTime = startTime;
    }

    public Date getEndTime()
    {
        return endTime;
    }

    public void setEndTime(Date endTime) {

        this.endTime = endTime;
    }

    // Create constructor khong co tham so
    public StopWatch() {
        this.startTime = new Date(); // get current date
    }

    private void start() {
        this.startTime = new Date(); // reset starttime
    }

    private void stop() {
        this.endTime = new Date(); // reset starttime
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    private long elapsedTime() {
        return 0;
    }

    public static void main(String[] args) {





}}

