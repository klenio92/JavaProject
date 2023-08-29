package k2.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PaymentSlip {

	private String boletoDis;
	private String boletoPrazo;
	private int boletoValor;
	private long boletoNum;
	private boolean boletoStatus;

	private List<PaymentSlip> boletos = new ArrayList<PaymentSlip>();

	public List<PaymentSlip> getBoletos() {
		return boletos;
	}

	public void setBoletos(List<PaymentSlip> boletos) {
		this.boletos = boletos;
	}

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

	public void setBoletoValor(int boletoValor) {
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
				+ "]";
	}

	public void remove(String boletoStatus2) {
	}
}