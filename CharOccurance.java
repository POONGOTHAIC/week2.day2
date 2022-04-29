package week2day2;

public class CharOccurance {
	
	public static void main(String[]args) {
		
		String str = "welcome to chennai";
		int count=0;
		char[] strArr = str.toCharArray();
		for(int i=0; i<strArr.length; i++)
		{
			if(strArr[i]=='e')
			{
				count++;
			}
		}
		System.out.println(count);
			
	}

}
