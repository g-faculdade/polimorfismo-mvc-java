public class Vendedor extends Funcionario{
    private double comissao;
    private int numeroDeVendas;
    private double totalDeVendas;

    public Vendedor(String nome, int idade, double salario, double comissao, int numeroDeVendas, double totalDeVendas) {
        super(nome, idade, salario);
        this.comissao = comissao;
        this.numeroDeVendas = numeroDeVendas;
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public double calcularComissao() {
        double porcentagem = 0.05; // começa com 5%

        if (numeroDeVendas > 10) {
            int vendasExtras = numeroDeVendas - 10;
            int acrescimo = vendasExtras / 2;
            porcentagem = porcentagem + (acrescimo * 0.01);

            if (porcentagem > 0.10) {
                porcentagem = 0.10; // limite de 10%
            }
        }

        comissao = totalDeVendas * porcentagem;
        return comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getNumeroDeVendas() {
        return numeroDeVendas;
    }

    public void setNumeroDeVendas(int numeroDeVendas) {
        this.numeroDeVendas = numeroDeVendas;
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    @Override
    public String toString() {
        return "Vendedor: " + getNome() +
                "\nIdade: " + getIdade() +
                "\nSalário: " + getSalario() +
                "\nNúmero de Vendas: " + numeroDeVendas +
                "\nTotal de Vendas: " + totalDeVendas +
                "\nComissão: " + comissao;
    }
}
