package activities;

import java.util.Arrays;

public class Activity4 {

	
	static void ascendingArrSort(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			int k=arr[i];
			int j=i-1;
			
			while(j>=0 && k<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=k;
		}
	}
	
	public static void main(String[] args) {
      int randNum[] = {10,2,4,5,12,16,1,8,20};
       ascendingArrSort(randNum);
       System.out.println("Sorted array in ascending order: " + Arrays.toString(randNum));
      
	}

}
