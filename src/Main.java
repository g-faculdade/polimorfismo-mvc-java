import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Celular c1 = new Celular("iPhone 14", 5000.0, "Apple", 1, "iPhone 14");
        Celular c2 = new Celular("Galaxy S23", 4000.0, "Samsung", 2, "Galaxy S23");
        Notebook n1 = new Notebook("MacBook Pro", 10000.0, "Apple", "M2", "16GB");
        Notebook n2 = new Notebook("Dell XPS", 7000.0, "Dell", "Intel i7", "32GB");

        Vendedor v1 = new Vendedor("João", 30, 2000.0, 0, 0, 0);
        Vendedor v2 = new Vendedor("Maria", 25, 1800.0, 0, 0, 0);

        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(v1);
        vendedores.add(v2);
        Gerente gerente = new Gerente("Carlos", 40, 5000.0, 0, vendedores);

        VendaController controller = new VendaController(gerente);

        List<Produto> produtos1 = new ArrayList<>();
        produtos1.add(c1);
        produtos1.add(n1);
        Venda venda1 = new Venda(produtos1, v1);
        controller.adicionarVenda(venda1);

        List<Produto> produtos2 = new ArrayList<>();
        produtos2.add(c2);
        produtos2.add(n2);
        Venda venda2 = new Venda(produtos2, v2);
        controller.adicionarVenda(venda2);

        List<Produto> produtos3 = new ArrayList<>();
        produtos3.add(c2);
        Venda venda3 = new Venda(produtos3, v1);
        controller.adicionarVenda(venda3);

        System.out.println("=== Comissões ===");
        controller.calcularComissoes();
    }
}