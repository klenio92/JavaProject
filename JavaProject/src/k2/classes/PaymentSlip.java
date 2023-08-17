package k2.classes;

import java.util.Objects;

public class PaymentSlip {

	private String boletoDis;
	private String boletoPrazo; /* puxar no dia quando um boleto estiver na data de vencimento */
	private int boletoValor;
	private long boletoNum;
	/* private ??? boletoCodBarra; */ /* foto do cod de barra no sistema para pagar na mesma hora */
	private boolean boletoStatus;/*
									 * todo boleto iniciar como false/nao pago, adicionar opcao de marcar como pago
									 */

	public String getBoletoDis() {
		return boletoDis;
	}

	public void setBoletoDis(String boletoDistribuidora) {
		this.boletoDis = boletoDistribuidora;
	}

	public String getBoletoPrazo() {
		return boletoPrazo;
	}

	public void setBoletoPrazo(String boletoPrazo) {
		this.boletoPrazo = boletoPrazo;
	}

	public double getBoletoValor() {
		return boletoValor;
	}

	public void setBoletoValor(double boletoValor) {
		this.boletoValor = boletoValor;
	}

	public long getBoletoNum() {
		return boletoNum;
	}

	public void setBoletoNum(long boletoNum) {
		this.boletoNum = boletoNum;
	}

	public boolean isBoletoStatus() {
		return boletoStatus;
	}

	public void setBoletoStatus(boolean boletoStatus) {
		this.boletoStatus = boletoStatus;
	}

	@Override
	public int hashCode() {
		return Objects.hash(boletoDis, boletoNum, boletoPrazo, boletoStatus, boletoValor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PaymentSlip other = (PaymentSlip) obj;
		return Objects.equals(boletoDis, other.boletoDis) && boletoNum == other.boletoNum
				&& Objects.equals(boletoPrazo, other.boletoPrazo) && boletoStatus == other.boletoStatus
				&& Double.doubleToLongBits(boletoValor) == Double.doubleToLongBits(other.boletoValor);
	}

	@Override
	public String toString() {
		return "PaymentSlip [boletoDis=" + boletoDis + ", boletoPrazo=" + boletoPrazo + ", boletoValor=" + boletoValor
				+ ", boletoNum=" + boletoNum + ", boletoStatus=" + boletoStatus + "]";
	}

}