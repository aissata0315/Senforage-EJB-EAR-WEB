package dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Village;

@Stateless
public class VillageImpl implements IVillageLocal, IVillageRemote{

	@PersistenceContext(unitName="EJB_PU")
	private EntityManager em;
		
	@Override
	public int add(Village village) {
		try {
			em.persist(village);
			return 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		
	}

	@Override
	public List<Village> village() {
		
		return em.createQuery("select v from Village v ").getResultList();
	}

}
