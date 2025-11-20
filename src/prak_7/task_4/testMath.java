package prak_7.task_4;

public class testMath {
    public static void main(String[] argc) {
        MathFunc math = new MathFunc();

        System.out.println("5^2=" + math.power(5, 2));
        System.out.println("|4 + 3i|=" + math.complexModulus(4, 3));
        System.out.println("Окружность с радиусом 5 имеет длину - " + math.CircleLength(5));
        System.out.println("Окружность с радиусом 5 имеет площадь - " + math.CircleArea(5));
    }
}
