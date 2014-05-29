import java.util.*;
import java.util.Scanner;


//NOTICE: We can use inversion counting to perform a better solution. Will update that method soon.

public class inversion{
	
	static long Insertion_swap_count(int[] arr){
		
		
		if (arr==null || arr.length<=1) return 0;
		
		int len = arr.length;
		
		long count = 0;
		//Here, we want to sort the array to ascending order
		for (int i=1; i<len;i++){
			for (int j=i; j>0; j--){
				if(arr[j]>=arr[j-1]) break;
				//swap a[j] and a[j-1]
				int tmp = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = tmp;
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//type in the number of test cases
		int num_test = in.nextInt();
		
		for (int i=0; i<num_test; i++){
			
			int n = in.nextInt();
			int[] arr = new int[n];
			
			for (int j=0; j<n; j++){
				arr[j] = in.nextInt();
			}
		
			
			//sort(arr);
			long res = insertion_sort_count(arr);
			
			System.out.println(res);
		}
		
		//close the scanner. have checked on stackoverflow
		if(in!=null) in.close();
	}
}
