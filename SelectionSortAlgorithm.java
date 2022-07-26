.................
Main.java
.................
class Main {
    public static void main(String[] args){
        int array[] = {2,6,4,5,1,8,9,0};
        SelectionSort.selectionSort(array);
        SelectionSort.printArray(array);
          
    }
}
..................................
SelectionSort.java
..................................
public class SelectionSort {

    static void selectionSort(int[] a) {
      for (int j = 0; j < a.length; j++) {
        int minimumIndex = j;
        for (int i = j+1; i<a.length; i++) {
          if (a[i] < a[minimumIndex]) {
            minimumIndex = i;
          }
        }
        if (minimumIndex != j) {
          int temp = a[j];
          a[j] = a[minimumIndex];
          a[minimumIndex] = temp;
        }
      }
    }
  
  
      public static void printArray(int []array) {
          for (int i = 0; i < array.length; i++) {
              System.out.print(array[i]+"  ");
          }
      }
  
  }
  
...........
//////finish///////////
