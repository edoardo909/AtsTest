package it.parello.ats.beans;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ATM {

	@JsonProperty("address")
	private Map<String,Object> address;
	@JsonProperty("street")
	private String street;
	@JsonProperty("housenumber")
	private String housenumber;
	@JsonProperty("postalcode")
	private String postalcode;
	@JsonProperty("city")
	private String city;
	@JsonProperty("geoLocation")
	private Map<String,Object> geoLocation;
	@JsonProperty("lat")
	private String lat;
	@JsonProperty("lng")
	private String lng;
	@JsonProperty("distance")
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
