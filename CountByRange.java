public static int lowerBound(int[] arr, int target, int start, int end) {
  while (start < end) {
    int mid = (start + end) / 2;

    if (target <= arr[mid])
      end = mid;
    else
      start = mid + 1;
  }

  return end;
}

public static int upperBound(int[] arr, int target, int start, int end) {
  while (start < end) {
    int mid = (start + end) / 2;

    if (target < arr[mid])
      end = mid;
    else
      start = mid + 1;
  }

  return end;
}

public static int countByRange(int[] arr, int leftValue, int rightValue) {
  int leftIndex = lowerBound(arr, leftValue, 0, arr.length);
  int rightIndex = upperBound(arr, rightValue, 0, arr.length);

  return rightIndex - leftIndex;
}