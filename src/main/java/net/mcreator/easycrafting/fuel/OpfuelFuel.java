
package net.mcreator.easycrafting.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.easycrafting.block.OPBLOCKBlock;
import net.mcreator.easycrafting.OpitemsModElements;

@OpitemsModElements.ModElement.Tag
public class OpfuelFuel extends OpitemsModElements.ModElement {
	public OpfuelFuel(OpitemsModElements instance) {
		super(instance, 27);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(OPBLOCKBlock.block, (int) (1)).getItem())
			event.setBurnTime(5000);
	}
}
