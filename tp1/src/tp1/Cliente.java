package tp1;

public class Cliente {
	// Declarações globais
	private String nomeCliente;
	private String endereco;
	private String telefone;
	
	// Método get e set para o cliente
	
	// Nome do cliente
	public String getNomeCliente() {
		return this.nomeCliente;
	}
	
	public void setNomeCliente(String nomeParametro) {
		this.nomeCliente = nomeParametro;
	}
	
	//Endereço do cliente
	public String getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(String enderecoParametro) {
		this.endereco = enderecoParametro;
	}
	
	// Telefone do cliente	
	public String getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(String telefoneParametro) {
		this.telefone= telefoneParametro;
	}
	
}
	

		

