import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Pon un numero y te dirá las cifras que tienes y no te pases de cifras...");

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        sc.close();

        if (number>0 && number<9) {
            System.out.println("Una cifra");
        } else if (number>10 && number<99) {
            System.out.println("Dos cifras");
        } else if (number>100 && number<999) {
            System.out.println("Tres cifras");
        } else if (number>1000 && number<9999) {
            System.out.println("Cuatro cifras");
        } else if (number>10000 && number<99999) {
            System.out.println("Cinco cifras");
        } else if (number>100000) {
            System.out.println("Tiene más de cuatro cifras");
        }else{
            System.out.println("No trabajamos con numeros negativos");
        }
    }
}