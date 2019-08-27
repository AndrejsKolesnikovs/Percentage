import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkOne {

    public double percentage(Integer a, Integer b) { // "a" - is a TotalScore ; "b" - is a ObtainedScore
        return a * 100 / b;
    }

    public double fuelConsumption(Integer kilometersDriven, Integer fuelSpent) {
        return fuelSpent * 100 / kilometersDriven;
    }

    @Test
    public void showPercentage() {
        double c; // "c" - is a Percent of a Number

        c = percentage(34, 100);

        System.out.println(" Percent of a Number is: \n " + c + " %");

//        Assertions.assertEquals(33, c, "Something goes wrong!");
    }

    @Test
    public void showFuelConsumption() {
        double kmPerLiter;

        kmPerLiter = fuelConsumption(999, 49);

        System.out.println(" Fuel consumption of the car is: \n " + kmPerLiter + " liters");

//        Assertions.assertEquals(4.0, kmPerLiter, "Something goes wrong!");
    }

}
