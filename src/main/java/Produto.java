//Nome: Douglas Aparecido Barbosa RA:2268639

public class Produto {

    private String nome;
    private Double taxaServicoProduto;

    public Produto() {}

    public Produto(String nome, Double taxaServicoProduto) {
        this.nome = nome;
        this.taxaServicoProduto = taxaServicoProduto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTaxaServicoProduto(Double taxaServicoProduto) {
        this.taxaServicoProduto = taxaServicoProduto;
    }

    public double getTaxaServicoProduto() {
        return taxaServicoProduto;
    }
}
