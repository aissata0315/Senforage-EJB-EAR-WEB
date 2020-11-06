package dao;

import java.util.List;

import javax.ejb.Remote;

import entities.Village;

@Remote
public interface IVillageRemote {
	public int add(Village village);
	public List<Village> village();

}
