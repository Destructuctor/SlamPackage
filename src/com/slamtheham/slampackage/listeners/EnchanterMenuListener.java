package com.slamtheham.slampackage.listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.slamtheham.slampackage.enchants.Books;
import com.slamtheham.slampackage.utils.Utils;

public class EnchanterMenuListener implements Listener {

	@EventHandler
	public void inventoryClick(InventoryClickEvent e) {
		if (e.getInventory().getTitle().equalsIgnoreCase(Utils.cc("&6&lEnchanter"))) {
			Player player = (Player) e.getWhoClicked();
			boolean top = e.getRawSlot() < e.getInventory().getSize();
			if (e.getCursor() != null) {
				e.setCancelled(true);
				
			} if (e.isShiftClick()) {
				e.setCancelled(true);
			
			} if (e.isShiftClick() && e.getInventory().getType() == InventoryType.PLAYER) {
				e.setCancelled(true);
				
			}
			if (!top) {
				e.setCancelled(true);
			}
			
			if (e.getAction() == InventoryAction.SWAP_WITH_CURSOR) {
				e.setCancelled(true);
			}
			if (e.getAction() == InventoryAction.MOVE_TO_OTHER_INVENTORY) {
				e.setCancelled(true);
			}
			if (e.getSlot() == 2 && top) {
				if (player.getLevel() >= 10) {
					player.setLevel(player.getLevel() - 10);
					player.getInventory().addItem(Books.simpleBook);
					e.setCancelled(true);
				} else if (player.getLevel() <= 10) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 3 && top) {
				if (player.getLevel() >= 20) {
					player.setLevel(player.getLevel() - 20);
					player.getInventory().addItem(Books.uniqueBook);
					e.setCancelled(true);
				} else if (player.getLevel() <= 20) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 4 && top) {
				if (player.getLevel() >= 40) {
					player.setLevel(player.getLevel() - 40);
					player.getInventory().addItem(Books.eliteBook);
					e.setCancelled(true);

				} else if (player.getLevel() <= 40) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 5 && top) {
				if (player.getLevel() >= 50) {
					player.getInventory().addItem(Books.ultimateBook);
					player.setLevel(player.getLevel() - 50);
					e.setCancelled(true);
				} else if (player.getLevel() <= 50) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			}

			if (e.getSlot() == 6 && top) {
				if (player.getLevel() >= 60) {
					player.getInventory().addItem(Books.legendaryBook);
					player.setLevel(player.getLevel() - 60);
					e.setCancelled(true);
				} else if (player.getLevel() <= 60) {
					player.sendMessage(Utils.cc("&c&lNot enough levels!"));
					e.setCancelled(true);
				}
			} 
			else {
				e.setCancelled(true);
			}
		}
	}
}
