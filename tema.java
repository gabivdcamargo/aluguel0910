package aluguel;

public class tema {

	public long id;
	public String nome;
	public double valorAluguel;
	public String cor;
	public void Tema(long id, String nome, double valorAluguel, String cor) {
		this.id = id;
		this.nome = nome;
		setValorAluguel (valorAluguel);
		this.cor = cor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		if (valorAluguel > 0) {
			this.valorAluguel = valorAluguel;
		}else {
			System.out.println("O valor iserido é irregular");
		}
	}
}
