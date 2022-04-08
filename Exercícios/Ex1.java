package GFT;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 
 * @author ana
 *
 */
public class Ex1 {
 // Elabora um sistema que leia três valores (A, B, C) e 
 //mostre-os na ordem lida. Em seguida, 
 //	mostre-os em ordem crescente e decrescente..
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[] valores = new double[2];	
		
		System.out.println("Digite um número: ");
		valores[0] = entrada.nextDouble();
		
		System.out.println("Digite outro número: ");
		valores[1] = entrada.nextDouble();
		
		System.out.println("Digite mais um número: ");
		valores[2] = entrada.nextDouble();
		
		Arrays.sort(valores); 
		System.out.println( "Elementos em ordem crescente: " 
		+Arrays.toString(valores); 
		
	//	Arrays.sort(valores); 
	//System.out.println( "Elementos do array em ordem decrescente: " 
	//	+Arrays.reverse(valores)); 
	}
}
