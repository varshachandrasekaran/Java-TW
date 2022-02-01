import org.junit.Test;

public class powerFinderTest {
    @Test
    public void shouldBeOneWhenPowerOneBaseOne() {
        int expectedValue=1;
        int base=1, power=1;
        assert powerFinder.findPower(base,power)==expectedValue;
    }

    @Test
    public void shouldBetwoWhenPowerOneBaseTwo() {
        int expectedValue=2;
        int base=2, power=1;
        assert powerFinder.findPower(base,power)==expectedValue;
    }

    @Test
    public void shouldBeFourWhenPowerTwoBaseTwo() {
        int expectedValue=4;
        int base=2, power=2;
        assert powerFinder.findPower(base,power)==expectedValue;
    }

    @Test
    public void shouldBeNineWhenPowerTwoBaseThree() {
       int expectedValue=9;
       int base=3, power=2;
       assert powerFinder.findPower(base,power)==expectedValue;
    }
}

