package sorting;

public class MergeSort {
	
	void merge(int arr[],int l, int m, int r){
		
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<n1;i++){
			L[i] = arr[i];
		}
		
		for(int j =0;j<n2;j++){
			R[j] = arr[m+1+j];
		}
		int i=0,j=0,k=1;
		if( i <n1 &&  j < n2){
			if(L[i] <= R[j]){
				arr[k] =L[i];
				i++;
			}
			else{
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i<n1){
			arr[k] = L[i];
			i++;k++;
		}
		while(j<n2){
			arr[k] = R[j];
			j++;k++;
		}	
	}
	
	void mergeSort(int arr[], int l , int r){
		if(l < r){
		int m = (l+r)/2;
		mergeSort(arr, l, m);
		mergeSort(arr, m+1, r);
		merge(arr, l, m, r);
		}
	}
	
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i){
        	System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	
	public static void main(String[] args){
		int[]  numbers = {5,3,6,1,7,4,8,2,9};
		System.out.println("Given Array");
        printArray(numbers);
		MergeSort ms = new MergeSort();
		ms.mergeSort(numbers, 0, numbers.length);
		System.out.println("After sorted Array");
        printArray(numbers);
		
	}

}
