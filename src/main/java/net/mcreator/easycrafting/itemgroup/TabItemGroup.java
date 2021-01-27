
package net.mcreator.easycrafting.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.easycrafting.item.OVERPOWEREdItem;
import net.mcreator.easycrafting.OpitemsModElements;

@OpitemsModElements.ModElement.Tag
public class TabItemGroup extends OpitemsModElements.ModElement {
	public TabItemGroup(OpitemsModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OVERPOWEREdItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
