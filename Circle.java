public class Circle {

    double radius = 3.4;
    Circle(){

    }
    Circle(double newRadius){
        radius=newRadius;
    }
    double getArea(){
        return radius*radius*3.14;
    }
    public static void main(String[] args){

        Circle circle=new Circle(10);
        circle.getArea();
        System.out.println(circle.getArea());

    }


}
