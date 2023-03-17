package aula_03;

import java.util.Scanner;

public class CamadaRepeticaoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int numero, idade, genero=0,sexo=0, categoria,Backend=0,Frontend=0,MMobilemaiores40=0,MDevmenores30=0, contador = 0;
        char continua = 'S';

        while (continua == 'S') {
            System.out.println("Digite sua idade: ");
            idade = leia.nextInt();
            
            do {
            	
            	System.out.println("Digite o gênero (1-M/2-F/3-T/4-NB): ");
            	genero = leia.nextInt();
            
            }while(genero < 1 || genero > 4);

            System.out.println("Digite o número de sua categoria (1-Backend/2-Frontend/3-Mobile/4-FullStack): ");
                categoria = leia.nextInt();
                
                contador++;

                if (categoria == 1)
                	Backend++;

                if (categoria == 2)
                	Frontend++;

                if ((idade >= 40 || genero == 1) && categoria == 3)
                	MMobilemaiores40++;
                
                if ((idade <= 30 || genero == 2) && categoria == 2)
                	MDevmenores30++;

                genero = 0;
                
            System.out.println("Deseja continuar (S/N)? ");
                continua = leia.next().toUpperCase().charAt(0);
           
                
            }
            
            System.out.println("Número de pessoas desenvolvedoras Backend: " + Backend);
            System.out.println("Número de pessoas desenvolvedoras Frontend: " + Frontend );
            System.out.println("Número de homens desenvolvedoras Mobile maiores de 40 anos: " + MMobilemaiores40);
            System.out.println("Número de mulheres desenvolvedoras FullStack menores de 30 anos: " + MDevmenores30);

	}

}
