package com.bridge.commercialdataprosessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Utility.LinkedList;

public class JSONManagement {
	
	private String companyFilePath = "companyStock.json";
	private String userFilePath = "userStock.json";
	JSONParser parser = new JSONParser();
	JSONObject jsonObj;
	JSONArray  jsonArray, array;
	JSONObject simple;
	
	
	
	public void addToLinkedList() throws FileNotFoundException, IOException, ParseException {
		
		LinkedList list = new LinkedList();
		File file1 = new File(companyFilePath);
		parser = new JSONParser();
		jsonObj = (JSONObject)parser.parse(new FileReader(file1));
		array = (JSONArray)jsonObj.get("StockDetails");
		
		CommercialCompanyProj companyShare;
		CommercialUserProj userShare;
		
		
		JSONObject obj;
		System.out.println("Company Share :");
		for(int i=0;i<array.size();i++) 
		{
		obj = (JSONObject)array.get(i);
		
		
		companyShare = new CommercialCompanyProj();
		String sharePrice = obj.get("SharePrice").toString();
		companyShare.setSharePrice(sharePrice);
		
		String noOfShare = obj.get("NoOfShare").toString();
		companyShare.setNoOFShare(noOfShare);
		
		String stockName = obj.get("StockName").toString();
		companyShare.setStockName(stockName);
		
		String stockSymbol = obj.get("StockSymbol").toString();
		companyShare.setStockSymbol(stockSymbol);
		
		list.add(companyShare);
		}	
		list.show();
		
		
		LinkedList list1 = new LinkedList();
		File file2 = new File(userFilePath);
		parser = new JSONParser();
		jsonObj = (JSONObject)parser.parse(new FileReader(file2));
		array  = (JSONArray)jsonObj.get("UserDetails");
		
		
		System.out.println("User Share :");
		for(int i=0;i<array.size();i++) 
		{
		obj = (JSONObject)array.get(i);
		
		
		userShare = new CommercialUserProj();
		String sharePrice = obj.get("SharePrice").toString();
		userShare.setPrice(sharePrice);
		
		String noOfShare = obj.get("NoOfShare").toString();
		userShare.setNoOfShares(noOfShare);
		
		String userName = obj.get("UserName").toString();
		userShare.setUserName(userName);
		
		
		
		list1.add(userShare);
		}	
		list1.show();
	}
	
	@SuppressWarnings("unchecked")
	public void createUserJsonObj(CommercialUserProj userProj, File file) throws Exception {
		
		jsonObj = (JSONObject) parser.parse(new FileReader(file));
		jsonArray = (JSONArray) jsonObj.get("UserDetails");
		simple = new JSONObject();
		
		simple.put("UserName", userProj.getUserName());
		simple.put("NoOfShare", userProj.getNoOfShares());
		simple.put("SharePrice", userProj.getPrice());
		jsonArray.add(simple);
		jsonObj.put("UserDetails", jsonArray);
		System.out.println(jsonObj);
		writeIntoFile(jsonObj, userFilePath);
	}
	
	
	
	@SuppressWarnings("unchecked")
	public void createCompanyJsonObj(CommercialCompanyProj companyProj, File file) throws Exception {
		
		jsonObj = (JSONObject) parser.parse(new FileReader(file));
		jsonArray = (JSONArray) jsonObj.get("StockDetails");
		simple = new JSONObject();
		
		simple.put("StockName", companyProj.getStockName());
		simple.put("StockSymbol", companyProj.getStockSymbol());
		simple.put("NoOfShare", companyProj.getNoOFShare());
		simple.put("SharePrice", companyProj.getSharePrice());
		jsonArray.add(simple);
		jsonObj.put("StockDetails", jsonArray);
		System.out.println(jsonObj);
		writeIntoFile(jsonObj, companyFilePath);
	}
	
	
	
	public void writeIntoFile(JSONObject jsonObj2, String filePath) throws Exception {
		File file = new File(filePath);
		@SuppressWarnings("resource")
		FileWriter writer = new FileWriter(file);
		writer.write(jsonObj2.toString());
		writer.flush();
	}
	
	
	public void printCompanyReport() throws Exception {
		File file = new File(companyFilePath);
		jsonObj = (JSONObject) parser.parse(new FileReader(file));
		array = (JSONArray) jsonObj.get("StockDetails");
		System.out.println(array);
	}
	
	
	public void printUserReport() throws Exception {
		File file = new File(userFilePath);
		jsonObj = (JSONObject) parser.parse(new FileReader(file));
		array = (JSONArray) jsonObj.get("UserDetails");
		System.out.println(array);
	}
}
