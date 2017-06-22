package com.ibm.cloudoe.ecaas.samples;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.ibm.json.java.JSONArray;
import com.ibm.json.java.JSONObject;

/**
 * Define the elastic caching Operation, mainly in order to program operation.
 * 
 * You can refer to the Elastic Caching Java Native API Specifition
 * http://pic.dhe.ibm.com/infocenter/wdpxc/v2r5/index.jsp?topc=%2Fcom.ibm.websphere.datapower.xc.doc%2Fcxslibertyfeats.html
 */
public class ECacheConnection {

	// define session instance of ObjectGrid
	// define temporary store grid entries keys
	private static List<String> keys;

	// define the map name of the stored keys
	private static String keysMapName = "sample2.NONE.P";
	// define the key name of the stored keys
	private static String keyNameOfKeysMap = "keys.store";
 	private static HashMap<String,String> data;

	static {
		initECaaS();
	}

	/**
	 * Initialize the session instance of ObjectGrid.
	 */
	public static void initECaaS() {
		
		data = new HashMap();
		keys = new ArrayList();

	}

	private static String getDataCacheServiceName(){
		String dataCacheName = "none";
		return dataCacheName;
	}
	
	private static String getAppName() {
		return "VBD";
	}

	/**
	 * Get value of this key in mapName
	 * 
	 * @param mapName
	 * @param key
	 * @return
	 * @throws ObjectGridException
	 */
	public static Object getData(String mapName, String key) {
		return data.get(key);
	}

	/**
	 * Update or insert this value in mapName
	 * 
	 * @param mapName
	 * @param key
	 * @param newValue
	 * @throws ObjectGridException
	 */
	public static void postData(String mapName, String key, String newValue) {
		data.put(key,newValue);
		postKeyTemp(key);
	}

	/**
	 * Delete this key/value in mapName
	 * 
	 * @param mapName
	 * @param key
	 * @throws ObjectGridException
	 */
	public static void deleteData(String mapName, String key) {
		data.remove(key);
		deleteKeyTemp(key);
	}

	/**
	 * Get all ECache Object in mapName
	 * 
	 * @param mapName
	 * @return
	 * @throws ObjectGridException
	 */
	public static List<ECache> getAllData(String mapName) {
		keys = getAllKeys(keysMapName);
	
		List<ECache> res = new ArrayList<ECache>();
		for (int i = 0; i < keys.size(); i++) {
			String a = keys.get(i);
			res.add(new ECache(keys.get(i), data.get(a)));
		}

		return res;
	}

	/**
	 * Get all keys in mapName
	 * 
	 * @param map
	 * @return
	 * @throws ObjectGridException
	 */
	public static List<String> getAllKeys(String mapName) {
		
		for (String key: data.keySet()) {
			if (!keys.contains(key)) keys.add(key);
		}
		//data.keySet().addAll(keys);
		return keys;
	}

	/**
	 * Add this key in temp keys map
	 * 
	 * @param key
	 * @throws ObjectGridException
	 */
	private static void postKeyTemp(String key) {
		keys = getAllKeys(keysMapName);
		if (!keys.contains(key))
			keys.add(key);
	}

	/**
	 * Delete this key/value in temp keys map
	 * 
	 * @param key
	 * @throws ObjectGridException
	 */
	private static void deleteKeyTemp(String key) {
		keys = getAllKeys(keysMapName);
		if (keys.contains(key))
			keys.remove(key);
	}

	/**
	 * Get all ECache Object
	 * 
	 * @param keys
	 * @param values
	 * @return
	 */
	public static List<ECache> getECaches(List<String> keys, List<String> values) {
		List<ECache> res = new ArrayList<ECache>();
		for (int i = 0; i < keys.size(); i++) {
			res.add(new ECache(keys.get(i), values.get(i)));
		}
		return res;
	}

}
