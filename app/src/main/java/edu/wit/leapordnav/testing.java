package edu.wit.leapordnav;

import java.util.HashMap;

public class testing {

	static HashMap<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		map.put("Buildings", "Tudbury, Beatty");
		System.out.println(map.get("Buildings"));
	}
}