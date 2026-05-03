public class Notebook extends Produto{
    private String processador;
    private String memoria;

    public Notebook(String nome, double preco, String marca, String processador, String memoria) {
        super(nome, preco, marca);
        this.processador = processador;
        this.memoria = memoria;
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.85;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
}
