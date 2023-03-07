public class MaxValue<T extends Comparable<T>> {
    T num1, num2, num3;

    public <T extends Comparable<T>> T maximumGeneric(T num1, T num2, T num3) {
        T maximumValue = num1;
        if (num2.compareTo(maximumValue) > 0)
            maximumValue = num2;
        if (num3.compareTo(maximumValue) > 0)
            maximumValue = num3;
        System.out.println(num1 + " " + num2 + " " + num3);
        return maximumValue;
    }

    public static void main(String[] args) {
        MaxValue maximum = new MaxValue();
        System.out.println("Maximum Integer value : " + maximum.maximumGeneric(10, 78, 34));
        System.out.println("Maximum Float value : " + maximum.maximumGeneric(10.3f, 20.9f, 56.2f));
        System.out.println("Maximum String value : " + maximum.maximumGeneric("xyz", "ew", "re"));
    }
}
