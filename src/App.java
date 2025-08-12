public class App {
    public static void main(String[] args) throws Exception {
        
        //1. Faça um programa em Java que leia dois números e exiba o maior deles.
        
        int valor1 = 5;
        int valor2 = 7;
        int valorMaior = 0;

        if (valor1 > valor2) {
            valorMaior = valor1;
        }
        else {
            valorMaior = valor2;
        }
        
        System.out.println("O primeiro valor é de " + valor1 + ", e o segundo valor é de " + valor2 + ", o maior valor entre eles é o " + valorMaior);
    }
}
