package co.edu.uniandes.dse.parcialejemplo.dto;

import co.edu.uniandes.dse.parcialejemplo.entities.HotelEntity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HabitacionDTO {
	private Long id;
    private Integer numIdentificacion;
	private Integer numPersonas;
	private Integer numCamas;
	private Integer numBanios;
	private HotelEntity hotel;
}
