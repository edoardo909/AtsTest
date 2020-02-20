package it.parello.ats.interfaces;

import java.util.List;

import it.parello.ats.beans.ATM;

public interface IService {
	public List<ATM> listElements();
	public List<ATM> findByString(String element);
}
