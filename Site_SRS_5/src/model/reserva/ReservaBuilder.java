package model.reserva;

public class ReservaBuilder {
	
	private String nomeSala;
	private int idSala;
	private String data;
	private String horarioInicio;
	private String horarioFim;
	private String turma;
	
	//Construtores da calsse 
	public ReservaBuilder(){}

	@SuppressWarnings("unused")
	private ReservaBuilder(String nomeSala, String data, String horarioInicio, String horarioFim, String turma) {
		this.nomeSala = nomeSala;
		this.data = data;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		this.turma = turma;
	};
	
	public ReservaBuilder withNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
		return this;
	}
	
	public ReservaBuilder withData(String data) {
		this.data = data;
		return this;
	}
	
	public ReservaBuilder withHorarioInicio(String horarioInicio) {
		this.horarioInicio = horarioInicio;
		return this;
	}
	
	public ReservaBuilder withHorarioFim(String horarioFim) {
		this.horarioFim = horarioFim;
		return this;
	}
	
	public ReservaBuilder withTurma(String turma) {
		this.turma = turma;
		return this;
	}
	
	public ReservaBuilder withIdSala(int idSala) {
		this.idSala = idSala;
		return this; 
	}
	
	public Reserva build() {
		return new Reserva(nomeSala, data, horarioInicio, horarioFim, turma, idSala);
				
	}

}
