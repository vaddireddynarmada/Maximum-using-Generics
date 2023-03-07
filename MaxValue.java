import java.util.Arrays;

public class MaxValue<T extends Comparable<T>> {
    T[] maxValue;

    public MaxValue(T[] maxValue) {
        this.maxValue = maxValue;

    }
    public static <T extends Comparable<T>> T[] maximum(T... maxValue) {
        System.out.println("Given elements ");
        for (T element : maxValue) {
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("After Sorting : ");
        Arrays.sort(maxValue);
        for (T element : maxValue) {
            System.out.print(element + " ");
        }
        System.out.println();
        return maxValue;
    }

    public static void main(String[] args) {
        maximum(23, 78, 36,45,23,2,5,78);
        maximum("xyz", "dij", "jsd","drg","wdd");
        maximum(23f, 9f, 4.3f,56.3f,34.2f);
    }
}
