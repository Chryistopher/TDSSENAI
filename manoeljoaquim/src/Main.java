import com.sun.jdi.DoubleValue;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios de 1,99
 e agora possui uma loja de conveniências. Faça um programa que implemente
  uma caixa registradora rudimentar. O programa deverá receber um número
   desconhecido de valores referentes aos preços das mercadorias.
    Um valor zero deve ser informado pelo operador para indicar o final da compra.
     O programa deve então mostrar o total da compra e perguntar o valor em
      dinheiro que o cliente forneceu, para então calcular e mostrar o valor do troco.
       Após esta operação, o programa deverá voltar ao ponto inicial, para registrar
        a próxima compra. A saída deve ser conforme o exemplo abaixo:
Lojas Tabajara
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00
Dinheiro: R$ 20.00
Troco: R$ 11.00
...
 */
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Variaveis
        ArrayList Produto = new ArrayList();
        ArrayList<Double> Valor = new ArrayList();

        int finalizar, i, tamanho;
        double soma,dinheiro,troco;

        soma = 0;
        finalizar = 1;
        tamanho = 0;

        while (finalizar != 0) {
            System.out.println("Digite o Nome do produto");

            Produto.add(teclado.next());

            System.out.println("Digite o Valor do produto");

            Valor.add(teclado.nextDouble());

            System.out.println("Deseja continuar? 1-para Sim 0-para Não");

            finalizar = teclado.nextInt();

            tamanho = Produto.size();
                        

        }

        for (i = 0; i < tamanho; i++) {
            System.out.print(Produto.get(i)+": ");
            System.out.print("R$ "+Valor.get(i)+"\n");
        }

        for(i = 0; i < tamanho; i++){
            soma+=Valor.get(i);
        }

        System.out.println("Total: "+soma);

        System.out.println("Informe a quantia recebido do cliente: ");

        dinheiro = teclado.nextDouble();

        troco = dinheiro - soma;

        System.out.println("Dinheiro: "+dinheiro);

        System.out.println("Troco: "+troco);

    }
}