package negocio;

import java.util.ArrayList;
import java.util.List;

import javabean.Job;

public class IJobDaoImplList implements IJobDao{
	
	private List<Job> lista;
	
	public IJobDaoImplList() {
		lista=new ArrayList<Job>();
		cargarDatos();
	}
	
	private void cargarDatos() {
		lista.add(new Job("IT_PROG", "Programador", 20000, 30000));
		lista.add(new Job("JF_PROY", "Jefe de Prouectp", 38000, 98000));
		lista.add(new Job("AD_PRES", "Presidente", 120000, 380000));
	}

	@Override
	public Job findById(String atributoPK) {
		
		for(Job job : lista) {
			if(job.getJobId().equals(atributoPK))
				return job;
		}
		return null;
	}

	@Override
	public int insertOne(Job object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateOne(Job object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(String atributoPK) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteObj(Job object) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Job> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

}
