class Counter22
{
public static void main(String args[])
 {
   int n=5;
   int count=(n*(n+1))/2;
     for(int i=1;i<=n;i++)
       {
            int c=count;
            for(int j=i;j<=n;j++)
             {
             System.out.print(c +"\t");
                   c-=j-2;

              }
            System.out.println();
               count-=i;

       }

 }

}