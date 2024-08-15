import model.Clientes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Clientes cliente = new Clientes();

        boolean continuarLoop = true;

        do {
            try
            {
                System.out.print("Insira seu nome, por favor: ");
                cliente.setNomeCliente(input.nextLine());

                System.out.print("Insira o número da agencia: ");
                cliente.setAgencia(input.next());

                System.out.print("Insira número de conta, por favor: ");
                cliente.setNumero(input.nextInt());

                System.out.print("Insira o saldo: ");
                cliente.setSaldo(input.nextDouble());

                System.out.println("\n" + cliente);
                continuarLoop = false;

            } catch (IllegalArgumentException e) {
                System.err.printf(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                input.nextLine();
            } finally {
                input.close();
            }
        } while (continuarLoop);
    }
}
