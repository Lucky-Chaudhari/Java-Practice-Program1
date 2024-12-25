class Counter10
{
public static void main(String args[])
   {
      int n=5;
      int count=n;
        for(int i=n;i>=n;i--)
           { 
                  int c=count;
               for( int j=1;j<=i;j++)
                  {
                        System.out.print(c + "\t");
                       c+=j-1;
                  
                  }
                    System.out.println();
                   count-=i-1;

           }
     
   }
}
