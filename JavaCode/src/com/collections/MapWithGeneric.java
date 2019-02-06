package com.collections;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class MapWithGeneric {
	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Irfan");
		map.put(null, "varsha");
		map.put(2, "ali");
		map.put(4, "kali");
		map.put(3, null);
		
	for(Map.Entry<Integer, String> entry :map.entrySet()) {
		entry.getKey();
		entry.getValue();
		System.out.println(entry);
		
	}
	}

}
