import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String condition;
        do {
            System.out.print("Nhập thông tin tên: ");
            String name = scanner.nextLine();
            System.out.print("Nhập thông tin địa chỉ: ");
            String address = scanner.nextLine();
            System.out.print("Nhập thông tin tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.printf("Tên: %s, Địa chỉ: %s, Tuổi: %s", name, address, age);
            System.out.println();
            System.out.println("Do you want to continues?(Y/N)?");
            condition = scanner.nextLine();
        }
        while (condition.equalsIgnoreCase("y"));
    }
}