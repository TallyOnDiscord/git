package net.mcreator.easycrafting.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.easycrafting.OpitemsModElements;
import net.mcreator.easycrafting.OpitemsMod;

import java.util.Map;

@OpitemsModElements.ModElement.Tag
public class OPwepProcedure extends OpitemsModElements.ModElement {
	public OPwepProcedure(OpitemsModElements instance) {
		super(instance, 21);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OpitemsMod.LOGGER.warn("Failed to load dependency entity for procedure OPwep!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"give @s easycrafting:opblock 64");
			}
		}
	}
}
