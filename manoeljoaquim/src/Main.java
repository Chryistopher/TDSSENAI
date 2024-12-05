import com.sun.jdi.DoubleValue;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

/*
O Sr. Manoel Joaquim, conhecido pelos seus negócios de 1,99, decidiu expandir suas operações e agora possui uma loja de conveniência. Para isso, ele precisa de um programa que funcione como uma caixa registradora rudimentar.

Este programa deve permitir que o operador registre o valor de cada produto comprado por um cliente. O processo funciona da seguinte maneira:

O programa receberá os preços das mercadorias, um por vez, permitindo que o operador insira quantos produtos forem necessários.
O valor zero (0) será utilizado para indicar o final da compra.
Após registrar todos os produtos, o programa deve:
Calcular e exibir o total da compra.
Solicitar ao operador o valor em dinheiro fornecido pelo cliente.
Calcular e exibir o troco.
Depois de concluir a operação, o programa deve reiniciar para registrar a próxima compra.
A saída do programa deve seguir o formato abaixo (os valores são apenas exemplos):
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

        int finalizar, i;
        double soma,dinheiro,troco;

        soma = 0;
        finalizar = 1;
       
        while (finalizar != 0) {
            System.out.println("Digite o Nome do produto");

            Produto.add(teclado.next());

            System.out.println("Digite o Valor do produto");

            Valor.add(teclado.nextDouble());

            System.out.println("Deseja continuar? 1-para Sim 0-para Não");

            finalizar = teclado.nextInt();

            tamanho = Produto.size();
              

        }

        for (i = 0; < produtos.size(); i++) {
            System.out.print(Produto.get(i) + ": ");
            System.out.print("R$ "+Valor.get(i)+"\n");
        }

        for(i = 0; i < produtos.size(); i++){
            soma += Valor.get(i);
        }

        System.out.println("Total: "+soma);

        System.out.println("Informe a quantia recebido do cliente: ");

        dinheiro = teclado.nextDouble();

        troco = dinheiro - soma;

        System.out.println("Dinheiro: "+dinheiro);

        System.out.println("Troco: "+troco);

    }
}