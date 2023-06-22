//Nome: Douglas Aparecido Barbosa RA:2268639

import java.util.ArrayList;
import java.util.List;

public class Reparo extends Servicos implements PrecoFinal{	
	
    private int numPecasParaReparo;
    private List<String> pecas = new ArrayList<>();	

    public int getNumPecasParaReparo() {
        return numPecasParaReparo;
    }

    public void setNumPecasParaReparo(int numPecasParaReparo) {
        this.numPecasParaReparo = numPecasParaReparo;
    }

    public List<String> getPecas() {
        return pecas;
    }

    public void setPecas(List<String> pecas) {
        this.pecas = pecas;
    }

    @Override
    public double precoFinal() {
        double valorFinal = getProduto().getTaxaServicoProduto() + getValorServico() + (numPecasParaReparo * 20.0 /* -> valor genérico para cada peça*/);
        return valorFinal;
    }
}
