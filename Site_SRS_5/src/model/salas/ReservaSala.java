package model.salas;


import model.reserva.CadastrarReserva;
import model.reserva.Reserva;
import model.reserva.ReservaBuilder;


public class ReservaSala {
	
	public static void reservar(String salaNome) {  
				
		Reserva reserva = new ReservaBuilder().build();
		CadastrarReserva.cadastrar(reserva, salaNome);
 
		UpdateSala.update(salaNome, "disponivel", "Não");
		
	}

}
