class Food
{
    static void breakfast()
      {
    System.out.println("Having breakast");
    }
    static void breakfast(String name)
    {
    System.out.println("Having "+name);
    }
    static void breakfast(String name, float price)
    {
    System.out.println("Having "+name+ "price is "+price);
    }
     static void breakfast(String name, float price, String taste)
     {
    System.out.println("Having "+name+ " price is "+price);
    }
    static void breakfast(String name, float price, int quantity)
     {
    System.out.println("Having "+name+" price is "+price+" quantity "+quantity);
    }
   public static void main(String[] mj)
   {
    breakfast();
    breakfast("Idli");
    breakfast("puri", 15.22f, 4);
   
   }
  } 