package JavaHomework;

public class Time {
    int hour, minute;

    // Default constructor
    public Time() {
        hour = 0;
        minute = 0;
    }

    // Parameterized constructor
    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    // Member method to add two Time objects and return the resultant Time object
    public Time add(Time t1, Time t2) {
        Time t3 = new Time();

        t3.hour = t1.hour + t2.hour + (t1.minute + t2.minute) / 60;
        t3.minute = (t1.minute + t2.minute) % 60;

        return t3;
    }

    public static void main(String[] args) {
      
        Time t1 = new Time(2, 30);
        Time t2 = new Time(1, 45);

        
        Time t3 = new Time();

        t3 = t3.add(t1, t2);

       
        System.out.println("Resultant Time: " + t3.hour + " hours and " + t3.minute + " minutes");
    }
}
