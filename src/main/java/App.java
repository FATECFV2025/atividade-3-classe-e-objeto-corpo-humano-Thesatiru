package main.java;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner digitar = new Scanner(System.in);
        Corpo_humano c1 = new Corpo_humano();
        System.out.println("Digite o valor da Massa");
        c1.setMassa(digitar.nextDouble());
        System.out.println("Digite o valor da altura");
        c1.setAltura(digitar.nextDouble());
        c1.calcularIMC();
        System.out.println(c1.getIMC());

    
    }
}
