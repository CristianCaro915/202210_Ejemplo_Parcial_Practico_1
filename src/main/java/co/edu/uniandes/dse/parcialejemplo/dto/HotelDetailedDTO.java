package co.edu.uniandes.dse.parcialejemplo.dto;

import java.util.ArrayList;
import java.util.List;
import co.edu.uniandes.dse.parcialejemplo.entities.HabitacionEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelDetailedDTO {
    

    
	private List<HabitacionEntity> habitaciones = new ArrayList<>();
}
