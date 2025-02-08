package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Region;

public class RegionDaoImplList implements IRegionDao{
	
	List<Region>lista;
	
	public RegionDaoImplList() {
		lista = new ArrayList<Region>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Region(1,"Europa"));
		lista.add(new Region(2,"Asia"));
		lista.add(new Region(3,"America"));
		lista.add(new Region(4,"Oceania"));
		lista.add(new Region(5,"Africa"));
	}

	@Override
	public Region findById(Integer atributoPK) {
		for(Region region:lista) {
			if(region.getRegionId() == atributoPK)
				return region;
		}
		return null;
	}

	@Override
	public int insertOne(Region object) {
		if(lista.contains(object))
			return 0;
		else {
			lista.add(object);
			return 1;
		}
		
	}

	@Override
	public int updateOne(Region object) {
		int position = lista.indexOf(object);
		if(position != -1) {
			lista.set(position, object);
			return 1;
		} 
		return 0;
	}

	@Override
	public int deleteById(Integer atributoPK) {
		Region region = findById(atributoPK);
		return deleteObj(region);
	 
		/* return deleteObj(findById(atributoPK)*/
	}

	@Override
	public int deleteObj(Region object) {
		
		return lista.remove(object) ? 1 : 0;
		
	}

	@Override
	public List<Region> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

}
