import java.util.Scanner;

class MathFunction{
    static int multiply(int x,int y){
        System.out.println("Product of "+x+" and "+y+" =");
        return x*y;

    }
    static float multiply(float x, float y){
        System.out.println("Product of "+x+" and "+y+" =");

        return x * y;
    }
    static float multiply(float x, int y) {
        System.out.println("Product of "+x+" and "+y+" =");
        return x * y;

    }
    public static void main(String[] a){
        System.out.println(multiply(1,2));
        System.out.println(multiply(1.2f,2.3f));
        System.out.println(multiply(1.3f,4));

    }
}
