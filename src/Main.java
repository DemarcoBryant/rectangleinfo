//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ready = false;
        double width = 0.0;
        double height = 0.0;
        do {
            System.out.println("Enter the width: ");
            width = scanner.nextDouble();
            System.out.println("Enter the height: ");
            height = scanner.nextDouble();
            if (height > 0.0) {
                ready = true;
                if (height > 0.0) {
                    ready = true;
                }else ready = false;
            }else ready = false;
        }while (!ready);
        double side3 = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.println("The length of the line is: " +side3);
        double Side = width + height + side3;
        System.out.println("The perimiter of the triangle is: " +Side);
    }
}