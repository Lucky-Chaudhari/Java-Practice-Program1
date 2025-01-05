class Program8
{
	public static void main(String args[])
	{
		int n=5;
              for(int i=1;i<=n;i++)
		{
                   for(int j=1;j<=i;j++)
			{
                          if(j%2!=0)
                           System.out.print(1);
                          else
                            System.out.print((char)((j/2+64)));/*(2/2=1+64=65)*/
                           
			}
                    System.out.println();
		}


	}

}
/*
output:-
1
1A
1A1
1A1B
1A1B1
*/