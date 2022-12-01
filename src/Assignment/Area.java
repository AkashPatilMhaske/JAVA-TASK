package Assignment;

public class Area {
   int rectangleleangth;
   int rectanglebradth;

   void setDiamension(int length ,int breadth){
       rectangleleangth=length;
       rectanglebradth=breadth;
   }

int getArea(){
  return  rectangleleangth*rectanglebradth;
}

    public static void main(String[] args) {
        Area area=new Area();
        area.setDiamension(2,5);
        System.out.println("area of reactangle="+area.getArea());
    }











}
