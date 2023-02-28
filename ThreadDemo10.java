public class ThreadDemo10
 {
    
    public static void main(String ar[])
    {
        System.out.println("Inside main method");

        System.out.println("Name of current thread :"+Thread.currentThread().getName());
        System.out.println("priority current thread :"+Thread.currentThread().getPriority());
    }
}



