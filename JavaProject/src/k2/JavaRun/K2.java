package k2.JavaRun;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import k2.classes.PaymentSlip;
import k2.classes.DadosCliente;

public class K2 {
	public static void main(String[] args) {

		K2Tela k2Tela = new K2Tela();

		String[] options = { "Cadastrar novo cliente", "Registrar novo boleto", "Cancelar" };
		int box1 = JOptionPane.showOptionDialog(null, "Escolha uma opção:", "CADASTRO", 0, JOptionPane.QUESTION_MESSAGE,
				null, options, null);

		if (box1 == 0) {

			for (int qtd = 1; qtd <= 3; qtd++) {
				List<DadosCliente> clientes = new ArrayList<DadosCliente>();
				String nome = JOptionPane.showInputDialog("Qual o nome do Cliente?");
				String cpf = JOptionPane.showInputDialog("Qual o cpf do Cliente?");
				String numCelular = JOptionPane.showInputDialog("Qual o numero de contato do Cliente?");
				String email = JOptionPane.showInputDialog("Qual o email do Cliente?");
				String endereco = JOptionPane.showInputDialog("Qual o endereço do Cliente?");

				String carroModelo = JOptionPane.showInputDialog("Qual o modelo do carro?");
				String placaCarro = JOptionPane.showInputDialog("Qual a placa do carro?");
				String kmCarro = JOptionPane.showInputDialog("Qual a quilometragem do carro?");
				String anoCarro = JOptionPane.showInputDialog("Qual o ano do carro?");

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

				clientes.add(cliente);
				for (DadosCliente dadosCliente : clientes) {
					System.out.println(dadosCliente);
				}
			}
		}
		if (box1 == 1) {

			for (int qtd = 1; qtd <= 3; qtd++) {
				/*
				 * List<PaymentSlip> boletos = new ArrayList<PaymentSlip>(); TESTANDO COLOCAR
				 * LISTA DENTRO DA CLASSE PaymentSlip
				 */
				String boletoDis = JOptionPane.showInputDialog("Qual o distribuidor do boleto?");
				String boletoPrazo = JOptionPane.showInputDialog("Qual o vencimento do boleto?");
				String boletoValor = JOptionPane.showInputDialog("Qual o valor do boleto?");

				PaymentSlip boleto = new PaymentSlip();
				boleto.setBoletoDis(boletoDis);
				boleto.setBoletoPrazo(boletoPrazo);
				boleto.setBoletoValor(Integer.valueOf(boletoValor).intValue());

				boleto.getBoletos().add(boleto);
				for (PaymentSlip paymentSlip : boleto.getBoletos()) {
					System.out.println(paymentSlip);
				}
				/*
				 * int box2 = JOptionPane.showConfirmDialog(null,
				 * "Deseja remover um boleto da lista de pendencia?"); if(box2 == 0) {
				 * 
				 * for (PaymentSlip paymentSlip : boleto.getBoletos()) { String boletoStatus =
				 * JOptionPane.showInputDialog("Qual boleto listado voce deseja remover?");
				 * boleto.getBoletos(); boleto.remove(boletoStatus);
				 * System.out.println(paymentSlip); } **CODIGO REMOVER BOLETO que sera ajustado
				 * e funcionara melhor no futuro** }
				 */

			}
			if (box1 == 2) {
				System.out.println("Ty!");
			}

		}

	}
}