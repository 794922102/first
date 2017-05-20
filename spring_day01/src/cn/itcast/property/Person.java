package cn.itcast.property;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private String pnaem;
	private String[] arrs;
	private List<String> list;
	private Map<String,String> map;
	private Properties properties;
	
	
	public void test1() {
		System.out.println("arrs:"+arrs);
		System.out.println("list:"+list);
		System.out.println("map:"+map);
		System.out.println("properties"+properties);
	}
	
	public String[] getArrs() {
		return arrs;
	}

	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	
	public String getPnaem() {
		return pnaem;
	}

	public void setPnaem(String pnaem) {
		this.pnaem = pnaem;
	}
	
}
