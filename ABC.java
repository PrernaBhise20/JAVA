import java.util.*;

class a
{
public int iNo1;
public int iNo2;
public int iAns;

 public void Reverse()
 {
   iNo1=iNo2-iNo1;
   iNo2=iNo1+iNo2;
   iNo1=iNo2-iNo1;
   System.out.println("Reverse is:"+iNo1+iNo2);
 }
}

class ABC
{
    public static void main(String args[])
    {
  Scanner sobj=new Scanner(System.in);
  int iNo1;
  int iAns;
  int iNo2;
  
  System.out.println("Enter first number:");
  iNo1= sobj.nextInt();

  System.out.println("Enter second number:");
  iNo2= sobj.nextInt();
  
  a obj=new a();
  obj.Reverse();
    }
}