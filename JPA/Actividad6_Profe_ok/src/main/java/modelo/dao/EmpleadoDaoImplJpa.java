package modelo.dao;

import java.util.List;

import modelo.entities.Empleado;

public class EmpleadoDaoImplJpa extends AbsConexionJpa implements IEmpleadoDao{
	
		
	
	@Override
	public Empleado findById(Integer atributoPk) {
		
		return em.find(Empleado.class, atributoPk);
	}

	@Override
	public int insert(Empleado refEntidad) {
		
	
		try {
		tx.begin();
			em.persist(refEntidad);
		tx.commit();
		filas=1;
		} catch(Exception e) {
		e.printStackTrace();
		filas=0;
		}
		return filas;
	}

	@Override
	public int update(Empleado atributoPK) {
		try {
			if(findById(atributoPK.getIdEmpl())!=null) {
			tx.begin();
				em.merge(atributoPK);
				tx.commit();
				filas=1;
			} else {
				filas =0;
			}
		} catch (Exception e) {
			e.printStackTrace();
			filas=-1;
		}
		return filas;
	}

	@Override
	public int deletebyId(Integer atributoPk) {
		Empleado emp=null;
		try {
			emp=findById(atributoPk);
			if(emp!=null) {
				tx.begin();
					em.remove(emp);
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
	public List<Empleado> findAll() {
		jpql="from Empleado e";
		query=em.createQuery(jpql);
		return query.getResultList();
	}

	@Override
	public List<Empleado> empleadosByDepartamento(int idDepar) {
		jpql="FROM Empleado e WHERE e.departamento.idDepar = :dept";
		query=em.createQuery(jpql);
		query.setParameter("dept", idDepar);
		return query.getResultList();
	}

	@Override
	public List<Empleado> empleadosByGenero(char sexo) {
		jpql="FROM Empleado e WHERE e.genero = :sexo";
		query=em.createQuery(jpql);
		query.setParameter("sexo",String.valueOf(sexo));
		return query.getResultList();
	}

	@Override
	public List<Empleado> empleadosByApellido(String subcadena) {
		jpql="FROM Empleado e WHERE e.apellidos LIKE :subcadena";
		query=em.createQuery(jpql);
		query.setParameter("subcadena", "%" + subcadena + "%");
		
		return query.getResultList();
	}

	@Override
	public double salarioTotal() {
		jpql="SELECT SUM(e.salario) FROM Empleado e";
		query=em.createQuery(jpql);
		
		return (double) query.getSingleResult();
		
//		double total= 0;
//		
//		for(Empleado e : findAll()) {
//			total+=e.getSalario();
//		}
//		
//		return total;
	}

	@Override
	public double salarioTotal(int idDepar) {
		jpql="SELECT SUM(e.salario) FROM Empleado e WHERE e.departamento.idDepar = :id";
		query=em.createQuery(jpql);
		query.setParameter("id", idDepar);
		
		return (double) query.getSingleResult();
	}

	@Override
	public List<Empleado> empleadosByIdPerfil(int idPerfil) {
		jpql="FROM Empleado e WHERE e.perfil.idPerfil = :perfil";
		query=em.createQuery(jpql);
		query.setParameter("perfil", idPerfil);
		return query.getResultList();
	}

	

}
