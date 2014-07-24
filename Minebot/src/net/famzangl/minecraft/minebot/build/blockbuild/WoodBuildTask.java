package net.famzangl.minecraft.minebot.build.blockbuild;

import net.famzangl.minecraft.minebot.Pos;
import net.famzangl.minecraft.minebot.build.WoodItemFilter;
import net.famzangl.minecraft.minebot.build.WoodType;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

public class WoodBuildTask extends CubeBuildTask {

	public static final Block BLOCK = Blocks.planks;

	public WoodBuildTask(Pos forPosition, WoodType woodType) {
		super(forPosition, new WoodItemFilter(woodType));
	}

}
