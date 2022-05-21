/*Desafio
Crie um programa que leia 6 valores, os quais poderão ser negativos e/ou positivos. Em seguida, apresente a quantidade de valores positivos digitados.

Entrada
Você receberá seis valores, negativos e/ou positivos.

Saída
Exiba uma mensagem dizendo quantos valores positivos foram lidos. assim como é exibido abaixo no exemplo de saída.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class QtdeNumerosPositivos {
    public static void main(String[] args) throws IOException {
       String linha;
       Double n;
       int Pos, count;
 
       Pos=0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       for (count=1; count<=6; count++) {
           linha = br.readLine();
           n = Double.parseDouble(linha);
           if(n>0) {
             Pos++;
           }
       }
 
       System.out.println("" + Pos + " valores positivos");
    }
}