class StaticDemo
{
    static
    {
        System.out.println("Inside static block of static demo class which contains main");
    }
    public StaticDemo()
    {
        System.out.println("Inside StaticDemo constructor");
    }
    public static void main(String arg[])
    {
       System.out.println("Inside main function");
        
        System.out.println("Value of static No3:"+Demo.No3);  //Demo::No3;/in c++
        System.out.println("Value of static No4:"+Demo.No4);  //Demo::No4;
        Demo.gun();
        Demo obj1=new Demo();
        Demo obj2=new Demo();
        obj1.fun();
    }
}
class Demo
{
    public int No1;       //non-static characteristics
    public int No2;         //non-static characteristics
    public static int No3;  //static characteristics
    public static int No4;  //static characteristics

    static                //static block
    {
        System.out.println("Inside static block of demo class");
    No3=51;
    No4=101;
    }
    public Demo()  //constructor
    {
        System.out.println("Inside constructor");
        No1=11;
        No2=21;
    }
    public void fun() //non-static method
    {
        //non-static method can access static as well as non-static data
        System.out.println("Inside non-static method fun");
        System.out.println("Value of No1:"+this.No1);
        System.out.println("Value of No2:"+this.No2);
        System.out.println("Value of No3:"+this.No3);
        System.out.println("Value of No4:"+this.No4);

    }
    public static void gun()  //static method
    {
        //static method can acces only static data
        //we cant use this keyword
        System.out.println("Inside static method gun");
       // System.out.println("Value of No1:"+No1);
        //System.out.println("Value of No2:"+No2);
        System.out.println("Value of No3:"+No3);
        System.out.println("Value of No4:"+No4);

    }
}
