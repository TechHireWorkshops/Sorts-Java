import java.util.Arrays;

class QuickSort {

  int partition(int arr[], int low, int high) {
    int pivot = arr[high];
    int i = low;
    for (int j = low; j < high; j++) {
      if (arr[j] < pivot) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
      }
    }

    int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;

    return i;
  }

  void sort(int[] arr, int low, int high) {
    if (low < high) {

      int pi = partition(arr, low, high);

      sort(arr, low, pi - 1);
      sort(arr, pi + 1, high);
    }
  }

  public static void main(String args[]) {
    int arr[] = { 10, 7, 8, 9, 1, 5 };

    QuickSort ob = new QuickSort();
    ob.sort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }
}