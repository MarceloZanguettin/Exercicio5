import java.util.Scanner;
public class Exercicio5{

    public static void main(String[] args){
        float valor;
        float x;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        valor=leitura.nextFloat();
        x = valor;
        while (x>1){
            if (valor%2 == 0){
                x = valor/2;
                valor = x;
                System.out.println(x+"-> ");
            } else {
                x = (3*valor)+1;
                valor = x;
                System.out.println(x+"-> ");
            }
        }
        leitura.close();
    }
}