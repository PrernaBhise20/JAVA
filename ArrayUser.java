import java.util.Scanner;
public class ArrayUser 
{
    public static void main(String Arg[])
    {
      Scanner sobj=new Scanner(System.in);
       
      System.out.println("Enter the size of array:");
      int iSize=sobj.nextInt();

      int Arr[]=new int[iSize];
      //int Arr[]=(int *)malloc(iSize *sizeof(int)) //syntax in c-programming

      System.out.println("Number of elements in array:"+Arr.length);
       
      System.out.println("Enter the elements of array:");
      int iCnt=0;
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
       Arr[iCnt]=sobj.nextInt();
      }

      System.out.println("Elements of array are:");
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
       System.out.println(Arr[iCnt]);
      }
    
      
      int iSum=0;
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
       iSum=iSum+Arr[iCnt];
      }
      System.out.println("Sum of array are:"+iSum);


      
    //  int a=0,b=0;
    //   for(iCnt=0;iCnt<Arr.length;iCnt--)
    //   {
    //   iCnt=a;
    //    a=b;
    //    b= iCnt;
    //   }
    //   System.out.println("reverse of array:"+iCnt);


    }
}
