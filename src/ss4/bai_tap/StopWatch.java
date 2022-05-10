package ss4.bai_tap;


import java.util.Date;

public class StopWatch {

    private long starTime;
    private long endTime;

    public StopWatch() {
    }

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public long getStarTime() {
        return starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long start (){
        return starTime = System.currentTimeMillis();
    }
    public long stop (){
        return endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime-starTime;
    }
}

