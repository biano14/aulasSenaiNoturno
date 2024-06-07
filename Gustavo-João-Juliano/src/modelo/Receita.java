package modelo;
public class Receita {
	String descricao;
	String nomeMedicamento[];
	
	Paciente pa = new Paciente();
	Medico md = new Medico();
	void setMedicamentosPrecritos(String medicamento) {

	}

	public String getDescricao(){
		return  descricao;
}
	public String setDescricao( String descricao){
		return  this.descricao;
}

    public String[] getNomeMedicamento() {
        return nomeMedicamento;
    }
	public String [] setNomeMedicamento(String nomeMedicamento){
		return this.nomeMedicamento;
	}
	public Receita(String descricao) {
		this.descricao = descricao;
	}
	public String receitaFeita(){
		String dados = "\nNome do Paciente: " + this.pa.nomeCompleto;
		dados += "\nData: " + this.pa.dataNascimento;
		dados += "\nNome do Médico: " + this.md.nomeCompleto; 
		return dados;
	}
}
