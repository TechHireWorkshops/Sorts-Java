import java.util.Arrays;

class InsertionSort {

  void sort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int current = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > current) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = current;
    }
    
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    InsertionSort is = new InsertionSort();
    int arr[] = { 12, 11, 13, 5, 6, 8, 23, 5, 1 };
    is.sort(arr);
  }
}
