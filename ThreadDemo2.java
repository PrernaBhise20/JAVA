class Demo implements Runnable
{
   public void run() //name of function run is compulsary in multithreading
                    
   {
    int i=0;
    for(i=1;i< 10;i++)
    {
        System.out.println(i);
    }
   }
}

public class ThreadDemo2 
{
    public static void main(String a[])
    {
        System.out.println("Inside main method");

        Demo obj1=new Demo();
        Demo obj2=new Demo();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();
        t2.start();
    }
}