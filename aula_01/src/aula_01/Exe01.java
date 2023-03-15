package aula_01;

import java.util.Scanner;


public class Exe01 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono;
				
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		System.out.println("Soma: " + (salario + abono));
		
		leia.close();
		
	}

}
