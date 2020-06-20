package myCoding;

import java.util.*;


public class Gambling 
{
	public static void main(String[] args) 
	{
		
		String sentence= "C4arg6r";
		sentence=sentence.toLowerCase();
		String keyWord="wire";
		keyWord=keyWord.toLowerCase();
		List sentenceList=new ArrayList<Integer>();
		List keyWordList=new ArrayList<Integer>();
		List resultList=new ArrayList<Integer>();
		List resultList1=new ArrayList<Integer>();
		int n=sentence.length();
		for (int i = 0; i < n; i++) 
		{ 
			int a1=sentence.charAt(i);
			if(a1>96)
			{
				sentenceList.add(a1-97);
			}
			else
			{
				sentenceList.add(sentence.charAt(i));
			}
			
		} 
		System.out.println(sentenceList);
		int m=keyWord.length();
		for (int i = 0; i < m; i++) 
		{ 
			int a1=keyWord.charAt(i);
			keyWordList.add(a1-97);
		} 
		System.out.println(keyWordList);
		int cyclicValueToGetAdd=sentenceList.size()-keyWordList.size();
		for(int k=0;k<cyclicValueToGetAdd;k++)
		{
			keyWordList.add(keyWordList.get(k));
		}
		System.out.println(keyWordList);
		for(int l=0;l<keyWordList.size();l++)
		{
			int a1=(sentence.charAt(l));
			if(a1>96)
			{
				int a=(Integer) sentenceList.get(l)+(Integer)keyWordList.get(l);
				resultList.add(a);
			}
			else
			{
				resultList.add(sentenceList.get(l));
			}
		}
		System.out.println("l"+resultList);
		for(int i=0;i<resultList.size();i++)
		{
			/*if(((Integer)resultList.get(i))>25)
			{
				int a=((Integer)resultList.get(i)%25);
				resultList1.add(a+65);
			}
			else
			{
				resultList1.add((Integer)resultList.get(i)+65);
			}*/
			
				int a1=(sentence.charAt(i));
				if(a1>96)
				{
					if(((Integer)resultList.get(i))>25)
					{
						int a=((Integer)resultList.get(i)%25);
						resultList1.add(a+65);
					}
					else
					{
						resultList1.add((Integer)resultList.get(i)+65);
					}
				}
				else
				{
					resultList1.add(sentenceList.get(i));
				}
		}
		System.out.println(resultList1);
		String str=null;
		String resultStr="";
		for(int i=0;i<resultList1.size();i++)
		{
			int a1=(sentence.charAt(i));
			if(a1>96)
			{
				int a=(Integer)resultList1.get(i);
				str = Character.toString((char)a);
				resultStr+=str.toLowerCase();
			}
			else
			{
				str = Character.toString((Character) resultList1.get(i));
				resultStr+=str.toLowerCase();
			}
		}
		System.out.println(resultStr);
	}
}
