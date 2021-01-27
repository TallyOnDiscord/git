
package net.mcreator.easycrafting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.easycrafting.itemgroup.TabItemGroup;
import net.mcreator.easycrafting.OpitemsModElements;

import java.util.List;

@OpitemsModElements.ModElement.Tag
public class OVERPOWEREdItem extends OpitemsModElements.ModElement {
	@ObjectHolder("opitems:overpower_ed")
	public static final Item block = null;
	public OVERPOWEREdItem(OpitemsModElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 9998f;
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
		}, 3, -1.1999999999999997f, new Item.Properties().group(TabItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Overpowered as fuck sword"));
			}
		}.setRegistryName("overpower_ed"));
	}
}
