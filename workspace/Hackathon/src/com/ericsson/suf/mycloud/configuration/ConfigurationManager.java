package com.ericsson.suf.mycloud.configuration;

import java.io.File;
import java.util.UUID;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class ConfigurationManager {
	private static ConfigurationManager configurationManager = new ConfigurationManager();
	private static ConfigurationStore configurationStore;
	File configurationFile = new File("configuration-store.xml"); 
	
	private ConfigurationManager(){
		// load config store
		try {
			if(!configurationFile.exists()) {
				configurationStore = new ConfigurationStore();
				return;
			}
			
			JAXBContext jaxbContext = JAXBContext.newInstance(ConfigurationStore.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			configurationStore = (ConfigurationStore) unmarshaller.unmarshal(configurationFile);			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
	
	public static ConfigurationManager getInstance(){
		return configurationManager; 
	}
	
	public String persistConfiguration(String emailID, String password, String userID){
		Store s = new Store();
		s.setUserID(userID);
		s.setUsername(emailID);
		s.setPassword(password);
		s.setId(UUID.randomUUID().toString());
		
		configurationStore.addStore(s);

		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(ConfigurationStore.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.marshal(configurationStore, configurationFile);			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return s.getId();
	}
	
}
