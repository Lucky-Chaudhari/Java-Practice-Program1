class Program1
{

   public static void main(String args[])
      {
         int n=5;
            for(int i=1;i<=n*2-1;i++)
                if(i<=n)
                  {
                         for(int j=i;j<n;j++)
                              System.out.print(" ");
                        
                      
                      for(int j=1;j>=i;j--)
                              System.out.print("*");

                  }
                        System.out.println();
                  
  
      }



}