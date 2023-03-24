package testacliente;

import aula_07.Cliente;

public class TestaCliente {

	public static void main(String[] args) {


		
        Cliente cliente1 = new Cliente("Carolina", "Rua Joana, 123", "(45) 12345-6789", "carolina@gmail.com", 20);
        Cliente cliente2 = new Cliente("Raissa", "Rua Ramona, 456", "(45) 45678-9101", "raissa@hotmail.com", 21);

        
        System.out.println("Informações do cliente 1:");
        cliente1.visualizar();

        System.out.println();

        System.out.println("Informações do cliente 2:");
        cliente2.visualizar();

	}

}
