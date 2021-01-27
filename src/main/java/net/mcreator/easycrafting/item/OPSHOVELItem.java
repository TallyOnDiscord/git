
package net.mcreator.easycrafting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.easycrafting.itemgroup.TabItemGroup;
import net.mcreator.easycrafting.OpitemsModElements;

@OpitemsModElements.ModElement.Tag
public class OPSHOVELItem extends OpitemsModElements.ModElement {
	@ObjectHolder("opitems:opshovel")
	public static final Item block = null;
	public OPSHOVELItem(OpitemsModElements instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 1000f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(TabItemGroup.tab)) {
		}.setRegistryName("opshovel"));
	}
}
