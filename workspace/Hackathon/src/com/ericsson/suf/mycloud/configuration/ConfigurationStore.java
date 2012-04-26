package com.ericsson.suf.mycloud.configuration;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ConfigurationStore {
	private List<Store> stores = new ArrayList<Store>();

	public List<Store> getStores() {
		return stores;
	}

	public void setStores(List<Store> stores) {
		this.stores = stores;
	}
	
	public void addStore(Store store) {
		stores.add(store);
	}
	
}
