package Sapxepchon;

public class SelectionSort {
    static double[] list = {1,4.3,6.5,8,1,7};
     public static void selectionSort(double[] list){
         for(int i = 0; i < list.length - 1; i++){
             double currentMin = list[i];
             int currenMinIndex = i;

             for(int j = i + 1; j< list.length; j++){
                 if(currentMin > list[j]){
                     currentMin = list[j];
                     currenMinIndex = j;
                 }
             }
             if(currenMinIndex != i){
                 list[currenMinIndex] = list[i];
                 list[i] = currentMin;
             }
         }

     }

    public static void main(String[] args) {
        selectionSort(list);
        for(int i = 0; i < list.length; i++){
            System.out.println(list[i] + " ");
        }
    }
}
