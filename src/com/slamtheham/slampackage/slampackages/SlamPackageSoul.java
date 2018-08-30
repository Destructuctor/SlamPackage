package com.slamtheham.slampackage.slampackages;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.SoulEnchantments;

public class SlamPackageSoul {
	private static SlamPackageSoul instance = new SlamPackageSoul();

	public static SlamPackageSoul getInstance() {
		return instance;
	}

	public static ArrayList<SoulEnchantments> getEnchantments() {
		ArrayList<SoulEnchantments> enchs = new ArrayList<SoulEnchantments>();
		for (SoulEnchantments en : SoulEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
