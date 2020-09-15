package Package_Arrays;

public class Prob_Array_4 {
	public static void main(String args[]){
		int i;
		char ch='a';
		int[] arr=new int[27];
		for(i=1;i<=26;i++)
		{
			arr[i]=(int)ch;
			ch++;
		}
		for(i=1;i<=26;i++)
			System.out.print(arr[i]+" ");
		
		
	}

}
