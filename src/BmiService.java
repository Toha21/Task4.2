public class BmiService {

    public double calculate(double weight, double height) {

        double heightSquared = height * height; // рост в метрах квадратных
        double calculate = weight / heightSquared;
        return calculate;
    }
}
