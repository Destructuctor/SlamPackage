package com.slamtheham.slampackage.enchants;

import java.util.HashMap;
import java.util.List;

import com.slamtheham.slampackage.Main;
import com.slamtheham.slampackage.utils.Utils;

public enum LegendaryEnchantments {

	INQUISITIVE("Inquisitive", EnchantmentType.SWORD, "Increases EXP drops from mobs.", "Legendary"), BLOOD_LINK(
			"Blood Link", EnchantmentType.ARMOR, "A chance to heal you for 1-2hp whenever your Guardians take damage.",
			"Legendary"), SNIPER("Sniper", EnchantmentType.BOW, "Headshots with projectile deal up to 3.5x damage.",
					"Legendary"), RAGE("Rage", EnchantmentType.WEAPONS,
							"For every combo hit you land, your damage is multiplied by 1.1x",
							"Legendary"), DRUNK("Drunk", EnchantmentType.HELMET,
									"Slowness and slow swinging with a chance to give buffed strength.",
									"Legendary"), BLACKSMITH("Blacksmith", EnchantmentType.AXE,
											"Chance to heal your most damaged piece of armor by 1-2 durability whenever you hit a player, but when it procs your attack will only deal 50% of the normal damage.",
											"Legendary"), DEATHBRINGER("Deathbringer", EnchantmentType.ARMOR,
													"Chance to deal double damage.", "Legendary"), DISARMOR("Disarmor",
															EnchantmentType.SWORD,
															"A slight chance of removing one piece of armor from your enemy when they are at low health.",
															"Legendary"), PROTECTION("Protection",
																	EnchantmentType.ARMOR,
																	"Automatically heals and buffs all nearby faction allies.",
																	"Legendary"), DIMINISH("Diminish",
																			EnchantmentType.CHESTPLATE,
																			"When this effect procs, the next attack dealt to you cannot deal more than the (total amount of damage / 2) you took from the previous attack. (i.e. if you're damaged for 2HP, the next attack cannot deal more than 1HP of damage.)",
																			"Legendary"), LEADERSHIP("Leadership",
																					EnchantmentType.ARMOR,
																					"The more allies near you, the more damage you deal.",
																					"Legendary"), GEARS("Gears",
																							EnchantmentType.BOOTS,
																							"Added speed when equipped.",
																							"Legendary"), INSANITY(
																									"Insanity",
																									EnchantmentType.AXE,
																									"You swing your axe like a maniac. Multiplies damage against players who are wielding a SWORD at the time they are hit.",
																									"Legendary"), DESTRUCTION(
																											"Destruction",
																											EnchantmentType.HELMET,
																											"Automatically damages and debuffs all nearby enemies.",
																											"Legendary"), ARMORED(
																													"Armored",
																													EnchantmentType.ARMOR,
																													"Decreases damage from enemy swords by 1.85% per level, this enchantment is stackable.",
																													"Legendary"), DEVOUR(
																															"Devour",
																															EnchantmentType.AXE,
																															"Multiplies damage dealt to players with active bleed stacks from the Bleed enchantment.",
																															"Legendary"), CLARITY(
																																	"Clarity",
																																	EnchantmentType.ARMOR,
																																	"Immune to Blindness up to level of clarity enchantment.",
																																	"Legendary"), AEGIS(
																																			"Aegis",
																																			EnchantmentType.ARMOR,
																																			"If you are taking damage from more than (8-level) enemies in a short period, the damage from any additional players beyond that initial group will be halved.",
																																			"Legendary"), OVERLOAD(
																																					"Overload",
																																					EnchantmentType.ARMOR,
																																					"Permanent increase in hearts.",
																																					"Legendary"), ANTI_GANK(
																																							"Anti Gank",
																																							EnchantmentType.AXE,
																																							"If more than (6-level) enemies hit you in a short period, your outgoing damage will be multiplied by up to 1.5x depending on the amount of enemies nearby.",
																																							"Legendary"), KILL_AURA(
																																									"Kill Aura",
																																									EnchantmentType.SWORD,
																																									"Chance to kill multiple monsters in a stack each death event.",
																																									"Legendary"), BLOOD_LUST(
																																											"Blood Lust",
																																											EnchantmentType.CHESTPLATE,
																																											"A chance to heal you whenever an enemy player \n within 7x7 blocks is damaged by the Bleed enchantment.",
																																											"Legendary"), SILENCE(
																																													"Silence",
																																													EnchantmentType.BOW,
																																													"Chance to stop activation of your enemy's custom enchants.",
																																													"Legendary"), DEATH_GOD(
																																															"Death_God",
																																															EnchantmentType.HELMET,
																																															"Attacks that bring your HP to (level+4) hearts or lower have a chance to heal you for (level+5) hearts instead.",
																																															"Legendary"), DOUBLE_STRIKE(
																																																	"Double Strike",
																																																	EnchantmentType.SWORD,
																																																	"A chance to attack twice in one swing. All your enchantments can re-proc on this second attack, and it occurs instantly.",
																																																	"Legendary"), LIFESTEAL(
																																																			"Life Steal",
																																																			EnchantmentType.SWORD,
																																																			"A chance to regain health when attacking.",
																																																			"Legendary"), INVERSION(
																																																					"Inversion",
																																																					EnchantmentType.SWORD,
																																																					"Damage dealt to you has a % chance to be blocked and heal you for 1-3 HP instead.",
																																																					"Legendary"), ENLIGHTENED(
																																																							"Enlightened",
																																																							EnchantmentType.ARMOR,
																																																							"Can heal hearts while taking damage.",
																																																							"Legendary"), BARBARIAN(
																																																									"Barbarian",
																																																									EnchantmentType.AXE,
																																																									"Multiplies damage against players who are wielding an AXE at the time they are hit.",
																																																									"Legendary");
	String Name;
	EnchantmentType Type;
	String Desc;
	String Level;
	private static HashMap<LegendaryEnchantments, String> customNames = new HashMap<LegendaryEnchantments, String>();
	private static HashMap<LegendaryEnchantments, String> bookColors = new HashMap<LegendaryEnchantments, String>();
	private static HashMap<LegendaryEnchantments, String> enchantColors = new HashMap<LegendaryEnchantments, String>();
	private static HashMap<LegendaryEnchantments, Boolean> active = new HashMap<LegendaryEnchantments, Boolean>();
	private static HashMap<LegendaryEnchantments, String> enchantDesc = new HashMap<LegendaryEnchantments, String>();

	private LegendaryEnchantments(String name, EnchantmentType type, String desc, String level) {
		Name = name;
		Type = type;
		Desc = desc;
		Level = level;
	}

	public String getName() {
		return Name;
	}

	/**
	 * 
	 * @return The description of the enchantment.
	 */
	public String getDesc() {
		return Desc;
	}

	/**
	 *
	 * @return The custom name in the Enchantment.yml.
	 */
	public String getCustomName() {
		return customNames.get(this);
	}

	public void load() {
		for (LegendaryEnchantments en : values()) {
			String name = en.getName();

			enchantDesc.put(en, this.getDesc());
		}
	}

	/**
	 *
	 * @return The description of the enchantment in the Enchantments.yml.
	 */
	public String getDescription() {
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
