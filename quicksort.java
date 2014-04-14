public class QuickSort {  
      
    public static void quickSort(int[] array) {  
        quickSort(array, 0, array.length - 1);  
    }  
      
    public static void quickSort(int[] array, int low, int high) {  
        if(low < high) {  
            int pivotLoc = partition(array, low, high); 
            quickSort(array, low, pivotLoc - 1); //对低子表递归排序  
            quickSort(array, pivotLoc + 1, high); //对高子表递归排序  
        }  
           
    }  
    //交换数组array[]中子组中的记录位置  
    private static int partition(int[] array, int low, int high) {  
        int pivotKey = array[low]; //用子表的低位做枢轴  
        while(low < high) {  
            while(low < high && array[high] >= pivotKey) high--;  
            array[low] = array[high]; //将比枢轴小的记录移到低端  
            while(low < high && array[low] <= pivotKey) low++;  
            array[high] = array[low]; //将比枢轴大的记录移到高端  
        }   
        array[low] = pivotKey; //枢轴值放在中间  
        return low; //返回枢轴位置  
    }  
      
    public static void main(String[] args) {  
        int[] array = {2, 1, 4, 3, 9, 6, 7, 5, 4, 8, 0};  
        quickSort(array);  
        for(int i : array) { //输出排序好的数组  
            System.out.print(i);  
        }  
    }  
}  
