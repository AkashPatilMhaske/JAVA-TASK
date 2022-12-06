package Assignment;

public class Triangle {
int side1;
int side2;
int side3;

int area(){
    return side1*side2*side3;
}
int perimeters(){
    return side1+side2+side3;
}

    public static void main(String[] args) {
        Triangle triangle=new Triangle();
        triangle.side1=2;
        triangle.side2=3;
        triangle.side3=4;

        System.out.println("Area of triangle "+triangle.area());
        System.out.println("perimeter of triangle"+triangle.perimeters());

    }











}
