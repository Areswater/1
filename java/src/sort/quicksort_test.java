package sort;

import java.util.Arrays;

public class quicksort_test {
	public static void main(String args[]){
		int a[]={ 2, 1, 6, 7, 8, 5, 3, 5 };
		System.out.println(Arrays.toString(a));
		qsort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public static void qsort(int a[],int low,int high)
	{
		int i = low;
		int j = high;
		int temp = a[low];
		while (i<j){
			while (i<j&&temp<=a[j]){
				j--;
			}
			a[i]=a[j];
			while(i<j&&a[i]<=temp){
				i++;
			}
			a[j]=a[i];
		}
		a[i]=temp;
		System.out.println(Arrays.toString(a));
		if(i>low)
		qsort(a,low,i-1);
		if(i<high)
		qsort(a,i+1,high);
		
	}
}
