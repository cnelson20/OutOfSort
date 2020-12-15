public class Sorts {

  public static void bubbleSort(int[] data) {
    int sorts;
    int temp;
    do {
      sorts = 0;
      for (int i = 0; i < data.length - 1; i++) {
        if (data[i] > data[i+1]) {
          sorts++;
          temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
        }
      }
    } while (sorts > 0);
  }
}
