package k2.JavaRun;

import javax.swing.JOptionPane;
import k2.classes.PaymentSlip;
import k2.classes.DadosCliente;

public class K2 {

	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o nome do Cliente?");
		String cpf = JOptionPane.showInputDialog("Qual o cpf do Cliente?");
		String numCelular = JOptionPane.showInputDialog("Qual o numero de contato do Cliente?");
		String email = JOptionPane.showInputDialog("Qual o email do Cliente?");
		String endereco = JOptionPane.showInputDialog("Qual o endereço do Cliente?");

		String carroModelo = JOptionPane.showInputDialog("Qual o modelo do carro?");
		String placaCarro = JOptionPane.showInputDialog("Qual a placa do carro?");
		String kmCarro = JOptionPane.showInputDialog("Qual a quilometragem do carro?");
		String anoCarro = JOptionPane.showInputDialog("Qual o ano do carro?");

		String boletoPrazo = JOptionPane.showInputDialog("Qual o vencimento do boleto?");
		String boletoValor = JOptionPane.showInputDialog("Qual o valor do boleto?");
		String boletoDis = JOptionPane.showInputDialog("Qual a numeraçao do boleto?");

		DadosCliente cliente = new DadosCliente();

		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setEmail(email);
		cliente.setEndereco(endereco);
		cliente.setNumCelular(numCelular);

		cliente.setCarroModelo(carroModelo);
		cliente.setAnoCarro(Integer.valueOf(anoCarro));
		cliente.setKmCarro(Integer.valueOf(kmCarro));
		cliente.setPlacaCarro(placaCarro);

		PaymentSlip boleto = new PaymentSlip();

		boleto.setBoletoDis(boletoDis);
		boleto.setBoletoPrazo(boletoPrazo);
		boleto.setBoletoValor(Integer.valueOf(boletoValor).intValue());

		System.out.println(boleto.toString());
		System.out.println(cliente.toString());
		/*
		 * usar 2 opcoes para cadastrar ou um boleto ou um cliente/carro e depois
		 * prosseguir para opcoes
		 */

	}

}