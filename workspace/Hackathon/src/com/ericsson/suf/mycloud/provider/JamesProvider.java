package com.ericsson.suf.mycloud.provider;


public class JamesProvider extends AbstractProvider {

	private static JamesProvider instance = new JamesProvider();
	
	private JamesProvider() {
		providerDefaults.put("mail.smtp.host", "localhost");
		providerDefaults.put("mail.smtp.port", "5525");
	}
	
	public static JamesProvider getInstance() {
		return instance;
	}
	
}
