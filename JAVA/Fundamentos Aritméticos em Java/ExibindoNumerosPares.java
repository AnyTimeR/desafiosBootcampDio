/*Desafios
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 
*/

import java.io.IOException;
import java.util.Scanner;

public class NumerosPares {
	
    public static void main(String[] args) throws IOException {
    	  int n, count;
    	  
    	  Scanner scan = new Scanner(System.in);
    	  n = scan.nextInt();
    	  
    	  for (count=2; count<=n; count++) {
    	    
    	    if (count % 2 == 0) {
    	       System.out.println(count);
    	    }
    	  }
    }
}