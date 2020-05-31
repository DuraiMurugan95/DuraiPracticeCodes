package samplePackage;

import java.util.Scanner;

public class MatrixRotation {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String inputString=scan.nextLine();
		System.out.println("Before splitting:"+inputString);
		String[] split=inputString.split("#");
		String matrixString="";
		for(String splitedWord:split) {
			System.out.println("Splited: "+splitedWord);
			matrixString+=splitedWord;
		}
		System.out.println("MatrixString: "+matrixString);
		
		
		int length=matrixString.length();
		int k=0;
		int m;
		int n;
		m=split.length;
		n=split[1].length();
		int m1=m;
		int n1=n;
		System.out.println("Rows: "+m+"  Coloumn:  "+n+"  length: "+length);

		
		
		char s[][]=new char[m][n];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(k<matrixString.length())
				
						s[i][j]=matrixString.charAt(k);
				k++;
				
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(s[i][j]==0)
				{
					break;
				}
				System.out.print(s[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		/*startRow- Starting row index
		row-ending row index
		startCol-starting coloumn indexx
		coloumn-ending coloumn index
		i-iterator*/
		
		
		
		
	for(int j =0;j<1;j++)
	{
		int row=0,col=0;
		char prev,curr;
		while(row < m && col < n)
		{
			if(row + 1 == m || col + 1 == n)
				break;
			
			
			//Store the first element of the next row to the prev, this element will replace the first element of current row.
			prev=s[row + 1][col];
			
			//Move element of first row from the remaining rows
			for(int i=col;i<n;i++)
			{
				curr=s[row][i];
				s[row][i]=prev;
				prev=curr;
			}
			row++;
			
			//Move element of last column from the remaining columns 
			for(int i=row;i<m;i++)
			{
				curr=s[i][n-1];
				s[i][n-1]=prev;
				prev=curr;
			}
			n--;
			
			//Move elements of last row from the remaining rows
			if(row<m)
			{
				for(int i=n-1;i>=col;i--)
				{
					curr=s[m-1][i];
					s[m-1][i]=prev;
					prev=curr;
				}
			}
			m--;
			
			//Move elements of first column from the remaining rows 
			if(col<n)
			{
				for(int i=m-1;i>=row;i--)
				{
					curr=s[i][col];
					s[i][col]=prev;
					prev=curr;
				}
			}
			col++;
		}
	}
		//Print rotate matrix
		System.out.println("Print rotate matrix");
		for(int i=0;i<m1;i++)
		{
			for(int j=0;j<n1;j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.print("\n");
		}
		
	}

}
