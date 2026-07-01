public class Circle extends Shape{
    private double radius;
    private final double pie=3.14; 
    Circle c;

    public void setradius(double radius){
        this.radius= radius;
    }

    @Override
    public void area(){
        c= new Circle();
        System.out.println("Area of a circle is: "+ pie*radius*radius);
    }

    @Override
    public void perimeter(){
        c= new Circle();
        System.out.println("Peimeter of a circle is: "+ 2*pie*radius);
    }
}
