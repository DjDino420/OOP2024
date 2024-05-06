package labor10_2;

public class DateUtil {
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isValidDate(int year,int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int maxDaysInMonth;

        switch (month) {
            case 4: case 6: case 9: case 11:
                maxDaysInMonth = 30;
                break;
            case 2:
                maxDaysInMonth = leapYear(2024) ? 29 : 28;
                break;
            default:
                maxDaysInMonth = 31;
        }
        return day <= maxDaysInMonth;
    }

}

