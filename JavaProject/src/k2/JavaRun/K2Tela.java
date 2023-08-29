package k2.JavaRun;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import k2.classes.PaymentSlip;

public class K2Tela extends JDialog {

	private JPanel jPanel = new JPanel(new GridBagLayout());

	private JLabel descricao1 = new JLabel("Fornecedor:");
	private JTextField escreva1 = new JTextField();
	private JLabel descricao2 = new JLabel("Vencimento:");
	private JTextField escreva2 = new JTextField();
	private JLabel descricao3 = new JLabel("Valor em R$:");
	private JTextField escreva3 = new JTextField();

	private JButton add1 = new JButton("Registrar Boleto");
	private JButton add2 = new JButton("Listar Boletos");
	private JButton add3 = new JButton("Marcar Boleto como pago");

	public K2Tela() {

		setTitle("Tela de registros");
		setSize(new Dimension(500, 500));
		setLocationRelativeTo(null);
		setResizable(false);

		// -------------------------------

		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 12, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;

		// ----------------------------------

		descricao1.setPreferredSize(new Dimension(200, 25));
		jPanel.add(descricao1, gridBagConstraints);

		escreva1.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(escreva1, gridBagConstraints);

		descricao2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricao2, gridBagConstraints);

		escreva2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(escreva2, gridBagConstraints);

		descricao3.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(descricao3, gridBagConstraints);

		escreva3.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(escreva3, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;

		add1.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(add1, gridBagConstraints);

		add2.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(add2, gridBagConstraints);

		add3.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy++;
		jPanel.add(add3, gridBagConstraints);

		// ----------------------------------

		PaymentSlip boleto = new PaymentSlip();
		add1.addActionListener(new ActionListener() { // BOTAO 1
			@Override
			public void actionPerformed(ActionEvent e) {

				boleto.setBoletoDis(escreva1.getText());
				boleto.setBoletoPrazo(escreva2.getText());
				boleto.setBoletoValor(Integer.valueOf(escreva3.getText()).intValue());

				// adicionar boleto com dados preenchidos

			}
		});

		add1.addActionListener(new ActionListener() { // BOTAO 2
			@Override
			public void actionPerformed(ActionEvent e) {
				boleto.getBoletos().add(boleto); // puxar do banco de dados os boletos
			}

		});

		add1.addActionListener(new ActionListener() { // BOTAO 3
			@Override
			public void actionPerformed(ActionEvent e) {
				// botao para remover o item da lista

			}
		});

		// --------------------------------
		add(jPanel, BorderLayout.WEST);
		setVisible(true);

	}

}