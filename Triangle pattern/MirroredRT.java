class MirroredRT
   {
   public static void main(String args[])
         { 
     for(int i=1;i<=5;i++)
           {
       for(int j=5;j>=i;j--)
              {
                 System.out.print(" ");
        
                   for(int k=5;k<=j;k++)
              {
                 System.out.print("* ");
                  
               }
                  
               }
            

                 System.out.println();
           }
      }
   }