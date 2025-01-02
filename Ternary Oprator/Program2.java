class Program2
{

public static void main(String args[])
	{
            int a=10,b=20,c=60,d=40;
      
           String result=(a>b)?(a>c)?(a>d)?"a is big":"d is big":(c>d)?"c is big":"d is big":
                          (b>c)?(b>d)?"b is big":"d is big":(c>d)?"c is big":"d is big";
                 System.out.println(result);

	}

}
/*
finding big in 4 no 

c is big

*/