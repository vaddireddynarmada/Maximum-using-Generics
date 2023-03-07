public class MaxValue<T extends Comparable<T>> {
    T num1;
    T num2;
    T num3;

    public MaxValue(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public static <T extends Comparable<T>> T maximumGenerict(T num1, T num2, T num3) {
        T maximumValue = num1;
        if (num2.compareTo(maximumValue) > 0)
            maximumValue = num2;
        if (num3.compareTo(maximumValue) > 0)
            maximumValue = num3;
        System.out.println(num1+" "+num2+" "+num3);
        return maximumValue;
    }

    public static void main(String[] args) {
        Integer intValue = maximumGenerict(10, 34, 78);
        Float floatValue = maximumGenerict(10.3f, 20.9f, 56.2f);
        String stringValue = maximumGenerict("xyz", "ew", "re");
        System.out.println("Maximum Integer value : " + intValue);
        System.out.println("Maximum Float value : " + floatValue);
        System.out.println("Maximum String value : " + stringValue);

    }
}
