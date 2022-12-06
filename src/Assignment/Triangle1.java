package Assignment;

public class Triangle1 {
    int side1;
    int side2;
    int side3;

    int addarea(){
        return side1*side2*side3;
    }
    int addperimetor(){
        return side1+side2+side3;
    }
    void setvalues(int a,int b,int c){
        side1=a;
        side2=b;
        side3=c;
    }

    public static void main(String[] args) {
        Triangle1 triangle1=new Triangle1();
        triangle1.setvalues(1,2,3);
        System.out.println("Area of triangle1   = "  +triangle1.addarea());
        System.out.println("Perimeters of triangle1  =  " +triangle1.addperimetor());

        Triangle1 triangle2=new Triangle1();
        triangle2.setvalues(2,3,4);
        System.out.println("Area of Triangle2   =  " +triangle2.addarea());
        System.out.println("Perimeter of Triangle2 =  " +triangle2.addperimetor());

        Triangle1 triangle3=new Triangle1();
        triangle3.setvalues(5,6,7);
        System.out.println("Area of Triangle3    ="     +triangle3.addarea());
        System.out.println("Perimeter of Triangle3  ="  +triangle3.addperimetor());

    }

}
