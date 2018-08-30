package com.slamtheham.slampackage.enchants;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.utils.Utils;

public enum EliteEnchantments {
	GREATSWORD("Greatsword", EnchantmentType.SWORD, Arrays.asList("Multiplies damage against players who are wielding a BOW at the time they are hit.")),
	PARALYZE("Paralyze", EnchantmentType.SWORD, Arrays.asList("Gives lightning effect and a chance for slowness and slow swinging. Also inflicts direct damage on proc.")),
	ROCKET_ESCAPE("Rocket Escape", EnchantmentType.BOOTS, Arrays.asList("Blast off into the air at low HP.")),
	BLIND("Blind", EnchantmentType.SWORDS_AND_BOWS, Arrays.asList("A Chance of causing blindness when attacking.")),
	ANTI_GRAVITY("Anti Gravity", EnchantmentType.BOOTS, Arrays.asList("Super jump but does not negate fall damage.")),
	POISON("Poison", EnchantmentType.SWORD, Arrays.asList("A chance of giving the poison effect.")),
	PUMMEL("Pummel", EnchantmentType.AXE, Arrays.asList("Chance to slow nearby enemy players for a short period.")),
	HIJACK("Hijack", EnchantmentType.BOW, Arrays.asList("Chance to convert summoned enemy Guardians into your own when they are shot with an arrow.")),
	SHAKLE("Shackle", EnchantmentType.WEAPONS, Arrays.asList("Prevents mobs spawned from mob spawners from suffering from knockback from your attacks.")),
	POISONED("Poisoned", EnchantmentType.ARMOR, Arrays.asList("Chance to give poison to your attacker.")),
	STORMCALLER("Stormcaller", EnchantmentType.ARMOR, Arrays.asList("Strikes lightning on attacking players.")),
	INFERNAL("Infernal", EnchantmentType.BOW, Arrays.asList("Explosive fire effect.")),
	VENOM("Venom", EnchantmentType.BOW, Arrays.asList("A chance of dealing poison.")),
	SOLITUDE("Solitude", EnchantmentType.SWORD, Arrays.asList("Increases chance and length of the Silence enchantment procing on enemy players by up to 3X.")),
	TELEPORTATION("Teleportation", EnchantmentType.BOW, Arrays.asList("When an ally or faction member is hit you teleport to them.")),
	VAMPIRE("Vampire", EnchantmentType.SWORD, Arrays.asList("A chance to heal you for up to 3hp a few seconds after you strike.")),
	FROZEN("Frozen", EnchantmentType.ARMOR, Arrays.asList("Can cause slowness when attacked.")),
	WITHER("Wither", EnchantmentType.ARMOR, Arrays.asList("A chance to give the wither effect.")),
	FARCAST("Farcast", EnchantmentType.BOW, Arrays.asList("Chance to knockback melee attackers by a couple of blocks when they hit you. The lower your health, the higher the chance to proc.")),
	SNARE("Snare", EnchantmentType.BOW, Arrays.asList("Chance to slow and fatigue enemies with projectiles.")),
	SPIRIT_LINK("Spirit Link", EnchantmentType.CHESTPLATE, Arrays.asList("Heals nearby faction/allies when you are damaged.")),
	RESILIENCE("Resilience", EnchantmentType.HELMET, Arrays.asList("Increases HP of your NPC if you get combat logged by 15% per level. Also has a chance to negate 50% of damage from incoming attacks that would normally kill you.")),
	SHOCKWAVE("Shockwave", EnchantmentType.CHESTPLATE, Arrays.asList("The chance to push back your attacker.")),
	CACTUS("Cactus", EnchantmentType.ARMOR, Arrays.asList("Injurs your attacker but does not affect your durability.")),
	REFORGED("Reforged", EnchantmentType.TOOLS_AND_WEAPONS, Arrays.asList("Protects tool durability, items will take longer to break.")),
	VOODOO("Voodoo", EnchantmentType.ARMOR, Arrays.asList("Gives a chance to deal weakness.")),
	SPRINGS("Springs", EnchantmentType.BOOTS, Arrays.asList("Gives jump boost.")),
	DEMONFORGED("Demonforged", EnchantmentType.SWORD, Arrays.asList("Increases durability loss on your enemy's armor.")),
	UNDEAD_RUSE("Undead Ruse", EnchantmentType.ARMOR, Arrays.asList("When hit you have a chance to spawn zombie hordes to distract and disorient your opponents.")),
	SMOKE_BOMB("Smoke Bomb", EnchantmentType.HELMET, Arrays.asList("When you are near death, you will spawn a smoke bomb to distract your enemies.")),
	REPAIR_GUARD("Repair Guard", EnchantmentType.ARMOR, Arrays.asList("Whenever you remove a low durability piece of armor to repair it, you will get up to 10 absorption hearts (depending on level) while you are fixing it.")),
	EXECUTE("Execute", EnchantmentType.SWORD, Arrays.asList("Damage buff when your target is at low hp.")),
	TRICKSTER("Trickster", EnchantmentType.ARMOR, Arrays.asList("When hit you have a chance to teleport directly behind your oppenent and take them by suprise.")),
	TRAP("Trap", EnchantmentType.SWORD, Arrays.asList("A chance to give a buffed slowness effect."));
	String Name;
	EnchantmentType Type;
	List<String> Desc;
	String Level;
	private static HashMap<EliteEnchantments, String> customNames = new HashMap<EliteEnchantments, String>();
	private static HashMap<EliteEnchantments, String> bookColors = new HashMap<EliteEnchantments, String>();
	private static HashMap<EliteEnchantments, String> enchantColors = new HashMap<EliteEnchantments, String>();
	private static HashMap<EliteEnchantments, Boolean> active = new HashMap<EliteEnchantments, Boolean>();
	private static HashMap<EliteEnchantments, List<String>> enchantDesc = new HashMap<EliteEnchantments, List<String>>();
	
	private EliteEnchantments(String name, EnchantmentType type, List<String> desc) {
		
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
		for(EliteEnchantments en : values()) {
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
	public String getDescription() {
		return enchantDesc.get(this).toString();
		
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
