public class Main {
        public static void main(String[] args) {
            BmiService service = new BmiService();
            double weight = 95;//вес
            double height = 1.72;//рос в метрах
            double massIndex = service.calculate(weight,height);
            System.out.println("Индекс массы тула :" + massIndex);
        }
    }

