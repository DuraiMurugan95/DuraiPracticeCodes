package samplePackage;

import java.util.Scanner;

public class TokenBrought 
{
	public static void main(String[] args) {
		
	
	 int n, sum = 0;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter no. of elements you want in array:");
     n = s.nextInt();
     int a[] = new int[n];
     System.out.println("Enter all the elements:");
     for(int i=0;i<n;i++)
     {
    	 a[i] = s.nextInt();
     }
     int sumNeg=0;
     int j=0;
     while(j<(n-1))
     {
    	 sum=a[j]-a[j+1]; 
    	 
    	 if(sum<0)
    	 {
    		 sumNeg+=sum;
    	 }
//    	 if(sum>0)
//    	 {
//    		 
//    	 }
//    	 else if (sum<0) 
//    	 {
//    		 sumNeg+=sum;
//    		 sum=a[j]-a[j+1];
//    	 }
    	 System.out.println(" SUMOFVALUE "+sum);
    	 j++;
    }
    System.out.println("SumNeg: "+sumNeg);
	

}
}