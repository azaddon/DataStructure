package dsaAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class FindElementInArray {
	static int n;
	static int mid;
	int binarySearch(int array[] , int x, int low ,int high){
		//Arrays.sort(array);
		while(low<= high){
			if((n-1)%2 == 0){
				mid = ((low+(high- low))/2)+1;
			}else{
			 mid = (low+(high - low ))/2;
			}
			if(array[mid] == x){
				return mid;
			}
			if(array[mid]<x){
				low = mid+1;
			}else{
				high =mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementInArray ob = new FindElementInArray();
		//int array[] ={4,3,7,8,2,6,12,14,25};
		int array[] ={3,4,5,6,7,8,9,10};
//		Arrays.sort(array);
//		Arrays.toString(array);
		int x = 8;
		 n= array.length;
		System.out.println(n);
		int result =ob.binarySearch(array, x , 0, n-1);
		if(result == -1){
			System.out.println("Not Found");
		}else{
			System.out.println("Element found is  :: " +result);
		}
	}

}
