package model.salas;

//Responsável por representar a tabela sala de aula.
//Builder utilizado junto do Sala Builder
public class Sala {
	
	//Atributos
	private int id;
	private String identificacao;
	private boolean disponivel;
	private int cadeiras;
	private int mesas; 
	private int computadores;
	private boolean projetor;
	private boolean ventilador; 
	private boolean arCondicionado;
	 
	
	protected Sala(String identificacao, int cadeiras, int mesas, int computadores, boolean projetor,
			boolean ventilador, boolean arCondicionado, boolean disponivel) {
		this.identificacao = identificacao;
		this.cadeiras = cadeiras;
		this.mesas = mesas;
		this.computadores = computadores;
		this.projetor = projetor;
		this.ventilador = ventilador;
		this.arCondicionado = arCondicionado;
	}
	
	 
	//Getters and Setters.
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCadeiras() {
		return cadeiras;
	}
	public void setCadeiras(int cadeiras) {
		this.cadeiras = cadeiras;
	}
	public int getComputadores() {
		return computadores;
	}
	public void setComputadores(int computadores) { 
		this.computadores = computadores;
	}
	
	public void setProjetor(boolean projetor) {
		this.projetor = projetor;
	}
	
	public String isProjetor() {
		if (projetor == true) {
			return "Sim";
		} else {
			return "Não";
		}
	}

	public String isVentilador() {
		if (ventilador) {
			return "Sim";
		} else {
			return "Não";
		}
	}
	public void setVentilador(boolean ventilador) {
		this.ventilador = ventilador;
	}

	
	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	public String getIdentificacao() {
		return identificacao;
	}
	
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;  
	}
	public int getMesas() {
		return mesas;
	}
	public void setMesas(int mesas) {
		this.mesas = mesas;
	}


	public String isArCondicionado() {
		if(arCondicionado) {
			return "Sim";
		}
		return "Não";
	}


	public String isDisponivel() {
		if(disponivel) {
			return "Sim"; 
		} else {
			return "Não";
		}
		
	}

	
	
	
	

}
