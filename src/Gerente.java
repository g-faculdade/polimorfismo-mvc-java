import java.util.List;

public class Gerente extends Funcionario{
    private double comissao;
    private List<Vendedor> vendedores;

    public Gerente(String nome, int idade, double salario, double comissao, List<Vendedor> vendedores) {
        super(nome, idade, salario);
        this.comissao = comissao;
        this.vendedores = vendedores;
    }

    @Override
    public double calcularComissao() {
        double porcentagem = 0.02;
        double totalVendas = 0;

        for (Vendedor v : vendedores){
            totalVendas += v.getTotalDeVendas();

            if (v.getNumeroDeVendas()> 10){
                porcentagem += 0.01;
            }
        }

        if (porcentagem > 0.05) {
            porcentagem = 0.05;
        }

        comissao = totalVendas* porcentagem;
        return comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public List<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    @Override
    public String toString() {
        return "Gerente: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nSalário: " + getSalario() +
                "\nComissão: " + comissao;
    }
}
