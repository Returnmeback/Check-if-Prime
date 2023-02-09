import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a number. I will check if it is prime: ");
        System.out.println(Prime(scanner.nextInt()));
        }
        public static boolean Prime (int n) {
        if (n < 2)
    {
        return false;
    }
        for (int i = 2; i <= n/i; i++)
    {
        if (n%i == 0) return false;
    }
        return true;
    }
}