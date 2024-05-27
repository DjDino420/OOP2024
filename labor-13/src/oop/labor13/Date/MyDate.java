package oop.labor13.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public MyDate (int year,int month,int day) throws InvalidDateException{
        if(DateUtil.isValidDate(year,month,day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
        else throw new InvalidDateException("INVALID DATE");
    }

    public int getYear() {return this.year; }

    public int getMonth() {
        return this.month;
    }

    public int getDay() {
        return this.day;
    }
    public String toString() {
        return String.format("%04d-%02d-%02d", year, month, day);
    }
}
