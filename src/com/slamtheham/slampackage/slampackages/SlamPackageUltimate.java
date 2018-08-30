package com.slamtheham.slampackage.slampackages;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.UltimateEnchantments;

public class SlamPackageUltimate {
	private static SlamPackageUltimate instance = new SlamPackageUltimate();

	public static SlamPackageUltimate getInstance() {
		return instance;
	}
	public static ArrayList<UltimateEnchantments> getEnchantments() {
		ArrayList<UltimateEnchantments> enchs = new ArrayList<UltimateEnchantments>();
		for(UltimateEnchantments en : UltimateEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
