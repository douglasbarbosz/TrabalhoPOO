//Nome: Douglas Aparecido Barbosa RA: 2268639

public class ProdutoInvalidoException extends Exception {
	private static final long serialVersionUID = 1L;

	public ProdutoInvalidoException(String msg) {
        super(msg);
    }
    
    public ProdutoInvalidoException(String msg, Throwable causa) {
        super(msg, causa);
    }
    
}
