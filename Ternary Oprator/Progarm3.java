class Progarm3
{

public static void main(String arsg[])
	{
          int a=10,b=20,c=30,d=40,e=50;
     
            String result=(a>b)?(a>c)?(a>d)?(a>e)?"a is big":"e is big":(d>e)?"d is big":"e is big":(c>d)?(c>e)?"c is big":(d>e)?"d is big":"e is big": (b>c)?(b>d)?(b>e)?"b is big":(d>e)?"d is big":"e is big":(c>d)?(c>e)?"c is big":"e is big":(d>e)?"d is big":"e is big";
   
             System.out.println(result);

	}

}