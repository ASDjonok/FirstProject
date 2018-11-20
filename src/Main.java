import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!:)");
        System.out.println(1);
        System.out.println('1');
        System.out.println("1");

        int a = 1;
        System.out.println(a);
        System.out.println("a");

        a = 2;
        System.out.println(a);

        String s = "My string";
        System.out.println(s);
        System.out.println("s");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
        }
    }
}
