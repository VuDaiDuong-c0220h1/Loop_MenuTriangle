import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the Rectangle");
        System.out.println("2. Draw the Square Triangle");
        System.out.println("3. Draw the Isosceles Triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("1. Draw the Rectangle");
                    System.out.println("Nhập chiều dài:");
                    double lenght = input.nextDouble();
                    System.out.println("Nhập chiều rộng:");
                    double width = input.nextDouble();
                    for ( int i = 0; i < width; i++){
                        for (int j = 0; j < lenght; j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("1. Góc vuông ở phía dưới bên trái");
                    System.out.println("2. Góc vuông ở phía dưới bên phải");
                    System.out.println("3. Góc vuông ở phía trên bên trái");
                    System.out.println("4. Góc vuông ở phía trên bên phải");
                    System.out.println("Enter your choice: ");
                    choice = input.nextInt();
                    switch (choice){
                        case 1:
                            for (int i = 1; i <= 5; i++){
                                for (int j = 1; j <= i; j ++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            for (int i = 5; i >= 1; i--){
                                for ( int j = 1; j <= i ; j++){
                                    System.out.print("  ");
                                }
                                for (int k = 5; k >= i; k--){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            for (int i = 5; i >= 1; i--){
                                for ( int j = 1; j <= i ; j++){
                                    System.out.print("* ");
                                }
                                for (int k = 5; k >= i; k--){
                                    System.out.print("  ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 5; i >= 1; i--){
                                for ( int k = 5; k >= i; k--){
                                    System.out.print("  ");
                                }
                                for ( int j = 1; j <= i ; j++){
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                    }
                    break;
                case 3:
                    int count = 0;
                    for (int i = 5; i >= 1; i--){
                        for ( int j = 1; j <= i ; j++){
                            System.out.print("  ");
                        }
                        for (int k = 0; k <= count ; k++){
                            System.out.print("* ");
                        }
                        count += 2;
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("No choice!");
            }
            System.out.println("Menu");
            System.out.println("1. Draw the Rectangle");
            System.out.println("2. Draw the Square Triangle");
            System.out.println("3. Draw the Isosceles Triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
        }
    }
}
