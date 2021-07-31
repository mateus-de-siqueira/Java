package tp1;

public class Produto {
	// Estrutura heterogênea produto
	private String  nomeProduto;
	private String descricao;
	private double preco;
	private double lucro;
	private int qtd;	
	
	// Métodos get e set para o produto

	// Nome do produto
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String paramNomeProduto) {
		this.nomeProduto = paramNomeProduto;
	}
	
	// Descrição do produto
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String paramDescricao) {
		this.descricao = paramDescricao;
	}
	
	// Preço do produto
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double paramPreco) {
		this.preco = paramPreco;
	}
	
	// Lucro do produto
	
	public double getLucro() {
		return lucro;
	}
	
	public void setLucro(double paramLucro) {
		this.lucro = paramLucro;
	}
	
	// Quantidade do produto
	
	public double getQtd() {
		return qtd;
	}
	
	public void setQtd(int paramQtd) {
		this.qtd = paramQtd;
	}

}