class Medicine{
    void displayLabel(){
        System.out.println("Name=Grace pharmacy");
        System.out.println("Adrress=Adoor,Pathanamthitta");


    }
}
class Tablet extends Medicine{
    void displayLabel(){

        System.out.println("Store in cool dry place");
        System.out.println("For external use only");
    }

}
class Syrup extends Medicine{
    void displayLabel(){

        System.out.println("Store in cool dry place");
        System.out.println("use only after doctors prescription");
    }

}
class Ointment extends Medicine {
    void displayLabel() {

        System.out.println("avoid contact from eyes");
        System.out.println("Incase of irritation immediately contact doctor");
    }
}
public class TestMedicine {
        public static void main(String[] a) {
            double i = Math.random() * 4;
            int j = (int) i;
            System.out.println(j);
            switch (j) {
                case 1:
                    Medicine f1 = new Medicine();
                    Tablet t1 = new Tablet();
                    f1.displayLabel();
                    t1.displayLabel();
                    break;
                case 2:
                    Medicine f2 = new Medicine();
                    Syrup s2 = new Syrup();
                    f2.displayLabel();
                    s2.displayLabel();
                    break;
                case 3:
                    Medicine f3 = new Medicine();
                    Ointment s3 = new Ointment();
                    f3.displayLabel();
                    s3.displayLabel();
                    break;
                default:
                    System.out.println("Invalid input");


            }

        }

}
