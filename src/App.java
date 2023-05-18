import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Es por la mañana(1), por la tarde(2) o por la noche(3)");
        int numero = scan.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Hola buenos dias");
                break;
            case 2:
                System.out.println("Hola buenas tardes");
                break;
            case 3:
                System.out.println("Hola buenas noches");                
                break;
        
            default:
                break;
        }
        scan.close();
    }
}