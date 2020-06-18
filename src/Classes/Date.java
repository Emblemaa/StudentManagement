package Classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Date {
    private int day;
    private int month;
    private int year;

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Date(int d, int m, int y)
    {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    String now()
    {
        LocalDateTime n = LocalDateTime.now();
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        return dft.format(n);
    }

    public static Date stringToDate(String string)
    {
        String substr = "";
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < string.length(); i++)
        {
            while(i < string.length() && string.charAt(i) != '/' ) {
                substr += string.charAt(i);
                i++;
            }
            arr.add(Integer.valueOf(substr));
            substr = "";
        }
        return new Date(arr.get(0), arr.get(1), arr.get(2));
    }
}
