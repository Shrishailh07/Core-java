class Demo
     {
    void display() /* void- return type & display-methodname*/
     { 
       System.out.println("Hello World"); /* method without arguements and without return statement*/
     }
     public static void main(String[] mj)
     {
      System.out.println("start");
       Demo d = new Demo();
       d.display();          /*calling or invoking the method name*/
        

      System.out.println("end");
   }
}