import java.util.Scanner;

class Tile {
    int edgelength;
    int a;
    Tile(int e) {
        this.edgelength = e;
        this.a = edgelength * edgelength;
    }

        int area()
        {
            return a;
        }


}
class Floor {
    int length, width;

    Floor(int l, int w) {
        this.length = l;
        this.width = w;
    }

    void totalTiles(Tile t) {
        double tarea = t.area();
        double farea = length * width;
        double tiles = farea / tarea;
        System.out.println("No:of tiles needed to cover the floor completely=" +String.format("%.5f",tiles));
    }
}
public  class Area{
    public static void main(String[] a){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the tile edge length");
        int edge = sc.nextInt();
        System.out.println("Enter the floor length and width");
        int flength= sc.nextInt();
        int fwidth= sc.nextInt();
        Tile f1 = new Tile(edge);
        Floor f2=new Floor(flength,fwidth);
        f2.totalTiles(f1);


    }
}
