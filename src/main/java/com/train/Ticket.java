package com.train;

public class Ticket {
    int run1;
    int run2;

    public Ticket(int run1, int run2) {
        this.run1 = run1;
        this.run2 = run2;
    }

    public int cal(){
        double cal = (run1-run2)*1000 + (run2*2000)*0.9;
        int ical = (int) cal;
        return ical;
    }
}
