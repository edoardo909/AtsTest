package it.parello.ats.interfaces;

import java.util.List;

import it.parello.ats.beans.ATM;

public interface IService {
	public List<ATM> listElements();
	public ATM findByString(String element);
	public String addElements(String element);
	public boolean removeElement(int id);
}
