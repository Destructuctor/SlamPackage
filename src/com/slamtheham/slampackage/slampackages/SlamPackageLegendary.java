package com.slamtheham.slampackage.slampackages;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.LegendaryEnchantments;

public class SlamPackageLegendary {
	private static SlamPackageLegendary instance = new SlamPackageLegendary();

	public static SlamPackageLegendary getInstance() {
		return instance;
	}
	public static ArrayList<LegendaryEnchantments> getEnchantments() {
		ArrayList<LegendaryEnchantments> enchs = new ArrayList<LegendaryEnchantments>();
		for(LegendaryEnchantments en : LegendaryEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
