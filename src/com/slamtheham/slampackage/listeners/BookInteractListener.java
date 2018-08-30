package com.slamtheham.slampackage.listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import com.slamtheham.slampackage.enchants.SimpleEnchantedBook;
import com.slamtheham.slampackage.enchants.SimpleEnchantments;
import com.slamtheham.slampackage.slampackages.SlamPackageSimple;
import com.slamtheham.slampackage.utils.Utils;

public class BookInteractListener implements Listener {
	

	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		ItemStack hand = e.getPlayer().getItemInHand();
		Random rand = new Random();
		if (hand == null) {
			
		}
		if (e.getAction() == Action.RIGHT_CLICK_AIR && hand != null && hand.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.cc("&f&lSimple Enchantment Book &7(Right Click)"))) {
			
			int randn = rand.nextInt(SimpleEnchantments.values().length);
			
			SlamPackageSimple.getInstance();
			ItemStack eb = new SimpleEnchantedBook(SlamPackageSimple.getEnchantments1().get(rand.nextInt(SimpleEnchantments.values().length)), rand.nextInt(3)).buildBook();
			player.getItemInHand().setAmount(player.getItemInHand().getAmount() - 1);
			if (player.getItemInHand().getAmount() <= 1) {
				player.getItemInHand().setType(Material.AIR);
			}
			player.getInventory().addItem(eb);
			
			player.updateInventory();

		} else {
			
		} 
		
		if (e.getAction() == Action.RIGHT_CLICK_AIR && hand.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.cc("&b&lElite Enchanted Book &7(Right Click)"))) {
			player.sendMessage("Currently not implemented");
		}
	}

}
