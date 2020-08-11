package net.metsuboujinrai.tutorialmod.util;

import net.metsuboujinrai.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {
	
	public static Item setItemName(Item item, String name) {
		item.setRegistryName(TutorialMod.MODID + name).setTranslationKey(TutorialMod.MODID + "." + name);
		return item;
	}
	
	public static Block setBlockName(Block block, String name) {
		block.setRegistryName(TutorialMod.MODID + name).setTranslationKey(TutorialMod.MODID + "." + name);
		return block;
	}

}
