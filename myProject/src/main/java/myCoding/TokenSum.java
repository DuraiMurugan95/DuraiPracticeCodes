package myCoding;

public class TokenSum {
	public static void main(String[] args) {
		
		
		String inputString="1,9,33,2,17,15,10,22,25";
		String inputStringSplit[]=inputString.split(",");
		int i=0;
		int diff=0;
		int temp = 0,sum=0;
		while(inputStringSplit.length-1!=i)
		{
			diff=((Integer.parseInt(inputStringSplit[i]))-(Integer.parseInt(inputStringSplit[i+1])))+temp;
			if(diff<0)
			{
				sum+=diff;
				temp=0;
			}
			else
			{
				temp=diff;
			}
			i++;
		}
		sum=-sum;
		sum+=Integer.parseInt(inputStringSplit[0]);
		System.out.println(sum);
	}
}
