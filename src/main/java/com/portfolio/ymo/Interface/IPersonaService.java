
package com.portfolio.ymo.Interface;

import com.portfolio.ymo.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer lista
    public List<Persona> getPersona();
    
    //Guardar obj de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar obj de tipo Persona por ID
    public void deletePersona(Long id);
    
    //Buscar persona por ID
    public Persona findPersona(Long id);
    
    
}
