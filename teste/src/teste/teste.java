package teste;

import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
    	 Scanner scanner = new Scanner(System.in);
         
         int codigo, quantidade;
         double preco, valorTotal;
         String produto;
         
         System.out.print("Código do Produto: ");
         codigo = scanner.nextInt();
         
         System.out.print("Quantidade: ");
         quantidade = scanner.nextInt();
         
         switch (codigo) {
             case 1:
                 preco = 10.00;
                 produto = "Cachorro Quente";
                 break;
             case 2:
                 preco = 15.00;
                 produto = "X-Salada";
                 break;
             case 3:
                 preco = 18.00;
                 produto = "X-Bacon";
                 break;
             case 4:
                 preco = 12.00;
                 produto = "Bauru";
                 break;
             case 5:
                 preco = 8.00;
                 produto = "Refrigerante";
                 break;
             case 6:
                 preco = 13.00;
                 produto = "Suco de laranja";
                 break;
             default:
                 System.out.println("Código inválido.");
                 return;
         }
         
         valorTotal = preco * quantidade;
         
         System.out.println("\nProduto: " + produto);
         System.out.printf("Valor total: R$ %.2f\n", valorTotal);

	}

}
