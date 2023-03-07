public class MaxValue {
    public Integer maximumInteger(Integer a, Integer b, Integer c) {
        Integer maximumValue = a;
        if (b.compareTo(maximumValue) > 0)
            maximumValue = b;
        if (c.compareTo(maximumValue) > 0)
            maximumValue = c;
        return maximumValue;
    }
    public static void main(String[] args){
        MaxValue maxValue=new MaxValue();
        System.out.println("Maximum Value of Integer : "+maxValue.maximumInteger(12,14,23));
    }
}
