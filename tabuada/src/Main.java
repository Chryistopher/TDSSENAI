import java.sql.SQLOutput;
import java.util.Scanner;
/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 o usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variáveis
        int i,numero;
        i=0;

        //Interação com usuário para definir o número
        System.out.println("Digite o número para calcular a tabuada até 10:");

        numero = teclado.nextInt();

        //Impressão dos resultados até o i chegar a 10
        while(i <= 10){

            System.out.println(numero +" X "+i+" = "+ numero * i);
            i++;

        }

    }
}