package com.marina.Giorno1.config;

import javax.persistence.AttributeConverter;

public class StringAttributeConverter implements AttributeConverter<String, String> {

	@Override
	public String convertToDatabaseColumn(String attribute) {
		
		if(attribute == null) {
			return "";
		}
	
		String stringResponse = "";

		for (char c : attribute.toCharArray()) {
			String x = c + "";
			
			if(attribute.indexOf(c) % 2 == 0) {
				stringResponse += x + "xy";
			}else {
				stringResponse += x + "jk";
			}
			
		}
		return stringResponse;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		
		if(dbData == null) {
			return "";
		}
	
		String one = dbData.replace("xy", "");
		
		String two = one.replace("jk", "");
		
		return two;
	}

}
