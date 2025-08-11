import java.util.Arrays;
class SortingDemo{

  public static void main(String[] arg){
    int[] arr = {2,0,2,1,1,0};
    int n = arr.length;
    quickSort(arr,0,n-1);
    System.out.println(Arrays.toString(arr));
  }

  static int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low - 1;
    for(int j=low;j<high;j++){
      if(arr[j] < pivot){
        i++;
        swap(arr,i,j);
      }
    }

    swap(arr,i+1,high);
    return i+1;
  }

  static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  // [2, 4, 6, 10, 1, 6, 9, 8]
  // [2, 4, 6, 1, 6, 8, 9, 10]
  static void quickSort(int[] arr, int low, int high){
    if(low < high){
      int pi = partition(arr,low,high);
      quickSort(arr,low,pi-1);
      quickSort(arr,pi+1,high);
    }
  }
}
