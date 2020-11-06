package dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Client;
import entities.Village;
@Stateless
public class ClientImpl implements IClientLocal, IClientRemote{
	

	@PersistenceContext(unitName="EJB_PU")
	private EntityManager em;

	@Override
	public int add(Client client) {
		int ok=0;
		try {
			em.getTransaction().begin();
			em.persist(client);
			em.getTransaction().commit();
			ok = 1;
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return ok;
	}

	@Override
	public Client getClient(int idClient) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Client> listeClient() {
		return em.createQuery("select c from client c ").getResultList();

	}

	@Override
	public Village getVillage(int idVillage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Village> village() {
		// TODO Auto-generated method stub
		return null;
	}

}
