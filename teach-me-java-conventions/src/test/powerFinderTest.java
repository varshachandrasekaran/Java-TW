import org.junit.Test;

public class powerFinderTest {
    @Test
    public void onePowerOne() {
        assert powerFinder.findPower(1,1) == 1;
    }

    @Test
    public void twoPowerOne() {
        assert powerFinder.findPower(2,1) == 2;
    }

    @Test
    public void twoPowerTwo() {
        assert powerFinder.findPower(2, 2) == 4;
    }

    @Test
    public void threePowerTwo() {
        assert powerFinder.findPower(3, 2) == 9;
    }
}

