package com.slamtheham.slampackage.slampackages;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.EliteEnchantments;

public class SlamPackageElite {
	private static SlamPackageElite instance = new SlamPackageElite();

	public static SlamPackageElite getInstance() {
		return instance;
	}
	public static ArrayList<EliteEnchantments> getEnchantments() {
		ArrayList<EliteEnchantments> enchs = new ArrayList<EliteEnchantments>();
		for(EliteEnchantments en : EliteEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
