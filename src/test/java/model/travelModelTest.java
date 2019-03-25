package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * Unit test for travel model
 */
class travelModelTest {

    private Account testAccount;

    @BeforeEach
    void setTestUp() {
        testAccount = new Account("Sebastian", "B");
        Trip trip = new Trip();
        Day day1 = new Day(1, new Accommodation("The Base by Keflavik Airport", new Address("Keflavik", "Valhallarbraut 756"), new BigDecimal(238), true));
        trip.addDay(day1);
        Day day2 = new Day(2, new Accommodation("The Capital-Inn", new Address("Reykjavík", "Sudurhlid 35D"), new BigDecimal(260), true));
        day2.addPlace(new Attraction("Hallgrimskirkja", new Address("Reykjavik", "Hallgrímstorg 101")));
        day2.addPlace(new Attraction("Best hot-dogs", new Address("Reykjavik", "Tryggvagata 1")));
        trip.addDay(day2);
        testAccount.setTrip(trip);
    }

    @Test
    void shouldReturnAddressOfSecondAttractionInDay2() {
        Address testAddress = new Address("Reykjavik", "Tryggvagata 1");
        Assertions.assertThat(testAccount.getTrip()
                .getDays().get(1)
                .getAttractions().get(1)
                .getAddress()).isEqualTo(testAddress);
    }
}