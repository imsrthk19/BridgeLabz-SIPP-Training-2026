import java.util.Scanner;

public class ShapeMenu extends ShapeMenuAbs{
    Shape s;

    @Override
    public void choices() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1.Rectangle\n 2.Circle\n 3.Triangle\n 4.Exit");
            int choice = sc.nextInt();
            if(choice==4){
                break;
            }
            switch(choice){
                case 1:
                    s = new Rectangle();
                    ((Rectangle)s).setLength(100);
                    ((Rectangle)s).setBreadth(10);
                    s.area();
                    s.perimeter();
                    break;

                case 2:
                    s = new Circle();
                    ((Circle)s).setradius(40);
                    s.area();
                    s.perimeter();
                    break;

                case 3:
                    s = new Triangle();
                    ((Triangle)s).setLength(400);
                    ((Triangle)s).setBreadth(30);
                    ((Triangle)s).setc(4);
                    s.area();
                    s.perimeter();
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}

