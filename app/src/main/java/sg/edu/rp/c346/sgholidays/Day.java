package sg.edu.rp.c346.sgholidays;

/**
 * Created by 15017608 on 27/4/2017.
 */

public class Day {
    private String name;
    private String day;
    private String desc;

    public Day(String name, String day, String desc) {
        this.name = name;
        this.day = day;
        this.desc = desc;
    }
    public String getName() {
        return name;
    }
    public String getDay() {
        return day;
    }
    public String getDesc() {
        return desc;
    }
}
