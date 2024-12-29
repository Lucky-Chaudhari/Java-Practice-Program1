class SpaceCounter10
{
public static void main(String args[])
   {
    int n=5;
     int count=1;
      for(int i=1;i<=n;i++)
         {
             int c=count;
         for(int j=1;j<i;j++)
            {
                System.out.print("\t");
             }
         for(int j=i;j<=n;j++)
            {
              System.out.print(c+"\t");
                   c+=j;
             }
             System.out.println();
               count+=i+1;
         }

   }

}
/*
output:-
1       2       4       7       11
        3       5       8       12
                6       9       13
                        10      14
                                15
*/