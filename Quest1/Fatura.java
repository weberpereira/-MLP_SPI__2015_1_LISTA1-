package Quest1;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantidadeDeItens;
	private double precoPorItem;
	private double valorFatura;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeDeItens() {
		return quantidadeDeItens;
	}

	public void setQuantidadeDeItens(int quantidadeItem) {
		this.quantidadeDeItens = quantidadeItem;
	}

	public double getPrecoPorItem() {
		return precoPorItem;
	}

	public void setPrecoPorItem(double precoPorItem) {
		this.precoPorItem = precoPorItem;
	}

	public double getValorFatura() {
		if (this.precoPorItem < 0) {
			this.precoPorItem = 0;
		}
		this.valorFatura = this.precoPorItem * this.quantidadeDeItens;
		return valorFatura;
	}

}