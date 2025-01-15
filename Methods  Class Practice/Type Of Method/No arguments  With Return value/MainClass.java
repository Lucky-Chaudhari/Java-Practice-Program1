class MainClass
{
  public static void main(String args[])
   {
     Demo d1 = new Demo();
               //no arguments with  with return value
         d1.a=10;
          d1.b=20;
        int result = d1.addition();
         System.out.println(result);//30


         d1.a='A';
          d1.b='B';
         System.out.println(d1.addition());//131

   }


}