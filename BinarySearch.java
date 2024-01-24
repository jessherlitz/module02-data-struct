public class BinarySearch {
 
  

  public static int binarySearch(int[] array, int target) {
    int left = 0;
    int right = array.length - 1;

    while (left < right) {
      int middle = (left + right) / 2;
      if (target < array[middle]) {
        right = middle - 1;
      } else if (target > array[middle]) {
        left = middle + 1;
      } else {
        return middle;
      }
    }
    return -1;
  }
}
