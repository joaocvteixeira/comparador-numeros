import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        //1. Faça um programa em Java que leia dois números e exiba o maior deles.
        
        Scanner ler = new Scanner(System.in);

        int valor1;
        System.out.println("Digite um número: ");
        valor1 = ler.nextInt();

        int valor2;
        System.out.println("Digite mais um número: ");
        valor2 = ler.nextInt();

        int valorMaior;

        if (valor1 > valor2) {
            valorMaior = valor1;
        }
        else {
            valorMaior = valor2;
        }
        
        System.out.println("O primeiro valor é de " + valor1 + ", e o segundo valor é de " + valor2 + ", o maior valor entre eles é o " + valorMaior);
    }
}
