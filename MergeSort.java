import java.util.Arrays;

public class MergeSort {

  int[] sort(int[] arr) {
    int n = arr.length;
    if (n < 2) {
      return arr;
    }
    int mid = Math.round(n / 2);
    int[] left = new int[mid];
    int[] right = new int[n - mid];

    for (int i = 0; i < mid; i++) {
      left[i] = arr[i];
    }
    for (int i = mid; i < n; i++) {
      right[i - mid] = arr[i];
    }

    return merge(sort(left), sort(right));
  }

  int[] merge(int[] left, int[] right) {
    int i = 0, j = 0, k = 0;
    int[] result = new int[left.length + right.length];
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        result[k++] = left[i++];
      } else {
        result[k++] = right[j++];
      }
    }
    while (i < left.length) {
      result[k++] = left[i++];
    }
    while (j < right.length) {
      result[k++] = right[j++];
    }
    return result;
  }

  public static void main(String[] args) {
    MergeSort ms = new MergeSort();
    int[] arr = { 4, 8, 2, 6, 0, 2, 1, 4 };
    System.out.println(Arrays.toString(ms.sort(arr)));
  }
}
