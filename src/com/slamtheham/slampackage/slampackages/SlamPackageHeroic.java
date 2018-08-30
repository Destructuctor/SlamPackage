package com.slamtheham.slampackage.slampackages;

import java.util.ArrayList;

import com.slamtheham.slampackage.enchants.HeroicEnchantments;

public class SlamPackageHeroic {
	private static SlamPackageHeroic instance = new SlamPackageHeroic();

	public static SlamPackageHeroic getInstance() {
		return instance;
	}

	public static ArrayList<HeroicEnchantments> getEnchantments() {
		ArrayList<HeroicEnchantments> enchs = new ArrayList<HeroicEnchantments>();
		for (HeroicEnchantments en : HeroicEnchantments.values()) {
			enchs.add(en);
		}
		return enchs;
	}
}
