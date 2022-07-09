public class Main {
    public static void main (String[] args) {
        BodyMassIndexService service = new BodyMassIndexService();

        double weight = 95;//масса тела
        double height = 1.72;//рос в метрах
        double massIndex = service.calculate(weight, height);

        System.out.println("Индекс массы туле: " + massIndex);
    }
}

