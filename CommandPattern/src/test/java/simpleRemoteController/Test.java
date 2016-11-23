package simpleRemoteController;

/**
 * Created by L'Accordeur on 2016/11/16.
 */
class Base
{
     private int i = 2;

     public Base()
     {
     this.display();
     }

     public void display()
    {
    System.out.println(i);
     }
}

class Derived extends Base
{
     private int i = 22;

     public Derived()
     {
     i = 222;//②
     }

     public void display()
     {
     System.out.println(i);
     }
}

public class Test
{
    public static void main(String[] args)
     {
     new Derived();//①
     }
}