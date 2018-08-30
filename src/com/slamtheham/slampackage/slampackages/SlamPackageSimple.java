package com.slamtheham.slampackage.slampackages;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.SimpleEnchantments;

public class SlamPackageSimple {
	private static SlamPackageSimple instance = new SlamPackageSimple();
	
	public static SlamPackageSimple getInstance() {
		return instance;
	}

	
	
	public static ArrayList<SimpleEnchantments> getEnchantments1() {
		ArrayList<SimpleEnchantments> enchs = new ArrayList<SimpleEnchantments>();
		for (SimpleEnchantments en : SimpleEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
