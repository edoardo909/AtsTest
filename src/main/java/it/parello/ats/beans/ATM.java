package it.parello.ats.beans;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATM {

	@JsonProperty
	private Map<String,Object> address;
	@JsonProperty
	private String distance; 
	
	public Map<String,Object> getAddress() {
		return address;
	}
	public void setAddress(Map<String,Object> address) {
		this.address = address;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	
}
