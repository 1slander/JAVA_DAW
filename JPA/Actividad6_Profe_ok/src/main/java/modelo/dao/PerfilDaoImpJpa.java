package modelo.dao;

import java.util.List;

import modelo.entities.Perfil;

public class PerfilDaoImpJpa extends AbsConexionJpa implements IPerfilDao{

	@Override
	public Perfil findById(Integer atributoPk) {
		
		return em.find(Perfil.class, atributoPk);
	}

	@Override
	public int insert(Perfil refEntidad) {
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
	public int update(Perfil atributoPK) {
		try {
			if(findById(atributoPK.getIdPerfil())!=null) {
				tx.begin();
					em.merge(atributoPK);
				tx.commit();
				filas=1;
			
			}else {
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
		Perfil per=null;
		try {
			per=findById(atributoPk);
			if(per!=null) {
				tx.begin();
					em.remove(per);
				tx.commit();
				filas=1;
			
			}else {
				filas=0;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			filas=-1;
		}
		return filas;
	}

	@Override
	public List<Perfil> findAll() {
		jpql="From Perfil p";
		query=em.createQuery(jpql);
		return query.getResultList();
	}

}
