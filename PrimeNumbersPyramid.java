class PrimeNumbersPyramid
{

	public static void main(String args[])
	{

			for(int no=1; no<=11; no++)
		{
					int temp=0;
				for(int i=2; i<=no-1; i++)
			{
				if(no%i==0)
				{
					temp=temp+1;
				}
			}
				if(temp==0)
		          {
				for(int i=1; i<=5;i++)//Outer Loop
		{
	for(int j=5; j>i; j--)//Print Spaces
			{
			System.out.print(" ");
			}
			for(int k=1; k<(i*2); k++)
			{
			System.out.print(no);
			}
		System.out.println();
		}
		           }
                   }
        }
}