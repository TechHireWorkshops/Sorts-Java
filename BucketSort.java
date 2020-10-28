import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BucketSort {
  public void bucketSort(Integer[] arr, int bucketSize) {
    if (arr.length <= 0) {
      return;
    }
    int min = Collections.min(Arrays.asList(arr));
    int max = Collections.max(Arrays.asList(arr));
    int numberOfBuckets = Math.round((max - min) / bucketSize) + 1;
    ArrayList<ArrayList<Integer>> bucketContainer = new ArrayList<ArrayList<Integer>>();

    for (int i = 0; i < numberOfBuckets; i++) {
      bucketContainer.add(new ArrayList<Integer>());
    }

    for (int i = 0; i < arr.length; i++) {
      int bucketIndex = Math.round((arr[i] - min) / bucketSize);
      bucketContainer.get(bucketIndex).add(arr[i]);
    }

    for (int i = 0; i < numberOfBuckets; i++) {
      Collections.sort((bucketContainer.get(i)));
    }

    // Get the sorted array
    int index = 0;
    for (int i = 0; i < numberOfBuckets; i++) {
      for (int j = 0; j < bucketContainer.get(i).size(); j++) {
        arr[index++] = bucketContainer.get(i).get(j);
      }
    }
    System.out.println(Arrays.toString(arr));
  }

  // Driver code
  public static void main(String[] args) {
    BucketSort b = new BucketSort();
    Integer[] arr = { 5, 8, 1, 6, 2, 6, 1, 0, 5, 2, 3 };
    b.bucketSort(arr, 2);
  }
}