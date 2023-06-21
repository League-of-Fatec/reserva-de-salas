package model.salas;

//Builder utilizado
public class SalaBuilder {
	
	//Atributos
//	private int id; 
	private String identificacao;
	private boolean disponivel;
	private int cadeiras;
	private int mesas; 
	private int computadores;
	private boolean projetor;
	private boolean ventilador; 
	private boolean arCondicionado;

	//Construtores da classe
	public SalaBuilder() {}
	
	@SuppressWarnings("unused")
	private SalaBuilder(String identificacao, boolean disponivel, int cadeiras, int mesas, int computadores,
			boolean projetor, boolean ventilador, boolean arCondicionado) {
		this.identificacao = identificacao;
		this.disponivel = disponivel; 
		this.cadeiras = cadeiras; 
		this.mesas = mesas;
		this.computadores = computadores; 
		this.projetor = projetor;
		this.ventilador = ventilador;
		this.arCondicionado = arCondicionado;
	}

	//Partes do Builder
	public SalaBuilder withIdentificacao(String identificacao) {
		this.identificacao = identificacao;
		return this;
	}
	
	public SalaBuilder withDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
		return this;
	}
	
	public SalaBuilder withCaderias(int cadeiras) {
		this.cadeiras = cadeiras;
		return this;
	}
	
	public SalaBuilder withMesas(int mesas) {
		this.mesas = mesas;
		return this;
	}
	
	public SalaBuilder withComputadores(int computadores) {
		this.computadores = computadores;
		return this;
	}
	
	public SalaBuilder withProjetor(boolean projetor) {
		this.projetor = projetor;
		return this;
	}
	
	public SalaBuilder withVentilador(boolean ventilador) {
		this.ventilador = ventilador;
		return this;
	}

	public SalaBuilder withArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
		return this;
	}
	
	public Sala build() {
		return new Sala(identificacao ,cadeiras, mesas, computadores, projetor, ventilador, arCondicionado, disponivel);
	}
} 
