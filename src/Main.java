import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("No te diré ni una cifra");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        sc.close();

        if (number>0 && number<9) {
            System.out.println("cifra");
        } else if (number>10 && number<99) {
            System.out.println("cifras");
        } else if (number>100 && number<999) {
            System.out.println("cifrass");
        } else if (number>1000 && number<9999) {
            System.out.println("cifrasss");
        } else if (number>10000 && number<99999) {
            System.out.println("cifrassss");
        } else if (number>100000) {
            System.out.println("cifrassss+");
        }else{
            System.out.println("No trabajamos cifra-");
        }
    }
}