import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

/*O Sr. Manoel Joaquim acaba de adquirir uma panificadora e
 pretende implantar a metodologia da tabelinha,
  que já é um sucesso na sua loja de 1,99. Você foi contratado para desenvolver
   o programa que monta a tabela de preços de pães,
    de 1 até 50 pães, a partir do preço do pão informado pelo usuário, conforme o exemplo abaixo:

Preço do pão: R$ 0.18
Panificadora Pão de Ontem - Tabela de preços
1 - R$ 0.18
2 - R$ 0.36
...
50 - R$ 9.00

*/
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Variáveis

        double numero,paes,troco,total;


        //Interação com usuário para definir o número
        System.out.println("Digite o valor desejado");

        numero = teclado.nextInt();
        paes = Math.floor(numero/0.18);


        //Total de pães arredondado para baiaxo
        System.out.println(paes+" pães ");

        }

    }
