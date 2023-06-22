//Nome: Douglas Aparecido Barbosa RA:2268639

public class AvaliacaoGeral extends Servicos implements PrecoFinal{
	
    @Override
    public double precoFinal() {
        double precoFinal = getProduto().getTaxaServicoProduto() + getValorServico();
        return precoFinal;
    }
}
