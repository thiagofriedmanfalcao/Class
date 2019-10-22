import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintStream;

public class CriarCarro{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do carro:");
        Carro objCarro  = new Carro(scanner.nextLine());
        
        //Pneu
        System.out.println("Informe o aro do pneu:");
        int aro = scanner.nextInt();

        System.out.println("Informe a largura do pneu:");
        int largura = scanner.nextInt();

        System.out.println("Informe a altura do pneu:");
        int altura = scanner.nextInt();

        Pneus pneu = new Pneus(aro, largura, altura);
        objCarro.adicionarPneus(pneu);

        //resultado
        System.out.println("O Nome do carro é: " + objCarro.nome);

        for (Pneus valPneu : objCarro.objPneus) {
            System.out.println("O aro é: " + valPneu.aro);
            System.out.println("A largura é: " + valPneu.largura);
            System.out.println("A altura é: " + valPneu.altura);                        
        }

        scanner.close();
    }
}