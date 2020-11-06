package dao;
import java.util.List;

import javax.ejb.Remote;

import entities.Client;
import entities.Village;

@Remote
public interface IClientRemote {
	
	public int add(Client client);
	public Client getClient(int idClient);
	public Village getVillage(int idVillage);
	public List<Village> village();
	public List<Client> listeClient();

}
