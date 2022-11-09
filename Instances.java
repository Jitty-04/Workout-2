public class Instances {
    static int count;
    static int id;

    public Instances() {
        count++;

    }
    public static void main(String[] a)
    {
        Instances t1=new Instances();
        Instances t2=new Instances();
        Instances t3=new Instances();
        Instances t4=new Instances();
        t1=null;
        t2=null;
        Runtime.getRuntime().gc();
        System.out.println("Object created:"+count);
        System.out.println("Object destroyed:"+id);
        System.out.println("Object alive:"+(count-id));

    }
    protected void finalize()
    {

        id++;
    }
}






