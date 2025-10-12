package prak_3;

public class task_2_1 {
    public static void main(String[] argc) {
        // #1
        Double d1 = Double.valueOf(5.5);
        Double d2 = Double.valueOf("10.2");
        System.out.println("d1 = " + d1 + ", d2 = " + d2);

        // #2
        String str = "7.8";
        double d3 = Double.parseDouble(str);
        System.out.println("d3 = " + d3);

        // #3
        Double d4 = 15.75;

        System.out.println("byte = " + d4.byteValue());
        System.out.println("short = " + d4.shortValue());
        System.out.println("int = " + d4.intValue());
        System.out.println("long = " + d4.longValue());
        System.out.println("float = " + d4.floatValue());

        // #4
        System.out.println("Double: " + d4);

        // #5
        String result = Double.toString(3.14);
        System.out.println("String: " + result);
    }
}
