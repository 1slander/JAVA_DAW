package negocio;

import java.util.List;

public interface IInstitutoDao<T> {
	
	boolean altaPersona(T persona);
	T buscarPersona(String nif);
	List<T> buscarTodas();
	boolean eliminarPersona(T persona);
	List<T> buscarPersonasPorTipo(String tipoPersona);
}
