import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Password length: ");
        int length = sc.nextInt();
        String characters = "abcdefghijklmnopqrstuvwxyz";
        System.out.print("Should include uppercase letters? (y/n): ");
        char uppercase_letters = sc.next().charAt(0);
        if (uppercase_letters == 'y'){
            characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        System.out.print("Should include numbers? (y/n): ");
        char numbers = sc.next().charAt(0);
        if (numbers == 'y') {
            characters += "0123456789";
        }
        System.out.print("Should include symbols? (y/n): ");
        char symbols = sc.next().charAt(0);
        if (symbols == 'y') {
            characters += "!@#$%^&*()-_+=?/|<>";
        }
        String passWord = "";
        for (int i = 0; i < length; i++) {
            int index = rand.nextInt(characters.length());
            passWord += characters.charAt(index);
        }
        System.out.println("Show the generated password: " + passWord);
        sc.close();
    }
}
