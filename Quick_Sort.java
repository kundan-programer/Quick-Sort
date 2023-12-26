import java.util.Scanner;

class quicksort {

  int partition(int a[], int start, int end) {

    int pivot = a[end];
    int pindex = start;

    for (int i = start; i <= (end - 1); i++) {

      if (a[i] <= pivot) {
        int temp = a[pindex];
        a[pindex] = a[i];
        a[i] = temp;
        pindex++;
      }
    }

    int temp = a[pindex];
    a[pindex] = a[end];
    a[end] = temp;
    return (pindex);
  }

  void quick1(int arr[], int start, int end) {
    if (start < end) {
      int p = partition(arr, start, end);
      quick1(arr, start, p - 1);
      quick1(arr, p + 1, end);
    }
  }
}

public class Quick_Sort {

  public static void main(String[] args) {
    int a[], n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of array: ");
    n = sc.nextInt();

    a = new int[n];

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    quicksort q1 = new quicksort();
    q1.quick1(a, 0, n - 1);

    System.out.print("The sorted array is: ");
    for (int i = 0; i < n; i++) {
      System.out.print(a[i] + " ");
    }

  }

}
