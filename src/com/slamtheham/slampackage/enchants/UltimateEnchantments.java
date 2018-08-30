package com.slamtheham.slampackage.enchants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.utils.Utils;

public enum UltimateEnchantments {
	
	MARKSMAN("Marksman", EnchantmentType.ARMOR, Arrays.asList("Increases damage dealt with bows, this enchantment is stackable.")),
	CREEPER_ARMOR("Creeper Armor", EnchantmentType.ARMOR, Arrays.asList("Immune to explosive damage, at higher levels you take no knockback from them and they have a chance to heal you.")),
	BLOCK("Block", EnchantmentType.SWORD, Arrays.asList("A chance to increase damage and redirect an attack.")),
	STICKY("Sticky", EnchantmentType.ARMOR, Arrays.asList("Decreases the chance of an enemy's Disarmor enchantment procing on you by 12.5% per level. At max level, you can never be disarmored.")),
	DETONATE("Detonate", EnchantmentType.TOOL, Arrays.asList("Summons up to a 3x3x3 explosion around any blocks you break.")),
	DIMENSION_RIFT("Dimension Rift", EnchantmentType.BOW, Arrays.asList("Chance to turn blocks underneath target to soul sand, and possibly webs ontop.")),
	ENDER_WALKER("Ender Walker", EnchantmentType.BOOTS, Arrays.asList("Wither and Poison do not injur and have a chance to heal at high levels.")),
	ICE_ASPECT("Ice Aspect", EnchantmentType.SWORD, Arrays.asList("A chance of causing the slowness effect on your enemy.")),
	ASSASSIN("Assassin", EnchantmentType.SWORD, Arrays.asList("The closer you are to your enemy, the more damage you deal (up to 1.25x). However, if you are more than 2 blocks away, you will deal LESS damage than normal.")),
	UNFOCUS("Unfocus", EnchantmentType.BOW, Arrays.asList("Chance to Unfocus target player, reducing their outgoing bow damage by 50% for up to 10 seconds.")),
	HEAVY("Heavy", EnchantmentType.ARMOR, Arrays.asList("Decreases damage from enemy bows by 2% per level, this enchantment is stackable.")),
	GUARDIANS("Guardians", EnchantmentType.ARMOR, Arrays.asList("Chance to spawn iron golems to assist you and watch over you.")),
	DODGE("Dodge", EnchantmentType.ARMOR, Arrays.asList("Chance to dodge physical enemy attacks, increased chance if sneaking.")),
	GHOST("Ghost", EnchantmentType.ARMOR, Arrays.asList("Inivisble to /near lookups while in friendly territory depending on level of enchantment.")),
	OBSIDIAN_SHIELD("Obsidian Shield", EnchantmentType.ARMOR, Arrays.asList("Gives permanent fire resistance.")),
	ARROW_LIFESTEAL("Arrow Lifesteal", EnchantmentType.BOW, Arrays.asList("A chance to steal health from opponent while fighting.")),
	HELLFIRE("Hellfire", EnchantmentType.BOW, Arrays.asList("All arrows shot by you turn into explosive fireballs.")),
    VALOR("Valor", EnchantmentType.ARMOR, Arrays.asList("Reduces incoming damage while wielding a sword by up to 22.5%. This enchantment is stackable.")),
	ARROW_BREAK("Arrow Break", EnchantmentType.AXE, Arrays.asList("Chance for arrows to bounce off and do no damage to you whenever you are wielding an axe with this enchantment on it.")),
	LUCKY("Lucky", EnchantmentType.ARMOR, Arrays.asList("You will find yourself more lucky in all Cosmic situations.")),
	ENRAGE("Enrage", EnchantmentType.SWORD, Arrays.asList("The lower your HP is, the more damage you deal.")),
	TANK("Tank", EnchantmentType.ARMOR, Arrays.asList("Decreases damage from enemy axes by 1.85% per level, this enchantment is stackable.")),
	BLESSED("Blessed", EnchantmentType.AXE, Arrays.asList("A chance of removing debuffs.")),
	CLEAVE("Cleave", EnchantmentType.AXE, Arrays.asList("Damages players within a radius that increases with the level of enchant.")),
	METAPHYSICAL("Metaphysical", EnchantmentType.BOOTS, Arrays.asList("A chance to resist the slowness given by enemy Trap, Snare, and Pummel enchantments. At max level, you will only be affected approx. 10% of the time.")),
	ARROW_DEFLECT("Arrow Deflect", EnchantmentType.ARMOR, Arrays.asList("Prevents you from being damaged by enemy arrows more often than once every level x 400 milliseconds.")),
	PACIFY("Pacify", EnchantmentType.BOW, Arrays.asList("A chance to pacify your target, preventing them from building rage stacks for 1-3 seconds depending on level.")),
	DISINTEGRATE("Disintegrate", EnchantmentType.SWORD, Arrays.asList("Chance to deal double durability damage to all enemy armor with every attack.")),
	SPIRITS("Spirits", EnchantmentType.ARMOR, Arrays.asList("Chance to spawn blazes that heal yourself and your allies in combat.")),
	IMPLANTS("Implants", EnchantmentType.HELMET, Arrays.asList("Passively heals +1 health and restores +1 hunger every few seconds.")),
	DOMINATE("Dominate", EnchantmentType.SWORD, Arrays.asList("Chance to weaken enemy players on hit, causing them to deal (level x 5%) less damage for (level x 2) seconds.")),
	LONGBOW("Longbow", EnchantmentType.BOW, Arrays.asList("Greatly increases damage dealt to enemy players that have a bow in their hands.")),
	ANGELIC("Angelic", EnchantmentType.ARMOR, Arrays.asList("Heals health over time whenever damaged, this enchantment IS stackable in terms of activation chance; however you can only have 1 active healing task from Angelic at any given time.")),
	PIERCING("Piercing", EnchantmentType.BOW, Arrays.asList("Inflicts more damage.")),
	EAGLE_EYE("Eagle Eye", EnchantmentType.BOW, Arrays.asList("Chance to deal 1-4 durability damage to ALL armor pieces of enemy player. The # of durability damage dealt is based on how far of a bow shot you hit them with. The further away, the more durability damage.")),
	BLEED("Bleed", EnchantmentType.AXE, Arrays.asList("Applies bleed stacks to enemies that decrease their movement speed. Use in combination with Devour and Blood Lust.")),
	FUSE("Fuse", EnchantmentType.PICKAXE, Arrays.asList("Allows Auto Smelt to apply to blocks destroyed by the Detonate enchantment."));
	
	String Name;
	EnchantmentType Type;
	List<String> Desc;
	String Level;
	private static HashMap<UltimateEnchantments, String> customNames = new HashMap<UltimateEnchantments, String>();
	private static HashMap<UltimateEnchantments, String> bookColors = new HashMap<UltimateEnchantments, String>();
	private static HashMap<UltimateEnchantments, String> enchantColors = new HashMap<UltimateEnchantments, String>();
	private static HashMap<UltimateEnchantments, Boolean> active = new HashMap<UltimateEnchantments, Boolean>();
	private static HashMap<UltimateEnchantments, List<String>> enchantDesc = new HashMap<UltimateEnchantments, List<String>>();
	
	private UltimateEnchantments(String name, EnchantmentType type, List<String> desc) {
		Name = name;
		Type = type;
		Desc = desc;
		
	}
	public String getName() {
		return Name;
	}
	/**
	 * 
	 * @return The description of the enchantment.
	 */
	public List<String> getDesc() {
		return Desc;
	}
	public void load() {
		for(UltimateEnchantments en : values()) {
			String name = en.getName();
			
			
			enchantDesc.put(en, Desc);
		}
	
	}
	/**
	 *
	 * @return The custom name in the Enchantment.yml.
	 */
	public String getCustomName() {
		return customNames.get(this);
	}

	/**
	 *
	 * @return The description of the enchantment in the Enchantments.yml.
	 */
	public List<String> getDescription() {
		return enchantDesc.get(this);
		
	}

	/**
	 *
	 * @return Return the color that goes on the Enchantment Book.
	 */
	public String getBookColor() {
		
		return Utils.cc(bookColors.get(this));
	}

	/**
	 *
	 * @return Returns the color that goes on the Enchanted Item.
	 */
	public String getEnchantmentColor() {
		return Utils.cc(enchantColors.get(this));
	}

	/**
	 *
	 * @return The type the enchantment is.
	 */
	public EnchantmentType getType() {
		return Type;
	}
	
	
	public String getRarity() {
		return Level;
	}
	
	
	/**
	 *
	 * @return True if the enchantment is enabled and false if not.
	 */
	public Boolean isEnabled() {
		return active.get(this);
	}
}
