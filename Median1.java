import java.util.Arrays;

public class Median1 {

  public static void main(String[] args) {
    int[] array1 = {
      10,
      2,
      38,
      22,
      38,
      23
    };
    System.out.println("Original array: " + Arrays.toString(array1));
    System.out.println("Median of the array: " + findMedian(array1));

    int[] array2 = {
      10,
      2,
      38,
      23,
      38,
      23,
      21
    };
    System.out.println("Original array: " + Arrays.toString(array2));
    System.out.println("Median of the array: " + findMedian(array2));
  }

  public static double findMedian(int[] array) {

    Arrays.sort(array);

    int length = array.length;
    double median;

    if (length % 2 == 0) {
      median = (array[length / 2 - 1] + array[length / 2]) / 2.0;
    } else {
      median = array[length / 2];
    }

    return median;
  }
}
