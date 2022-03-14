import java.util.Scanner;
public class Exercicio5{

    public static void main(String[] args){
        int valor;
        int x;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        valor=leitura.nextInt();

        if (valor%2 == 0){
            x = valor/2;
            System.out.println(x);
        } else {
            x = (3*valor)+1;
            System.out.println(x);
        }
        leitura.close();
    }
}