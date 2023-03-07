public class MaxValue {
    public static String maximumString(String a, String b, String c) {
        String maximumValue = a;
        if (b.compareTo(maximumValue) > 0)
            maximumValue = b;
        if (c.compareTo(maximumValue) > 0)
            maximumValue = c;
        System.out.println(a+" "+b+" "+c);
        return maximumValue;
    }

    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue();
        System.out.println("Maximum value of String : "+maxValue.maximumString("apple", "peach", "banana"));
    }
}
