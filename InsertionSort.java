public class InsertionSort {
    public void Sort(int[] intArray){
        for (int index=1; index<intArray.length; index++){
            int newElement = intArray[index];
            int i;
            for(i=index; i>0 && intArray[i-1]>newElement; i--){
                intArray[i] = intArray[i-1];
            }
            intArray[i] = newElement;
        }
    }
}


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        InsertionSort sorter1 = new InsertionSort();
        sorter1.Sort(intArray);
        System.out.println(Arrays.toString(intArray));
  }

}
