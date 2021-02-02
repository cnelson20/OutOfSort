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

  public static void selectionSort(int[] data) {
    int temp;
    for (int i = 0; i < data.length- 1; i++) {
      int min_key = i;
      for (int j = i + 1; j < data.length; j++) {
        if (data[j] < data[min_key]) {
          min_key = j;
        }
      }
      temp = data[min_key];
      data[min_key] = data[i];
      data[i] = temp;
    }
  }

  public static void insertionSort(int[] data) {
    int temp;
    for (int i = 1; i < data.length; i++) {
      temp = data[i];
      int j;
      for (j = i - 1; j >= 0 && temp < data[j]; j--) {
        data[j+1] = data[j];
      }
      data[j+1] = temp;
    }
  }
}
