class Demo
{

//finding Last digit in given number
      int findLastDigit(int n)
       {

         return n%10;

       }

//Find the SecondLastDigit of given number


       int findSecondLastDigit(int n)
         {
             return (n/10)%10;

         }

//Find the Thirdigit of given number
  
       int  findThirdLastDigit(int n)
         {
            return ((n/10)/10)%10;

         }

//Find the firstDigit of given number
              int findFirstDigit(int n)
               {
                  while(n>=10)
                  {
                    // error: not a statement
                      //n/10;


                     n = n/10;
                   }
                    return n;

                }

 //Find the SecondDigit of given number

          int findSecondDigit(int n)
               {
                 while(n>=100)
                     {
                        n=(n/10)%10;

                     }
                return n;


               }

//Find the sum of given number

  
          int findSumofDigit(int n)
             {
                int sum=0;
                 while (n!=0)
                   {
                    sum+=n%10;
                    n/=10;

                  }
                 return sum;

//Find the avg of given number

                double findAvgofDigit(int n)
                 {
                   double avg=0;
                    int count=0;
                     while(n!=0)
                      {
                        avg+=n%10;
                        count++;
                        n/=10;

                     }
                    
                   return avg/count;

                }

}







    
    

}