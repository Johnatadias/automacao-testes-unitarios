package entidades;

import java.util.Date;

public class NotaDeAluguel {

	private int preco;
	private Date dataEntrega;
	private int pontuacao;

	public int getPreco() {
		return preco;
	}

	public void setPreco(int preco) {
		this.preco = preco;
	}

	public Date getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Date time) {
		this.dataEntrega = time;
	}
	
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public int getPontuacao() {
		return pontuacao;
	}
}
