package EnumeratedTypes.Task1;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekday(){
        return this != SATURDAY && this != SUNDAY;
    }

    boolean isHoliday(){
        return this == SATURDAY || this == SUNDAY;
    }

    void whichIsGreater(Weekday weekday){
        if(this.ordinal() < weekday.ordinal()){
            System.out.printf("%s is greater %s", weekday,this);
        } else {
            System.out.printf("%s is greater than %s",this,weekday);
        }
    }



}
