package it.parello.ats.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.ws.http.HTTPException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.parello.ats.beans.ATM;
import it.parello.ats.interfaces.IService;

@Service
public class AtsService implements IService{

	private static Logger logger = LoggerFactory.getLogger(AtsService.class);
	
	public List<ATM> listElements() {
		String url = "https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1";
		HttpURLConnection httpURLConnection = null;
		try {
			// open connection
			httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
			httpURLConnection.setRequestMethod("GET");
			httpURLConnection.setDoOutput(true);
			// read data from  json
			InputStream in = httpURLConnection.getInputStream();
			// map the data into a list
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			List<ATM> data = mapper.readValue(in, new TypeReference<List<ATM>>(){});
			return data;

		} catch (IOException e) {
			e.printStackTrace();
		} catch (HTTPException e) {
			e.printStackTrace();
		} finally {
			// close connection
			if (httpURLConnection != null) {
				httpURLConnection.disconnect();
			}
		}
		return null;
	}
	
	/**
	 * i've implemented a very basic search engine:
	 * it compares the search string to any component of the json
	 * by first putting all letters to lower case
	 * and then by checking if the string is found within the json file.
	 * finally it adds all the found results into a list and returns it
	 */
	public List<ATM> findByString(String element) {
		List<ATM> atmList = listElements();
		List<ATM> newAtmList = new ArrayList<ATM>();
		element = element.toLowerCase();
		for(ATM atm : atmList) {
			if(			atm.getAddress().get("street").toString().toLowerCase().contains(element)
					||	atm.getAddress().get("housenumber").toString().toLowerCase().contains(element)
					||	atm.getAddress().get("postalcode").toString().toLowerCase().contains(element)
					||	atm.getAddress().get("city").toString().toLowerCase().contains(element)
					||	atm.getDistance().toString().toLowerCase().contains(element)){
				newAtmList.add(atm);
			}
		}
		return newAtmList;
	}
}
