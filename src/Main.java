import model.*;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        Account testAccount = new Account("Sebastian", "B");

        Day day1 = new Day(1,new Accommodation("Hotel Iceland",new Address("Reykjavik","Street 1"),new BigDecimal(150),true));
        day1.addPlace(new Attraction("Wodospad",new Address("Keflavik","Waterfall 1")));
        day1.addPlace(new Attraction("Wody termalne",new Address("Sogofoss","thermal wather 1")));
        Trip trip = new Trip();
        trip.addDay(day1);

        System.out.println(trip);
    }
}
