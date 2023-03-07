public class MaxValue {
    public Float maximumFloat(Float a, Float b, Float c) {
        Float maximumValue = a;
        if (b.compareTo(maximumValue) > 0)
            maximumValue = b;
        if (c.compareTo(maximumValue) > 0)
            maximumValue = c;
        return maximumValue;

    }
    public static void main(String[] args){
        MaxValue maxValue=new MaxValue();
        System.out.println(maxValue.maximumFloat(20.2F,15.14F,18.23F));
    }
}
