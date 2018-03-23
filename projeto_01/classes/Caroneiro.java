
public class Caroneiro {

  // Dados.
  private String CartaoDeCredito;
  private boolean PagamentoEmDinheiro;
  private static int NumCaronantes;

  // Métodos.
	public String getCartaoDeCredito() {
		return CartaoDeCredito;
	}
	public void setCartaoDeCredito(String CartaoDeCredito) {
		this.CartaoDeCredito = CartaoDeCredito;
	}

	public boolean isPagamentoEmDinheiro() {
		return PagamentoEmDinheiro;
	}
	public void setPagamentoEmDinheiro(boolean PagamentoEmDinheiro) {
		this.PagamentoEmDinheiro = PagamentoEmDinheiro;
	}

	public static int getNumCaronantes() {
		return NumCaronantes;
	}

	// Construtor.
	public Caroneiro() {
	}

	public Caroneiro(String CartaoDeCredito, boolean PagamentoEmDinheiro) {
		this.CartaoDeCredito = CartaoDeCredito;
		this.PagamentoEmDinheiro = PagamentoEmDinheiro;
	}

  public Caroneiro(boolean PagamentoEmDinheiro) {
		this.PagamentoEmDinheiro = PagamentoEmDinheiro;
	}
}
