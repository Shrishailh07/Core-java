class Food
{
public static void main(String[] mj)
   {
    breakfast();
    breakfast("susla");
    breakfast("palav", 20.20f, " ok");
    float response =  breakfast("dosa", 45.5f, 2);
    System.out.println("total Dosa price "+response);
    breakfast("dosa", 35.50f);   
    float avg = breakfast("puri", 40.5f, 4, 10);
    System.out.println("avg puri price "+avg);
   }
    static void breakfast()
      {
     System.out.println("having breakfast");
      }

     static void breakfast(String name)
      {
     System.out.println("having  "+name);
      }			
	static void breakfast(String name,float price,String taste)
	{
	System.out.println( "Having "+name+" price is "+price+" taste is "+taste);
	}
      static float breakfast(String name, float price, int quantity)
    {
     float total = price*quantity;
     return total;
    }
    static void breakfast(String name, float price)
    {
    System.out.println("Having "+name+" price is "+price);
   }
   static float breakfast(String name,float price,int quantity,int noOfPeople)
   {
	float totalprice = price*quantity;
	float avg = totalprice/noOfPeople;
	return avg;
    }

 } 
   /*
  C:\Users\Suresh P K\Desktop\java\method 2>javac Food.java

C:\Users\Suresh P K\Desktop\java\method 2>java Food
having breakfast
having  susla
Having palav price is 20.2 taste is  ok
total Dosa price 91.0
Having dosa price is 35.5
avg puri price 16.2
 */
    
