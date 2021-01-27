
package net.mcreator.easycrafting.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.easycrafting.OpitemsModElements;

@OpitemsModElements.ModElement.Tag
public class MusicItem extends OpitemsModElements.ModElement {
	@ObjectHolder("opitems:music")
	public static final Item block = null;
	public MusicItem(OpitemsModElements instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.panda.death")),
					new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("music");
		}
	}
}
