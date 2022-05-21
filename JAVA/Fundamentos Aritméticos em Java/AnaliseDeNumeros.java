/*Desafio
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos. Considere que o número zero é positivo, mas não pode ser considerado como positivo ou negativo.

Entrada
Você receberá 5 valores inteiros.

Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo o final de linha após cada uma.
*/

import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
      Scanner leitor = new Scanner(System.in);

        String linha;
        int n = 0;
        int par = 0;
        int impar = 0;
        int pos = 0;
        int neg = 0;
        
        for (int count=0; count<5; count++) {
           linha = leitor.nextLine();
           n = Integer.parseInt(linha);
           if(n % 2 == 0) {
              par++;
           } else {
             impar++;
           }
           if (n > 0) {
             pos++;
           } else if (n < 0) {
             neg++;
           }
       }
        
        System.out.println(par + " par(es)");
        System.out.println(impar + " impar(es)");
        System.out.println(pos + " positivo(s)");
        System.out.println(neg + " negativo(s)");
    }
}