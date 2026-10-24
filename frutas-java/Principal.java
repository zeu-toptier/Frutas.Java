import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Cliente.cadastrarClientes();
        Banana.cadastrarBananas();

        // Escolha do cliente
        Cliente cliente = null;

        while (cliente == null) {
            Cliente.listarClientes();

            System.out.print("\nEscolha o número do cliente: ");
            int opcaoCliente = entrada.nextInt();

            cliente = Cliente.escolherCliente(opcaoCliente);

            if (cliente == null) {
                System.out.println(
                    "Cliente inválido! Tente novamente."
                );
            }
        }

        System.out.println(
            "\nBem-vindo(a), " + cliente.getNome() + "!"
        );

        // Escolha da banana
        Banana banana = null;

        while (banana == null) {
            Banana.listarBananas();

            System.out.print(
                "\nEscolha a banana que deseja comprar: "
            );

            int opcaoBanana = entrada.nextInt();

            banana = Banana.escolherBanana(opcaoBanana);

            if (banana == null) {
                System.out.println(
                    "Banana inválida! Tente novamente."
                );
            }
        }

        // Quantidade da compra
        boolean compraRealizada = false;

        while (!compraRealizada) {
            System.out.print(
                "\nQuantas unidades deseja comprar? "
            );

            int quantidadeCompra = entrada.nextInt();

            if (banana.comprar(quantidadeCompra)) {
                compraRealizada = true;

                System.out.println("\n--- COMPRA REALIZADA ---");
                System.out.println(
                    "Cliente: " + cliente.getNome()
                );
                System.out.println(
                    "Banana escolhida: " + banana.getNome()
                );
                System.out.println(
                    "Quantidade comprada: " + quantidadeCompra
                );
                System.out.println(
                    "Estoque restante: " + banana.getQuantidade()
                );
                System.out.println(
                    "Compra realizada com sucesso!"
                );

            } else {
                System.out.println(
                    "Quantidade inválida ou estoque insuficiente!"
                );
                System.out.println(
                    "Estoque disponível: " + banana.getQuantidade()
                );
                System.out.println(
                    "Tente novamente."
                );
            }
        }

        entrada.close();
    }
}