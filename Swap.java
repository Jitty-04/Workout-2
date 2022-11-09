import java.util.Scanner;

public class Swap{
    int r;
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values to be swapped");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Call by value");
        System.out.println("Before Swapping a="+a+"\t,b="+b);
        swapfunction(a,b);
        System.out.println("After swapping outside function a="+a+"\t,b="+b);
        System.out.println("\n");
        System.out.println("Call by reference");
        System.out.println("Before Swapping a="+a+"\t,b="+b);
        Swap s1=new Swap(a);
        Swap s2=new Swap(b);
        swapfunction2(s1,s2);
        System.out.println("After swapping outside function a="+s1.r+"\t,b="+s2.r);

    }
    static void swapfunction(int s,int t){
        int z=s;
        s=t;
        t=z;
        System.out.println("After swapping inside function a="+s+"\t,b="+t);


    }
    static void swapfunction2(Swap a,Swap b){
        Swap c=new Swap(a.r);
        a.r=b.r;
        b.r=c.r;
        System.out.println("After swapping inside function a="+a.r+"\tb="+b.r);

    }
   public Swap(int r){
        this.r=r;

   }
}