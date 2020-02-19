package it.parello.ats.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.xml.ws.http.HTTPException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.parello.ats.beans.ATM;
import it.parello.ats.interfaces.IService;

@Repository
public class AtsRepository implements IService {

	private static Logger logger = LoggerFactory.getLogger(AtsRepository.class);

	public List<ATM> listElements() {
		String url = "https://www.dropbox.com/s/6fg0k2wxwrheyqk/ATMs?dl=1";
		HttpURLConnection httpURLConnection = null;
		try {

			httpURLConnection = (HttpURLConnection) new URL(url).openConnection();
			httpURLConnection.setRequestMethod("GET");
			httpURLConnection.setDoOutput(true);

			InputStream in = httpURLConnection.getInputStream();

			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			List<ATM> data = mapper.readValue(in, new TypeReference<List<ATM>>(){});
			logger.info(String.format("CONTENT %s", data.get(0).getAddress()));
			logger.info(String.format("CONTENT %s", data.get(1)));

			return data;

		} catch (IOException e) {
			e.printStackTrace();
		} catch (HTTPException e) {
			e.printStackTrace();
		} finally {
			if (httpURLConnection != null) {
				httpURLConnection.disconnect();
			}
		}
		return null;
	}

	public ATM findByString(String element) {
		return listElements().get(element.indexOf(element));
	}

	public String addElements(String element) {
		// TODO Auto-generated method stub
		return null;
	}



	public boolean removeElement(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
