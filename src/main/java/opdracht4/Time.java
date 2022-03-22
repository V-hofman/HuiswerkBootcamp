package opdracht4;

public class Time implements Comparable<Time> {

    private int year;
    private int month;
    private int day;

    public Time(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int compareTo(Time d) {
        int day1 = d.getDay();
        int month1 = d.getMonth();
        int year1 = d.getYear();
        if(this.year > year1)
        {
            return 1;
        }
        if(this.year == year1 && this.month > month1)
        {
            return 1;
        }
        if(this.year == year1 && this.month == month1 && this.day > day1)
        {
            return 1;
        }
        return 0;

    }

    public String getMonthName() {
        switch (this.month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return null;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(this.year));
        s.append("-");
        if (this.month < 10) s.append("0");
        s.append(String.valueOf(this.month));
        s.append("-");
        if (this.day < 10) s.append("0");
        s.append(String.valueOf(this.day));
        return s.toString();
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
