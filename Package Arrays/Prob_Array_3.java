package Package_Arrays;

public class Prob_Array_3 {
	public static void main(String args[])
	{
		int arr[]={1,4,34,56,7};
		int key=56,i;
		boolean flag=false;
		for(i=0;i<arr.length;i++)
			if(arr[i]==key)
				{
				flag=true;
				break;
				}
		if(flag)
			System.out.println(i);
		else
			System.out.println("-1");
	}
}