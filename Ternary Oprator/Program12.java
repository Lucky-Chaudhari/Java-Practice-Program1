class Program12
{
	public static void main(String args[])
	{
               int n=5;
            for(int i=n;i>=1;i--)
		{
		    for(int j=1;j<=n;j++)
			{
                         if(j<i)
                          System.out.print(j);
                          else
                         System.out.print(i);

			}
                      System.out.println();
		}
              
	}


}
/*
12345
12344
12333
12222
11111
*/