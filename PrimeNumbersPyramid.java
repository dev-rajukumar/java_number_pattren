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
	                   
	                       for(int i=no; i<=no;i++)//Outer Loop
		              {
	                      for(int j=9; j>=no-1; j--)//Print Spaces
			          {
			         System.out.print(" ");
			          }
                                 for(int k=1; k<=(1*i); k++)
			          {
			          System.out.print(no + " ");
			           }
		                System.out.println();
			 }
                     }
		}
        }
}