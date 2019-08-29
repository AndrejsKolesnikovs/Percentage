import com.google.common.base.CharMatcher;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkOne {

    public double percentage(Integer a, Integer b) {
        return a * 100 / b;
        // "a" - is a TotalScore ; "b" - is a ObtainedScore
    }

    public double fuelConsumption(Integer kilometersDriven, Integer fuelSpent) {
        return fuelSpent * 100 / kilometersDriven;
    }

    @Test
    public void showPercentage() {
        double c;
        // "c" - is a Percent of a Number
        c = percentage(34, 100);

        System.out.println(" Percent of a Number is: \n " + c + " %");

//        Assertions.assertEquals(35, c, "Something goes wrong!");
    }

    @Test
    public void showFuelConsumption() {
        double kmPerLiter;

        kmPerLiter = fuelConsumption(999, 49);

        System.out.println(" Fuel consumption of the car is: \n " + kmPerLiter + " liters");

//        Assertions.assertEquals(5.0, kmPerLiter, "Something goes wrong!");
    }

    @Test
    public void charCount() {
        int count;

        count = CharMatcher.is('e').countIn("Hello world");
        //Guava dependency

        Assertions.assertEquals(9991, count, "NOTE: Actual - number of characters or letters in a text.");
    }
}
