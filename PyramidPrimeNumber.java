class TrianglePrime
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
				for(int j=1; j<=no; j++)
                                {
                                 System.out.print(" ");
		                 }
				for(int k=11; k>=no; k--){
                                 System.out.print(no + " ");
				}
                                 System.out.println();
		           }
                   }
        }
}
