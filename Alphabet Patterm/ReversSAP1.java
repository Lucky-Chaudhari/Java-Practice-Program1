class ReversSAP1
{
     public static  void main(String args[])
     {
         int n=5;
        for(int i=1;i<=n;i++ )
          {
                for(int j=n;j>=1;j--)
                {
                   System.out.print((char)(j+96));
                  }
                   System.out.println();

           }
     }

}


/*
output:-
edcba
edcba
edcba
edcba
edcba



*/