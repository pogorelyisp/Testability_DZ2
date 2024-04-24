public class Main {
    public static void main(String[] args) {
        BmiService bmiCalculator = new BmiService();
        double height = 1.87;
        int weight = 98;
        int bmi = bmiCalculator.calculate(weight, height);

        System.out.println("Ваш индекс массы тела " + bmi);

    }
}