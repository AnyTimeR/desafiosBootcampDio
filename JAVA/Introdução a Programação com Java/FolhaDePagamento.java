/*Desafio
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, porém temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o número de um colaborador, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse colaborador. Em seguida, apresente o número e o salário do colaborador, com duas casas decimais.

Entrada
Você receberá 2 números inteiros e 1 número com duas casas decimais, representando o número, quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada.

Saída
Exiba o número e o salário do colaborador, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.
*/

import java.io.IOException;
import java.util.Scanner;

public class FolhaDePagamento {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    int valor1 = scan.nextInt();
    int valor2 = scan.nextInt();
    double valor3 = scan.nextDouble();
    double valor4 = valor2 * valor3;
    System.out.println("NUMBER = " + valor1);
    System.out.format("SALARY = U$ %.2f", valor4);
    
    scan.close();
  }
}