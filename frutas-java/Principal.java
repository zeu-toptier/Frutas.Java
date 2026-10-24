import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente.cadastrarClientes();
        Banana.cadastrarBananas();

        Cliente.listarClientes();

        System.out.print("\nEscolha o número do cliente: ");
        int opcaoCliente = entrada.nextInt();

        Cliente cliente = Cliente.escolherCliente(opcaoCliente);

        if (cliente == null) {
            System.out.println("Cliente inválido!");
            entrada.close();
            return;
        }

        System.out.println("\nBem-vindo(a), " + cliente.getNome() + "!");

        Banana.listarBananas();

        System.out.print("\nEscolha a banana que deseja comprar: ");
        int opcaoBanana = entrada.nextInt();

        Banana banana = Banana.escolherBanana(opcaoBanana);

        if (banana != null) {
            System.out.println("\n--- COMPRA REALIZADA ---");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Banana escolhida: " + banana.getNome());
            System.out.println("Estoque disponível: "
                    + banana.getQuantidade());
        } else {
            System.out.println("Opção de banana inválida!");
        }

        entrada.close();
    }
}