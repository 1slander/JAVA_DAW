package modelo.dao;

import java.util.List;

import modelo.entities.Departamento;

public class DepartamentoDaoImpJpa extends AbsConexionJpa implements IDepartamentoDao{

	@Override
	public Departamento findById(Integer atributoPk) {
		
		return em.find(Departamento.class, atributoPk);
	}

	@Override
	public int insert(Departamento refEntidad) {
		try {
			tx.begin();
				em.persist(refEntidad);
			tx.commit();
			filas=1;
			
		} catch (Exception e) {
			e.printStackTrace();
			filas=0;
		}
		return filas;
	}

	@Override
	public int update(Departamento atributoPK) {
		try {
			if(findById(atributoPK.getIdDepar())!=null) {
				tx.begin();
					em.merge(atributoPK);
				tx.commit();
				filas=1;
			} else {
				filas=0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			filas=-1;
		}
		return filas;
	}

	@Override
	public int deletebyId(Integer atributoPk) {
		Departamento dep1;
		try {
			dep1=findById(atributoPk);
			if(dep1!=null) {
				tx.begin();
					em.remove(dep1);
				tx.commit();
				filas=1;
			} else {
				filas=0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			filas=-1;
		}
		return filas;
	}

	@Override
	public List<Departamento> findAll() {
		jpql="FROM Departamento d";
		query=em.createQuery(jpql);
		
		return query.getResultList();
	}

}
