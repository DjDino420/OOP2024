package oop.labor02.date;

public class DateUtil {
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidDate(MyDate date) {
        if (date.getYear() < 1 || date.getMonth() < 1 || date.getMonth() > 12 || date.getDay() < 1) {
            return false;
        }

        int maxDaysInMonth;

        switch (date.getMonth()) {
            case 4: case 6: case 9: case 11:
                maxDaysInMonth = 30;
                break;
            case 2:
                maxDaysInMonth = leapYear(date.getYear()) ? 29 : 28;
                break;
            default:
                maxDaysInMonth = 31;
        }
        return date.getDay() <= maxDaysInMonth;
    }

}

