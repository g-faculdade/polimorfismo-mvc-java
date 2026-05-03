import java.util.ArrayList;
import java.util.List;

public class VendaController {
    private List<Venda> vendas;
    private Gerente gerente;

    public VendaController(Gerente gerente) {
        this.gerente = gerente;
        this.vendas = new ArrayList<>();
    }

    public void adicionarVenda(Venda venda) {
        venda.atualizarVendedor();
        vendas.add(venda);
    }

    public void listarVendas() {
        for (Venda v : vendas) {
            System.out.println(v.getVendedor().getNome() + " - Total: " + v.calcularValorTotal());
        }
    }

    public void calcularComissoes() {
        List<Vendedor> exibidos = new ArrayList<>();
        for (Venda v : vendas) {
            Vendedor vendedor = v.getVendedor();
            if (!exibidos.contains(vendedor)) {
                System.out.println(vendedor.getNome() + " - Comissão: " + vendedor.calcularComissao());
                exibidos.add(vendedor);
            }
        }
        System.out.println(gerente.getNome() + " - Comissão: " + gerente.calcularComissao());
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
}