public class IF_3
{
	
public static void main(String args[])
{
	if(args.length == 0)
	{
		System.out.println("No values ");
	}
	else 
	{
		int x=0;
		while(x!= args.length)
		{
			System.out.println(args[x]+" ");
			x++;
		}
	}

}
}