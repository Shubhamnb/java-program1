package com.bridge.JSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONInventeryManagement2 {
	public static void main(String[] args){
		JSONParser parser = new JSONParser();
		try {
			//Parse Json File data and Store into Object
			Object obj = parser.parse(new FileReader("JsonFile.json"));
			
			
			//Convert Object class Object into JSONObject class
			JSONObject json = (JSONObject)obj;
			
			
			
			//LoopArray for RiceInventary
			JSONArray riceArray = (JSONArray)json.get("rice");
			Map map = new HashMap();
			Iterator it = riceArray.iterator();
			System.out.println("===================Rice===================");
			
			while (it.hasNext()) {
				map.putAll((Map)it.next());
				System.out.println(map.get("name")+"|| Weight :"+map.get("weight")+"|| Price : "+map.get("price"));
			}
			
			
		
			//For next Line
			System.out.println();
			
			
			//LoopArray for PulsesInventary
			JSONArray pulsesArray = (JSONArray)json.get("pulses");
			
			it = pulsesArray.iterator();
			System.out.println("===================Pulses===================");
			
			while (it.hasNext()) {
				map.putAll((Map)it.next());
				System.out.println(map.get("name")+"|| Weight :"+map.get("weight")+"|| Price : "+map.get("price"));
			}
			//For next Line
			System.out.println();
			
			//LoopArray for WheatsInventary
			JSONArray wheatsArray = (JSONArray)json.get("wheats");
			
			it = riceArray.iterator();
			System.out.println("===================Wheats===================");
			
			while (it.hasNext()) {
				map.putAll((Map)it.next());
				System.out.println(map.get("name")+"|| Weight :"+map.get("weight")+"|| Price : "+map.get("price"));
			}
			
			
			
		}
		catch (FileNotFoundException fne) {
			fne.printStackTrace();
		}catch (IOException ioe) {
			ioe.printStackTrace();
		}catch ( ParseException pe ) {
			pe.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
