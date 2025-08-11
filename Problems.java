import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

class Problems{
  public static void main(String[] arg){
    // System.out.println(firstNonRepeatingCharacter("aabbcdde"));
    // int[] arr = {2,7,11,15,6,5};
    // System.out.println(Arrays.toString(twoSum(arr, 11)));
    // int[] arr = {6,9,1,3,7,5};4
    // int[] unSortedArray = generateUnSortedArray(100000);
    // System.out.println(Arrays.toString(unSortedArray));
    //
    // System.out.println(Arrays.toString(sortColors(unSortedArray)));

    // Time calculation for array generation
            long startTimeCreate = System.currentTimeMillis();
            int[] unSortedArray = generateUnSortedArray(1000000);
            long endTimeCreate = System.currentTimeMillis();
            long durationCreate = endTimeCreate - startTimeCreate;

            // Time calculation for sorting
            long startTimeSort = System.currentTimeMillis();
            int[] sortedArray = sortColors(unSortedArray);
            // Arrays.sort(unSortedArray);
            long endTimeSort = System.currentTimeMillis();
            long durationSort = endTimeSort - startTimeSort;

            System.out.println("Time consumed for creating the array: " + durationCreate + " ms");
            System.out.println("Time consumed for sorting the array: " + durationSort + " ms");

            // You may want to comment out the print statements for the arrays,
            // as printing a 100,000-element array will take a significant amount of time
            // and clutter the console.
            // System.out.println(Arrays.toString(unSortedArray));
            // System.out.println(Arrays.toString(sortedArray));
  }

  // aabbccdde -> a - 2, b - 2, c - 2, d - 2, e - 1
  public static Character firstNonRepeatingCharacter(String str){
    HashMap<Character, Integer> map = new HashMap<>();
    for(Character ch : str.toCharArray()){
      if(map.get(ch) == null || map.get(ch) == 0){
        map.put(ch,1);
      }
      else{
        map.put(ch,map.get(ch)+1);
      }
    }
    for(var e : map.entrySet()){
      if(e.getValue() == 1){
        return e.getKey();
      }
    }
    return 'n';
  }

  // [2,7,11,15], target=9 -> [0,1]
  public static int[] twoSum(int[] arr, int target){
    int[] sumArr = new int[2];
    for(int i=0;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i] + arr[j] == target){
          sumArr[0] = i;
          sumArr[1] = j;
        }
      }
    }
    return sumArr;
  }

  public static int[] twoSumUsingHashMap(int[] arr, int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
      int current = arr[i];
      int needed = target - current;
      if(map.containsKey(needed)){
        return new int[] {map.get(needed),i};
      }
      map.put(current, i);
    }
    throw new IllegalArgumentException("No two sum");
  }

  // [1,2,1,0,2] -> [0,1,1,2,2]
  public static int[] sortColors(int[] arr){
    for(int i=0;i<arr.length;i++){
      for(int j=i+1;j<arr.length;j++){
        if(arr[i] > arr[j]){
          //a = 10, b = 5 -> a = a+ b => 15, b = a-b => 10, a => a - b => 5
          arr[i] = arr[i] + arr[j];
          arr[j] = arr[i] - arr[j];
          arr[i] = arr[i] - arr[j];
        }
      }
    }
    return arr;
  }

  private static int[] generateUnSortedArray(int size){
    int[] unSortedArray = new int[size];
    Random rand = new Random();
    for(int i=0;i<size;i++){
      unSortedArray[i] = rand.nextInt(1000);
    }
    return unSortedArray;
  }
  private static void swap(int[] arr, int i, int j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  // [2,4,6,10,1,6,9,8], 0, n-1
  //              P
  // [2,4,6,1,6,8,10,9]
  public int partition(int[] arr, int low, int high){
    int pivot = arr[high];
    int i = low - 1;
    for(int j=0;j<high-1;j++){
      if(arr[j] < pivot){
        i++;
        swap(arr,i,j);
      }
      Systen.out.println(Arrays.toString(arr));
      return i+1;
    }

  }
  static void quickSort(int[] arr, int low, int high){
    if(low < high){
      int pi = partition(arr,low, high);
      quickSort(arr,low, pi-1);
      quickSort(arr,pi+1,high);
    }
  }
}
