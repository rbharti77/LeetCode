package com.rajcoding;

public class DupZeros 
{
	public void duplicateZeros(int[] arr) 
    {
        int numOfZeros = 0;
    for (int num : arr) {
      numOfZeros += num == 0 ? 1 : 0;
    }
    int i = arr.length - 1;
    int j = arr.length + numOfZeros - 1;
    System.out.println("Part 1 I & J are "+i+" & "+j);
    while (i != j) {
    	System.out.println("\nBefore Insert Part 2 I & J are "+i+" & "+j);
      insert(arr, i, j--);
      
      System.out.println("\nPart 2 I & J are "+i+" & "+j);
      for (int num : arr) 
		{
			System.out.print(num+",");
		}
      if (arr[i] == 0) {
    	  System.out.println("\nBefore Insert Part 3 I & J are "+i+" & "+j);
        insert(arr, i, j--);
        System.out.println("\nPart 3 I & J are "+i+" & "+j);
        for (int num : arr) 
		{
			System.out.print(num+",");
		}
      }
      i--;
    }
  }
  
  private void insert(int[] arr, int i, int j) {
    if (j < arr.length) {
    	System.out.println("\nin Insert and I and J are "+ i + " && "+ j);
      arr[j] = arr[i];
    }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {0,1};
		DupZeros dz = new DupZeros();
		dz.duplicateZeros(arr);
		System.out.println("So finally arr is ");
		for (int num : arr) 
		{
			System.out.print(num+",");
		}
		

	}

}
