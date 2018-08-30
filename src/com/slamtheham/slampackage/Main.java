package com.slamtheham.slampackage;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.slamtheham.slampackage.commands.EnchanterCommand;
import com.slamtheham.slampackage.enchants.Books;
import com.slamtheham.slampackage.enchants.SimpleEnchantments;
import com.slamtheham.slampackage.listeners.BookApplyListener;
import com.slamtheham.slampackage.listeners.BookInteractListener;
import com.slamtheham.slampackage.listeners.EnchanterMenuListener;
import com.slamtheham.slampackage.menus.EnchanterMenu;
import com.slamtheham.slampackage.slampackages.SlamPackageLegendary;

public class Main extends JavaPlugin {
	public static SlamPackageLegendary SP = SlamPackageLegendary.getInstance();
	public static Main instance;
	EnchanterMenu eCom = new EnchanterMenu();
	
	SimpleEnchantments sEnch;
	public void onEnable() {
		instance = this;
		for (SimpleEnchantments s : SimpleEnchantments.values()) {
			s.load();
		}
		Books.setupBooks();
		getCommand("enchanter").setExecutor(new EnchanterCommand());
	
		EnchanterMenu.createMenu();
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.GREEN + "" + ChatColor.BOLD + "ENABLED" + ChatColor.YELLOW + "!");
		
		Bukkit.getServer().getPluginManager().registerEvents(new BookApplyListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new BookInteractListener(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new EnchanterMenuListener(), this);
		
		
		
	}
	
	public void onDisable() {
		Bukkit.getServer().getLogger().info(ChatColor.GREEN + "SlamPackage Indev-v8.21.2018-0.01" + ChatColor.YELLOW + "has been " + ChatColor.RED + "" + ChatColor.BOLD + "DISABLED" + ChatColor.YELLOW + "!");
	}
	public static Main getPlugin(){
		   return instance;
	
	}
	
}
