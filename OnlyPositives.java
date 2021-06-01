package CS101;

import java.util.Scanner;

public class OnlyPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Give a number: ");
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else if (input < 0) {
                System.out.println("Unsuitable number");
            } else{
                System.out.println(input * input);
            }
        }
    }
}
