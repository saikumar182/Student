package collections;

import java.util.Arrays;

public class SecondLargest {
	
	
	public static void main(String []args) {
	
	
		
		
		
	int arr1[] = new int[]{16,16,57,98,7,65};
	

		
	int min= arr1[0];

for (int i=0;i<=arr1.length -1;i++) {
	
	if (arr1[i] <min) {
		
		min=arr1[i];
	}
}

System.out.println("the smallest number in the series :" +min);
}

}

//
//public class SecondLargest{  
//public static int getSecondLargest(int[] a, int total){  
//int temp;  
//for (int i = 0; i < total; i++)   
//        {  
//            for (int j = i + 1; j < total; j++)   
//            {  
//                if (a[i] > a[j])   
//                {  
//                    temp = a[i];  
//                    a[i] = a[j];  
//                    a[j] = temp;  
//                }  
//            }  
//        }  
//       return a[total-2];  
//}  
//public static void main(String args[]){  
//int a[]={1,2,5,6,3,2};  
//int b[]={44,66,99,77,33,22,55};  
//System.out.println("Second Largest: "+getSecondLargest(a,6));  
//System.out.println("Second Largest: "+getSecondLargest(b,7));  
//}}  