package com.slamtheham.slampackage.slampackages;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.UniqueEnchantments;

public class SlamPackageUnique {
	private static SlamPackageUnique instance = new SlamPackageUnique();

	public static SlamPackageUnique getInstance() {
		return instance;
	}
	public static ArrayList<UniqueEnchantments> getEnchantments() {
		ArrayList<UniqueEnchantments> enchs = new ArrayList<UniqueEnchantments>();
		for(UniqueEnchantments en : UniqueEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
