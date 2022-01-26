package Newcom.klass;

public class Time {
    private int hour;
    private int minute;
    private int second;
    private int allSecond;
    public Time(int hour, int minute, int second ){
        this.hour=hour;
        this.minute=minute;
        this.second=second;


    }
    public Time (int allSecond){
        this.allSecond=allSecond;
    }
    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond (){
        return second;
    }
    public int getAllSecond(){
        return allSecond;
    }

    public void setHour(int hour) {
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setAllSecond(int allSecond){
        this.allSecond=allSecond;
    }
    public void getTime(){
        System.out.println();

    }
}

