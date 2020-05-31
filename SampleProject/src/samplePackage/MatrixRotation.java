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
		int row;
		int coloumn;
		row=split.length;
		coloumn=split[1].length();
		System.out.println("Rows: "+row+"  Coloumn:  "+coloumn+"  length: "+length);

		
		
		char s[][]=new char[row][coloumn];

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				if(k<matrixString.length())
				
						s[i][j]=matrixString.charAt(k);
				k++;
				
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<coloumn;j++)
			{
				if(s[i][j]==0)
				{
					break;
				}
				System.out.println(s[i][j]);
			}
			System.out.println("");
		}
		
		
	}

}
