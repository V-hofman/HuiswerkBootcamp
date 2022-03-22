package opdracht5;



public class Time implements Comparable<Time>{

    private int hour;
    private int minute;
    private int second;

    public Time(int hour,int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public int compareTo(Time t) {
        int second1 = t.getSecond();
        int minute1 = t.getMinute();
        int hour1 = t.getHour();
        if(this.hour > hour1)
        {
            return 1;
        }
        if(this.hour == hour1 && this.minute > minute1)
        {
            return 1;
        }
        if(this.hour == hour1 && this.minute == minute1 && this.second > second1)
        {
            return 1;
        }
        return 0;
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        if (this.hour < 10) s.append("0");
        s.append(String.valueOf(this.hour));
        s.append(":");
        if (this.minute < 10) s.append("0");
        s.append(String.valueOf(this.minute));
        s.append(":");
        if (this.second < 10) s.append("0");
        s.append(String.valueOf(this.second));
        return s.toString();
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
