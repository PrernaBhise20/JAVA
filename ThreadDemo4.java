class Demo extends Thread  //extends class Thread
{
   public void run() //name of function run is compulsary in multithreading
                    
   {
    int i=0;
    for(i=1;i<=1000;i++)
    {
        System.out.println(Thread.currentThread().getName()+":"+i);
    }
   }
}

public class ThreadDemo4
{
    public static void main(String a[])
    {
        System.out.println("Inside main method");

        Demo obj1=new Demo();
        Demo obj2=new Demo();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.setName("First thread");
        t2.setName("Second thread");

        t1.start();
        t2.start();
    }
}


