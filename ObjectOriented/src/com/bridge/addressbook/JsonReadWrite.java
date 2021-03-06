package com.bridge.addressbook;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonReadWrite {
	ObjectMapper mapper;
	/*0-param Constructor*/
	public JsonReadWrite() {
		mapper = new ObjectMapper();
	}

	/* Constructor Using Field */
	public JsonReadWrite(ObjectMapper mapper) {
		this.mapper = mapper;
	}

	/* Method to remove a file */
	public void removeFile() throws JsonProcessingException, IOException {
		
		
	}
	
	/* Methode to write Java Object to json */
	public void writeFile(Person[] person) throws JsonGenerationException, JsonMappingException, IOException {
		Person[] person1 = zeapByPincode(person);
		mapper.writeValue(new File("person.json"), person1);
	}
	
	/* Methode to write Java Object to json */
	public Person[] readFile() throws JsonGenerationException, JsonMappingException, IOException {
		Person[] person1 = mapper.readValue(new File("person.json"), Person[].class);
		return person1;
	}
	
		//Zeap By PinCode
		public Person[] zeapByPincode(Person[] person) throws JsonGenerationException, JsonMappingException, IOException {
			for (int i = 1; i < person.length; i++) {
				for (int j = 0; j < (person.length - i); j++) {
					if(person[j].getPinCode() > person[j+1].getPinCode()) {
						Person[] temp = new Person[1];
						temp[0] = person[j];
						person[j] = person[j+1];
						person[j+1] = temp[0];
					}
				}
			}
			return person;
		}
	
}
