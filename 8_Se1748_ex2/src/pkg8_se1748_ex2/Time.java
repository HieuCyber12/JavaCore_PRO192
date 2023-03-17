/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8_se1748_ex2;

/**
 *
 * @author HieuSA
 */
public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    
    public String getTime(){
        return hour+":"+minute+":"+second;
    }
    public String getTimeAMPM(int hour){
     String ampm = "AM";
     if(hour > 12){
         hour -= 12;
         ampm = "PM";
     }
     return hour+":"+minute+":"+second + ampm;
    }
    
    public int addHour(int hourAdd){
        hour += hourAdd;
        while(hour > 23){
            hour -= 24;
        }
        return hour;
    }
    
    public int addMinute(int minuteAdd){
        minute += minuteAdd;
        while(minute > 60){
            minute -= 60;
            hour += 1;
            if(hour > 24)
                   hour -= 24;
        }
        return minute;
    }
    
    public int addSecond(int secondAdd){
        second += secondAdd;
        while(second > 60){
            second -= 60;
            if(minute > 60){
                minute -= 60;
                hour += 1;
            }
            if(hour > 24){
                hour -= 24;
            }        
        }
        return second;
    }
 
}