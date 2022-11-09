
class Faculty{
    int  facultyid;
    float salary;

}
class FullTimeFaculty extends Faculty{
    float basic;
    float allowance;
    FullTimeFaculty(int x ,float y,float z)
    {
        facultyid=x;
        basic=y;
        allowance=z;
    }
    float salary()
    {
        salary=basic+allowance;
        return salary;
    }
    void displayfull()
    {
        System.out.println("FullTimeFaculty\n");
        System.out.println("Id=" +facultyid);
        System.out.println("Basicsalary=" +basic);
        System.out.println("Allowance=" +allowance);
        System.out.println("Salary =" +salary());
        System.out.println("\n");

    }

}
class PartTimeFaculty extends Faculty{
    int hour;
    float rate;
    PartTimeFaculty(int a,int b,float c){
        facultyid=a;
        hour=b;
        rate=c;

    }
    float salary()
    {

        salary=hour*rate;
        return salary;
    }
    void displaypart()
    {
        System.out.println("PartTimeFaculty\n");
        System.out.println("Id="+facultyid);
        System.out.println("Hour=" +hour);
        System.out.println("Rate=" +rate);
        System.out.println("Salary=" +salary());
        System.out.println("\n");
    }
}

public class DriverClass {
    public static void main(String[] a){
        FullTimeFaculty f1=new FullTimeFaculty(1504,10000,5000);
        f1.displayfull();
        FullTimeFaculty f2=new FullTimeFaculty(1505,20000,6000);
        f2.displayfull();
        PartTimeFaculty f3=new PartTimeFaculty(2001,10,1000);
        f3.displaypart();
        PartTimeFaculty f4=new PartTimeFaculty(3001,8,500);
        f4.displaypart();

    }

}


