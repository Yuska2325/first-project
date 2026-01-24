import java.util.Random;
import java.util.Scanner;
public class AdvancedPasswordGenerator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean again = true;
        while (again) {
            System.out.print("Password length: ");
            int length = sc.nextInt();
            if(length < 4){
                System.out.println("Error! Password must be at least 4 characters long!");
                continue;
            }
            System.out.println("Choose password type: ");
            System.out.println("1 - Simple");
            System.out.println("2 - Strong");
            int choice_type = sc.nextInt();
            String characters = "";
            if(choice_type == 1){
                characters += "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" ;
            } else if(choice_type == 2){
                characters += "abcdefghijklmnopqrstuvwxyz" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "!@#$%^&*()-_+=?/|<>" ;
            } else {
                System.out.println("Invalid choice! Please choose 1 or 2.");
                continue;
            }
            String passWord = "";
            for(int i = 0; i < length; i++){
                int index = rand.nextInt(characters.length());
                passWord += characters.charAt(index);
            }
            System.out.println("Show the generated password: " + passWord);
            System.out.print("Does it need to generate again? (y/n): ");
            char answer_password = sc.next().charAt(0);
            if(answer_password != 'y' ){
                again = false;
            }
        }
        System.out.println("Password generated successfully.");
        sc.close();
    }
}
