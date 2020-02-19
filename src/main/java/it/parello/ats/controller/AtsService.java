package it.parello.ats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.parello.ats.beans.ATM;
import it.parello.ats.interfaces.IService;

@Service
public class AtsService implements IService{

	@Autowired
	private AtsRepository repository;
	
	public List<ATM> listElements() {
		return repository.listElements();
	}

	public String addElements(String element) {
		return repository.addElements(element);
	}

	public boolean removeElement(int id) {
		return repository.removeElement(id);
	}

	public ATM findByString(String element) {
		return repository.findByString(element);
	}
	
}
