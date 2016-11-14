package org.openmrs.api.db;
//Need to integrate the jasypt library as a part of the project

public class EncyrptionUtil{
	
	private String password;
	private String secretQuestion;
	private String secretAnswer;
	
	EncryptionUtil(){
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("jasypt"); // could be got from web, env variable..
		Properties props = new EncryptableProperties(encryptor);
		props.load(new FileInputStream("File Path"));
	
		//The properties file consists of the values which are being read below
		
		password = props.getProperty("test.password");
		secretQuestion = props.getProperty("test.secretQuestion");
		secretAnswer = props.getProperty("test.secretAnswer");
	}
	
	
	
}