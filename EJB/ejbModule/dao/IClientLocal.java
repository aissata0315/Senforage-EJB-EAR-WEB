package dao;

import java.util.List;

import javax.ejb.Local;

import entities.Client;
import entities.Village;

@Local
public interface IClientLocal {
	
	public int add(Client client);
	public Client getClient(int idClient);
	public Village getVillage(int idVillage);
	public List<Village> village();
	public List<Client> listeClient();


}
