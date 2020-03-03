// Ian McNulty Assignment 3 Problem 4
class Test{
    public static void main(String[] args){
        RegularPolygon x = new RegularPolygon();
        RegularPolygon y = new RegularPolygon(6, 4);
        RegularPolygon z = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon x created using RegularPolygon(), perimeter: " + x.getPerimeter() + " area: " + x.getArea());
        System.out.println("Polygon y created using RegularPolygon(int, int), perimeter: " + y.getPerimeter() + " area: " + y.getArea());
        System.out.println("Polygon z created using RegularPolygon(int, int, double, double), perimeter: " + z.getPerimeter() + " area: " + z.getArea());

    }
}

class RegularPolygon{
    private int n = 3;
    private double side = 1;
    private double x = 0, y = 0;

    RegularPolygon(){
    }

    RegularPolygon(int a, double b){
        n = a;
        side = b;
    }

    RegularPolygon(int a, double b, double c, double d){
        n = a;
        side = b;
        x = c;
        y = d;
    }

    public static void main(String[] args){

    }

    double getPerimeter(){
        return n * side;
    }

    double getArea(){
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    int getN(){ return n; }
    double getSide(){ return side; }
    double getX(){ return x; }
    double getY(){ return y; }

    void setN(int a){ n = a; }
    void setSide(double a){ side = a; }
    void setX(int a){ x = a; }
    void setY(int a){ y = a; }

}