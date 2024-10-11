package aluguel;

public class itemtema {
	public long id;
	public String nome;
	public String descrição;
	public void ItemTema(long id, String nome, String descrição) {
		this.id = id;
		this.nome = nome;
		this.descrição = descrição;
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
	public String getDescrição() {
		return descrição;
	}
	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

}
