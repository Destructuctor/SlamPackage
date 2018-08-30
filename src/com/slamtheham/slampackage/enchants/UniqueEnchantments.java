package com.slamtheham.slampackage.enchants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.slampackages.SlamPackageUnique;
import com.slamtheham.slampackage.utils.Utils;

public enum UniqueEnchantments {
	
	
	
	DEEP_WOUNDS("Deep Wounds", EnchantmentType.SWORD, Arrays.asList("Increases the chance of you giving the bleed effect.")),
	FEATHERWEIGHT("Featherweight", EnchantmentType.SWORD, Arrays.asList("A chance to give a burst of haste.")),
	NUTRITION("Nutrition", EnchantmentType.LEGGINGS, Arrays.asList("1.2-2x normal hunger replenishment, allows you to eat more golden apples before contracting Golden Apple Sickness.")),
	RAGDOLL("Ragdoll", EnchantmentType.ARMOR, Arrays.asList("Whenever you take damage you are pushed far back.")),
	OBSIDIAN_DESTROYER("Obisidan Destroyer", EnchantmentType.PICKAXE, Arrays.asList("Chance to instantly break obsidian blocks.")),
	EXPLOSIVE("Explosive", EnchantmentType.BOW, Arrays.asList("Explosive arrows.")),
	BERSERK("Berserk", EnchantmentType.AXE, Arrays.asList("A chance of strength and mining fatigue.")),
	NIMBLE("Nimble", EnchantmentType.BOOTS, Arrays.asList("Increases mcMMO XP gained in Acrobatics while equipped.")),
	PLAGUE_CARRIER("Plague Carrier", EnchantmentType.LEGGINGS, Arrays.asList("When near death summons creepers and debuffs to avenge you.")),
	SELF_DESTRUCT("Self Destruct", EnchantmentType.ARMOR,Arrays.asList( "When close to death buffed TnT spawns around you.")),
	MOLTEN("Molten", EnchantmentType.ARMOR, Arrays.asList("Chance of setting your attacker ablaze.")),
	
	SKILLING("Skilling", EnchantmentType.TOOLS_AND_WEAPONS, Arrays.asList("Increases mcMMO XP gained in all GATHERING skills while equipped.")),
	RAVENOUS("Ravenous", EnchantmentType.AXE, Arrays.asList("A chance to regain hunger.")),
	
	ENDER_SHIFT("Ender Shift", EnchantmentType.BOOTS_AND_HELMETS, Arrays.asList("Gives a speed/health boost at low hp.")),
	SKILL_SWIPE("Skill_Swipe", EnchantmentType.SWORD, Arrays.asList("A chance to steal some of your enemy's EXP every time you damage them.")),
	VIRUS("Virus", EnchantmentType.BOW, Arrays.asList("Multiplies all Wither and Poison damage the affected target recieves and has a chance to remove regeneration effects on hit")),
	COMMANDER("Commander", EnchantmentType.ARMOR, Arrays.asList("Nearby allies are given haste.")),
	TRAINING("Training", EnchantmentType.WEAPONS, Arrays.asList("Increases mcMMO XP gained in all COMBAT skills while equipped.")),
	CURSE("Curse", EnchantmentType.CHESTPLATE, Arrays.asList("Gives strength, slowness and resistance at low hp.")),
	COWIFICATION("Cowification", EnchantmentType.BOW, Arrays.asList("Shoots exploding cows.")),
	TELEPATHY("Telepathy",EnchantmentType.TOOL, Arrays.asList("Automatically places blocks broken by tools in your inventory.")),
	LIFE_BLOOM("Life Bloom", EnchantmentType.LEGGINGS, Arrays.asList("Completely heals allies and truces on your death."));
	
	
	String Name;
	EnchantmentType Type;
	List<String> Desc;
	String Level;
	public static SlamPackageUnique spu = new SlamPackageUnique();
	private static HashMap<UniqueEnchantments, String> customNames = new HashMap<UniqueEnchantments, String>();
	private static HashMap<UniqueEnchantments, String> bookColors = new HashMap<UniqueEnchantments, String>();
	private static HashMap<UniqueEnchantments, String> enchantColors = new HashMap<UniqueEnchantments, String>();
	private static HashMap<UniqueEnchantments, Boolean> active = new HashMap<UniqueEnchantments, Boolean>();
	private static HashMap<UniqueEnchantments, List<String>> enchantDesc = new HashMap<UniqueEnchantments, List<String>>();
	
	private UniqueEnchantments(String name, EnchantmentType type, List<String> desc) {
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
		for(UniqueEnchantments en : values()) {
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
	public  List<String> getDescription() {
		return Desc;
		
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
