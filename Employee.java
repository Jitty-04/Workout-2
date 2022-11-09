

import java.util.*;
public class Employee {
    String Name;
    int EmpID;
    String result="Demoted";
    int ass1,ass2,ass3;
int total(int a,int b,int c){
    this.ass1=a;
    this.ass2=b;
    this.ass3=c;
    return ass1+ass2+ass3;


}
double percentage(double s) {
    return ((s)/300)*100;


}
public static void main(String[] a){
    Scanner sc=new Scanner(System.in);
    int s;
    double t;
    Employee f1=new Employee();
    System.out.println("Enter name");
    f1.Name= sc.next();

    System.out.println("Enter the id");
    f1.EmpID= sc.nextInt();

    System.out.println("Enter the three assesment values");
    f1.ass1= sc.nextInt();
    f1.ass2= sc.nextInt();
    f1.ass3=sc.nextInt();
    System.out.println("Name:"+f1.Name);
    System.out.println("Id:"+f1.EmpID);
    s=f1.total(f1.ass1, f1.ass2, f1.ass3);
    t=f1.percentage(s);

    if(f1.ass1>75&&f1.ass2>75)
    {
        if(f1.ass3>75){
            f1.result="Promoted";
            System.out.println(f1.result);

        }
        else {
            System.out.println(f1.result);
        }

    }
    else {
        System.out.println(f1.result);
    }
    System.out.println("Total="+s);
    System.out.println("Percentage="+String.format("%.2f",t));






}
}

