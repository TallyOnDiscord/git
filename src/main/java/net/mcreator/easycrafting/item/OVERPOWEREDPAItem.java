
package net.mcreator.easycrafting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.easycrafting.itemgroup.TabItemGroup;
import net.mcreator.easycrafting.OpitemsModElements;

import java.util.List;

@OpitemsModElements.ModElement.Tag
public class OVERPOWEREDPAItem extends OpitemsModElements.ModElement {
	@ObjectHolder("opitems:overpoweredpa")
	public static final Item block = null;
	public OVERPOWEREDPAItem(OpitemsModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 100f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 9;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(TabItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Overpowered as fuck pick"));
			}
		}.setRegistryName("overpoweredpa"));
	}
}
