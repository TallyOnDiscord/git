
package net.mcreator.easycrafting.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.easycrafting.itemgroup.TabItemGroup;
import net.mcreator.easycrafting.OpitemsModElements;

import java.util.List;

@OpitemsModElements.ModElement.Tag
public class OpfoodItem extends OpitemsModElements.ModElement {
	@ObjectHolder("opitems:opfood")
	public static final Item block = null;
	public OpfoodItem(OpitemsModElements instance) {
		super(instance, 30);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(TabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(1000).saturation(0.3f).setAlwaysEdible().meat().build()));
			setRegistryName("opfood");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("op food"));
		}
	}
}
