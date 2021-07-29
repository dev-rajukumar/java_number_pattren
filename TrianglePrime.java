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
                              for(int i=1; i<=(i*2); i++)
	                       {
                                for(int j=1; j<i; j++)
                                 {
                                   System.out.print(no);
                                 }
                System.out.println();
              }   
        }


               }
        }
}