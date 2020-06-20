package myCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquareRoot 
{
	public static void main(String[] args) 
	{
		int[] arr = {2,4,6,9,81,25,100,144};
		List<Integer> list = new ArrayList<Integer>(arr.length);
		List<Integer> perfectNumber=new ArrayList<Integer>();
		List<Integer> factorialNumber=new ArrayList<Integer>();
		List<Integer> resultList=new ArrayList<Integer>();
		for (int i : arr) {
			list.add(Integer.valueOf(i));
		}
		for(int i=1;i<100;i++)
		{
			int perfectSquare=i*i;
			boolean presence=list.contains(perfectSquare);
			if(presence)
			{
				perfectNumber.add(i);
			}
		}
		if(perfectNumber.size()!=0)
		{
			for(int i =0;i<perfectNumber.size();i++)
			{
				int fact=1;
				int a=perfectNumber.get(i);
				for(int j=a;j>0;j--)
				{
					fact=fact*j;
				}
				factorialNumber.add(fact);
			}
			for(int k=0;k<factorialNumber.size();k++)
			{
				int num=factorialNumber.get(k);
				while((num%10)==0)
				{
					num=num/10;
				}
				num=num%1000;
				resultList.add(num);
			}
			Collections.sort(perfectNumber);
			for(int k=0;k<perfectNumber.size();k++)
			{
				System.out.print(perfectNumber.get(k));
				System.out.print(" ");
			}
			System.out.println("");
			Collections.sort(resultList);
			for(int k=0;k<resultList.size();k++)
			{
				System.out.print(resultList.get(k));
				System.out.print(" "); 
			}
		}
		else
		{
			System.out.println(-1);
		}
	}
}
