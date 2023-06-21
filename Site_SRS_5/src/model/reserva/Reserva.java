package model.reserva;

//Utilizado builder
public class Reserva {

	private int id;
	private String nomeSala;
	private int idSala;
	private String data;
	private String horarioInicio;
	private String horarioFim;
	private String turma;
	
	protected Reserva(String nomeSala, String data, String horarioInicio, String horarioFim, String turma, int idSala) {
		this.nomeSala = nomeSala; 
		this.data = data;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.turma = turma;
	}
	
	//Getters ans Setters apenas.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeSala() {
		return nomeSala;
	}
	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHorarioInicio() {
		return horarioInicio;
	}
	public void setHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
	}
	public String getHorarioFim() {
		return horarioFim;
	}
	public void setHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	
	
	
}
