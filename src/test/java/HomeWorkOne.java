import org.junit.jupiter.api.Test;

public class HomeWorkOne {

    public double percentage(Integer a, Integer b) {
        return a * 100 / b;
    }
// "a" - is a TotalScore ; "b" - is a ObtainedScore

    @Test
    public void showPercentage() {
        double c;
// "c" - is a Percent of a Number

        c = percentage(34, 101);

        System.out.println(" Percent of a Number is: \n " + c + "%");

    }
}
