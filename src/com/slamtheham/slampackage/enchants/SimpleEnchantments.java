package com.slamtheham.slampackage.enchants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.utils.Utils;

public enum SimpleEnchantments {
	LIGHTNING("Lightning", EnchantmentType.BOW, Arrays.asList( "A chance to strike lightning where you strike.")),
	TARGET_TRACKING("Target_Tracking", EnchantmentType.BOW, Arrays.asList( "Automatically /f focus any target you hit.")),
	HEALING("Healing", EnchantmentType.BOW,  Arrays.asList("Heals friendly players hit with arrow shot by this bow. Also has a chance to increase durability of armor and give absorption/health boost.")),
	//	----------------Helmets----------------  \\
	AQUATIC("Aquatic", EnchantmentType.HELMET, Arrays.asList( "Gives permanent water breathing.")),
	GLOWING("Glowing", EnchantmentType.HELMET,  Arrays.asList("Gives permanent night vision.")),
	//	----------------Swords----------------  \\

	HEADLESS("Headless", EnchantmentType.SWORD, Arrays.asList ("Victims have a chance of dropping their head on death.")),
	INSOMNIA("Insomnia", EnchantmentType.SWORD, Arrays.asList ("Gives slowness, slow swinging and confusion.")),
	THUNDERING_BLOW("Thundering_Blow", EnchantmentType.SWORD, Arrays.asList( "Can cause smite effect on your enemy.")),
	EPICNESS("Epicness", EnchantmentType.SWORD,  Arrays.asList("Gives particles and sound effects.")),
	//	----------------Armor----------------  \\
		//	----------------Axes----------------  \\
	
	CONFUSION("Confusion", EnchantmentType.AXE, Arrays.asList( "A chance to deal nausea to your victim.")),
	DECAPITATION("Decapitation", EnchantmentType.AXE, Arrays.asList( "Victims have a chance of dropping their head on death.")),
	// Weapons
	OBLITERATE("Obliterate", EnchantmentType.WEAPONS, Arrays.asList( "Extreme knockback.")),
	//	----------------PickAxes----------------  \\
	AUTOSMELT("Auto_Smelt", EnchantmentType.PICKAXE,  Arrays.asList("Ores are automatically smelted when mined.")),
	//	----------------Tools----------------  \\
	EXPERIENCE("Experience", EnchantmentType.TOOL,  Arrays.asList("Gives more exp when mining blocks.")),
	HASTE("Haste", EnchantmentType.TOOL,  Arrays.asList("Allows you to swing your tools faster.")),
	OXYGENATE("Oxygenate", EnchantmentType.TOOL, Arrays.asList("Refills oxygen levels when breaking blocks under water."));
	
	String Name;
	EnchantmentType Type;
	public List<String> Desc;
	String Level;
	private static HashMap<SimpleEnchantments, String> customNames = new HashMap<SimpleEnchantments, String>();
	private static HashMap<SimpleEnchantments, String> bookColors = new HashMap<SimpleEnchantments, String>();
	private static HashMap<SimpleEnchantments, String> enchantColors = new HashMap<SimpleEnchantments, String>();
	private static HashMap<SimpleEnchantments, Boolean> active = new HashMap<SimpleEnchantments, Boolean>();
	private static HashMap<SimpleEnchantments, List<String>> enchantDesc = new HashMap<SimpleEnchantments, List<String>>();
	
	private SimpleEnchantments(String name, EnchantmentType type, List<String> desc) {
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
		for(SimpleEnchantments en : values()) {
			
		
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
	
	public SimpleEnchantments getSimpleEnchantments() {
		return this;
	}

}
