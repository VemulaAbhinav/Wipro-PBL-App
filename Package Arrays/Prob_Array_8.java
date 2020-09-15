package Package_Arrays;

public class Prob_Array_8 {
	
		public static void main(String args[])
		{
			int i,sum=0;
			boolean flag=false;
			int[] arr={1,5,6,4,3,2,7,3};
			for(i=0;i<arr.length;i++)
			{
				  if(arr[i]==6&&flag==false)
					{
					flag=true;
					}
				  else
				  {   
					  if(flag==false)
					  {
						  sum=sum+arr[i];
					  }
					  if(arr[i]==7&&flag==true)
					  {
						  flag=false;
					  }
				  }
				}
				System.out.print(sum);
			
		}
	}