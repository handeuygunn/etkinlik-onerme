import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.println("Sicaklik giriniz:");
        heat = input.nextInt();

        if(heat<5) {
            System.out.println("Kayak yapmaya gidebilirsiniz");
        }
        if (5<heat && heat<15){
            System.out.println("Sinemaya gidebilirsiniz");
        }
        if(10<heat && heat<25){
            System.out.println("Piknige gidebilirsiniz");
        }
        if (heat>25){
            System.out.println("yuzmeye gidebilirsiniz");
        }
    }
}
