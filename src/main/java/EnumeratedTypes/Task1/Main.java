package EnumeratedTypes.Task1;

public class Main {

    public static void main(String[] args) {
        System.out.println("Friday is a holiday? :" + Weekday.FRIDAY.isHoliday());
        System.out.println("Friday is a holiday? :" + Weekday.FRIDAY.isWeekday());
        Weekday weekday = Weekday.FRIDAY;
        weekday.whichIsGreater(Weekday.THURSDAY);
    }
}
