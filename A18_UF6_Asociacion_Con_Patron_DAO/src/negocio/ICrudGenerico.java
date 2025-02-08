package negocio;

import java.util.List;

public interface ICrudGenerico<J, ID> {
	
	J findById(ID atributoPK);
	int insertOne(J object);
	int updateOne(J object);
	int deleteById(ID atributoPK);
	int deleteObj(J object);
	List<J> findAll();
	

}
