package it.parello.ats.beans;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATM {

	@JsonProperty
	private Map<String,Object> address;
	@JsonProperty
	private String street;
	@JsonProperty
	private String housenumber;
	@JsonProperty
	private String postalcode;
	@JsonProperty
	private String city;
	@JsonProperty
	private Map<String,Object> geoLocation;
	@JsonProperty
	private String lat;
	@JsonProperty
	private String lng;
	@JsonProperty
	private String distance; 
	
	public Map<String,Object> getAddress() {
		return address;
	}
	public void setAddress(Map<String,Object> address) {
		this.address = address;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHousenumber() {
		return housenumber;
	}
	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Map<String,Object> getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(Map<String,Object> geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	private String type;
	
}
