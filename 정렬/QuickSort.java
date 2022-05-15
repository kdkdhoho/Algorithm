public class QuickSort {
  static int[] A = { 9, 7, 5, 11, 12, 2, 14, 3, 10, 6 };

  public static void main(String[] args) {
    quickSort(0, A.length - 1);

    for (int i = 0; i < A.length; i++)
      System.out.printf("%d ", A[i]);
  }

  static void quickSort(int left, int right) {
    int pivot = left;
    int l = left + 1;
    int r = right;

    if (l < r) {
      while (true) {
        while (l <= right && A[l] < A[pivot])
          l++;

        while (r >= left && A[r] > A[pivot])
          r--;

        if (l < r)
          swap(l, r);
        else {
          swap(pivot, r);
          break;
        }
      }

      quickSort(left, r - 1);
      quickSort(r + 1, right);
    }
  }

  static void swap(int a, int b) {
    int tmp = A[a];
    A[a] = A[b];
    A[b] = tmp;
  }
}