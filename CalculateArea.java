import java.util.Scanner;
public class CalculateArea {
    public static void main(String[]args){

        double pi = 3.14;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();

        double area = pi*radius*radius;

        System.out.println("The area of the circle is" +area);
    }
}
