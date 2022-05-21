/*Desafio
Precisamos saber quanto uma determinada empresa deve pagar para seus colaboradores, por�m temos apenas a quantidade de horas trabalhadas e o valor hora. Escreva um programa que leia o n�mero de um colaborador, seu n�mero de horas trabalhadas, o valor que recebe por hora e calcula o sal�rio desse colaborador. Em seguida, apresente o n�mero e o sal�rio do colaborador, com duas casas decimais.

Entrada
Voc� receber� 2 n�meros inteiros e 1 n�mero com duas casas decimais, representando o n�mero, quantidade de horas trabalhadas e o valor que o funcion�rio recebe por hora trabalhada.

Sa�da
Exiba o n�mero e o sal�rio do colaborador, conforme exemplo abaixo, com um espa�o em branco antes e depois da igualdade. No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.
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