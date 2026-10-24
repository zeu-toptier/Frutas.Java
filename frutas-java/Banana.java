import java.util.ArrayList;
import java.util.List;

public class Banana extends Frutas {
    private static List<Banana> listaBananas = new ArrayList<>();

    public Banana(String nome, int quantidade) {
        super(nome, quantidade);
    }

    public static void cadastrarBananas() {
        listaBananas.add(new Banana("Banana Prata", 20));
        listaBananas.add(new Banana("Banana Nanica", 15));
        listaBananas.add(new Banana("Banana Maçã", 10));
    }

    public static void listarBananas() {
        System.out.println("\n--- BANANAS DISPONÍVEIS ---");

        for (int i = 0; i < listaBananas.size(); i++) {
            Banana banana = listaBananas.get(i);

            System.out.println(
                (i + 1) + " - " + banana.getNome()
                + " | Quantidade: " + banana.getQuantidade()
            );
        }
    }

    public static Banana escolherBanana(int opcao) {
        if (opcao >= 1 && opcao <= listaBananas.size()) {
            return listaBananas.get(opcao - 1);
        }

        return null;
    }

    // Verifica a quantidade e atualiza o estoque
    public boolean comprar(int quantidadeCompra) {
        if (quantidadeCompra > 0 &&
            quantidadeCompra <= quantidade) {

            quantidade -= quantidadeCompra;
            return true;
        }

        return false;
    }
}