package dao;

import java.util.List;

import javax.ejb.Local;

import entities.Village;

@Local
public interface IVillageLocal {
	public int add(Village village);
	public List<Village> village();

}
