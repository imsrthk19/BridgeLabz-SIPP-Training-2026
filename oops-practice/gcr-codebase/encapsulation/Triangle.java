public class Triangle extends Shape {
    private int length;
    private int breadth;
    private int c;
    Triangle t;
    
    public void setLength(int length){
        this.length= length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public void setc(int c){
        this.c=c;
    }
    @Override
    public void area(){
        System.out.println("Area of a triangle is: " + (0.5 * length * breadth));
    }
    
    @Override
    public void perimeter(){
        t =new Triangle();
        System.out.println("Perimeter of a triangle is: "+ length+breadth+c);
    }
}
