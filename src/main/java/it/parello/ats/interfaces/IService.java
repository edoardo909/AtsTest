package it.parello.ats.interfaces;

import java.util.List;

public interface IService {
	public List<String> listElements();
	public List<String> findByString(String element);
	public String addElements(String element);
	public String getElement(int id);
	public boolean removeElement(int id);
}
