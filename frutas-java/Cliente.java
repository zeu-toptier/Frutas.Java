import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;

    private static List<Cliente> listaClientes = new ArrayList<>();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public static void cadastrarClientes() {
        listaClientes.add(new Cliente("Elizeu", "111.111.111-11"));
        listaClientes.add(new Cliente("João", "222.222.222-22"));
        listaClientes.add(new Cliente("Gabriella", "333.333.333-33"));
    }

    public static void listarClientes() {
        System.out.println("\n--- CLIENTES CADASTRADOS ---");

        for (int i = 0; i < listaClientes.size(); i++) {
            System.out.println(
                (i + 1) + " - " + listaClientes.get(i).getNome()
            );
        }
    }

    public static Cliente escolherCliente(int opcao) {
        if (opcao >= 1 && opcao <= listaClientes.size()) {
            return listaClientes.get(opcao - 1);
        }

        return null;
    }
}