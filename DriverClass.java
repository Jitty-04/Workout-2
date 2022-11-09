package p1;

class OneBHK{
    float roomArea,hallArea,price;
    OneBHK()
    {
        roomArea=5500;
        hallArea=9900;
        price=200000;

    }
    OneBHK(float a,float b,float c){
        this.roomArea=a;
        this.hallArea=b;
        this.price=c;
    }
    void show()
    {
        System.out.println("RoomArea="+roomArea);
        System.out.println("HallArea="+hallArea);
        System.out.println("Price="+price);
    }


}
class TwoBHK extends OneBHK{
    float room2Area;
    TwoBHK(){
        super();
        room2Area=5500;
    }
    TwoBHK(float x,float y ,float z ,float w){
        super(x, y, z);
        this.room2Area=w;
    }
    void show(){
        super.show();
        System.out.println("Room2Area="+room2Area);
        System.out.println("\n");

    }


}


public class DriverClass {
    public static void main(String[] a) {
        TwoBHK t1=new TwoBHK(5500,25000,200000,4500);
        TwoBHK t2=new TwoBHK(6500,50000,500000,6500);
        TwoBHK t3=new TwoBHK(5500,25000,800000,4500);
        t1.show();
        t2.show();
        t3.show();
        System.out.println("Total amount of all flats="+(t1.price+t2.price+t3.price));


    }

}
