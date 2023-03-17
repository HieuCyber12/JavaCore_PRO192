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
public class DateTime extends Time {
    private int day;
    private int month;
    private int year;
    int second = this.getSecond();
    int minute = this.getMinute();
    int hour = this.getHour();
    
    public DateTime(int day, int month, int year, int hour, int minute, int second) {
        super(hour, minute, second);
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public int addHour(int hourAdd){
        hour += hourAdd;
        while(hour > 23){
            hour -= 24;
            day += 1;
        }
        return hour;
    }
    
    @Override
    public int addMinute(int minuteAdd){
        minute += minuteAdd;
        while(minute > 60){
            minute -= 60;
            hour += 1;
            if(hour > 24){
                hour -= 24;
                day += 1;
            }           
        }
        return minute;
    }
    
    @Override
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
                day += 1;
            }        
        }
        return second;
    }
    public int addYear(int yearAdd){
        year += yearAdd;
        return year;
    }
    public int addMonth(int monthAdd){
        month += monthAdd;
        while(month > 12){
            month -= 12;
            year += 1;
        }
        return month;
    }
    
//    public int addDay(int dayAdd){
//        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))){
//            if(day > 29 && month == 2){
//                day -= 29;
//                month += 1;
//            }
//            while(day > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)){
//                day -= 31;
//                month += 1;
//                if (month > 12){
//                    month -= 12;
//                    year += 1;
//                }
//            }
//            while (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)){
//                day -= 30;
//                month += 1;
//            }
//        }
//        return day;
//    }
    
}
