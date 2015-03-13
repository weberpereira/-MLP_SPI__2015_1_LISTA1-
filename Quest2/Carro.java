package Quest2;

public class Carro {
	private String cor;
	private String modelo;
	private String estado;
	private int velocidadeAtual;
	private int velocidadeMaxima;

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String comportamento) {
		this.estado = comportamento;
	}

	public void ligar(String ligar) {
		if (ligar.equals("S")) {
			this.setEstado("Carro Ligado");
		} else {
			this.setEstado("Carro Desligado");
		}
	}

	public void acelerar(int kmPH) {
		this.setVelocidadeAtual(kmPH);
		if (this.getVelocidadeAtual() > this.getVelocidadeMaxima()) {
			System.out.printf("A velocidade maxima é: %d Km/h%n",
					this.getVelocidadeMaxima());
		}
	}
}