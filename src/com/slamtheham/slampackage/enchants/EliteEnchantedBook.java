package com.slamtheham.slampackage.enchants;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import com.slamtheham.slampackage.Main;
import com.slamtheham.slampackage.utils.ItemBuilder;
import com.slamtheham.slampackage.utils.Utils;

public class EliteEnchantedBook {
	private EliteEnchantments enchantment;
	private int power;
	private int amount;
	private int destroy_rate;
	private int success_rate;
	
	
	
	/**
	 * 
	 * 
	 * @param enchantment The enchantment that you choose
	 * @return Enchantments
	 */
	
	public EliteEnchantedBook(EliteEnchantments enchantment, Integer power) {
		this.enchantment = enchantment;
		this.amount = 1;
		this.power = power;
		
		
		
	}
	
	public EliteEnchantments getEnchantment() {
		return this.enchantment;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public String convertPower(Integer i) {
		if(i == 0) return "I";
		if(i == 1) return "I";
		if(i == 2) return "II";
		if(i == 3) return "III";
		if(i == 4) return "IV";
		if(i == 5) return "V";
		if(i == 6) return "VI";
		if(i == 7) return "VII";
		if(i == 8) return "VII";
		if(i == 9) return "IX";
		if(i == 10) return "X";
		return i + "";
	}
	
	public ItemStack buildBook() {
		Random rand = new Random();
		String name = Utils.cc("&b") + Utils.cc(enchantment.getName()) + convertPower(power);
		List<String> lore = new ArrayList<String>();

		for (String m : enchantment.getDesc()) {
			lore.add(Utils.cc(m));
			lore.add(Utils.cc("&aSuccess Rate: " + rand.nextInt(100) + "&a%"));
			lore.add(Utils.cc("&cDestroy Rate: " + rand.nextInt(100) + "&c%"));
			
		}

		return new ItemBuilder(Material.BOOK).setDisplayName(name).setLore1(lore);
	}
}

