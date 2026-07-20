import java.security.Permissions;
import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{
    private int length;  //utility and encapsulated class gets merged.
    private int breadth;
    Rectangle g;

    public void setLength(int length){
        this.length= length;
    }

    public void setBreadth(int breadth){
        this.breadth= breadth;
    }
    
    @Override
    public void area(){
        g= new Rectangle(); //created setter
        System.out.println("Area of Rectangle is: "+ length*breadth);
    }

    @Override
    public void perimeter(){
        g = new Rectangle();
        System.out.println("Perimeter of Rectangle is: " + 2*(length+breadth));
    }
}
