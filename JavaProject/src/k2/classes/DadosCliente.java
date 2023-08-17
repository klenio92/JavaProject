package k2.classes;

import java.util.Objects;

public class DadosCliente {

	/*
	 * caso necessario no futuro sera criada uma classe para carro separada do
	 * cliente
	 */
	private String nome;
	private String cpf;
	private String numCelular;
	private String email;
	private String endereco;

	private String carroModelo;
	private String placaCarro;
	private int kmCarro;
	private int anoCarro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumCelular() {
		return numCelular;
	}

	public void setNumCelular(String numCelular) {
		this.numCelular = numCelular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCarroModelo() {
		return carroModelo;
	}

	public void setCarroModelo(String carroModelo) {
		this.carroModelo = carroModelo;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public int getKmCarro() {
		return kmCarro;
	}

	public void setKmCarro(int kmCarro) {
		this.kmCarro = kmCarro;
	}

	public int getAnoCarro() {
		return anoCarro;
	}

	public void setAnoCarro(int anoCarro) {
		this.anoCarro = anoCarro;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anoCarro, carroModelo, cpf, email, endereco, kmCarro, nome, numCelular, placaCarro);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DadosCliente other = (DadosCliente) obj;
		return anoCarro == other.anoCarro && Objects.equals(carroModelo, other.carroModelo)
				&& Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && kmCarro == other.kmCarro
				&& Objects.equals(nome, other.nome) && Objects.equals(numCelular, other.numCelular)
				&& Objects.equals(placaCarro, other.placaCarro);
	}

	@Override
	public String toString() {
		return "DadosCliente [nome=" + nome + ", cpf=" + cpf + ", numCelular=" + numCelular + ", email=" + email
				+ ", endereco=" + endereco + ", carroModelo=" + carroModelo + ", placaCarro=" + placaCarro
				+ ", kmCarro=" + kmCarro + ", anoCarro=" + anoCarro + "]";
	}

}
