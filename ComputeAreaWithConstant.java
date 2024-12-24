
import java.util.Scanner;

public class ComputeAreaWithConstant {

    public static void main(String[] args) {
        final double PI = 3.14159; //Declare a constant
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();
        double area = radius * radius * PI;

        //display results
        System.out.println("The area for the circle of radius "
                + radius + " is " + area);
    }
}

/*
nextByte() reads an integer of the byte type.
 nextShort() reads an integer of the short type.
 nextInt() reads an integer of the int type.
 nextLong() reads an integer of the long type.
 nextFloat() reads a number of the float type.
 nextDouble() reads a number of the double type
 */
