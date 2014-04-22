package net.famzangl.minecraft.minebot.ai.task;

import net.famzangl.minecraft.minebot.ai.AIHelper;

public class MineBlockTask implements AITask {
	private int x;
	private int y;
	private int z;

	public MineBlockTask(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	@Override
	public boolean isFinished(AIHelper h) {
		return h.isAirBlock(x, y, z);
	}

	@Override
	public void runTick(AIHelper h) {
		h.faceAndDestroy(x, y, z);
	}

	@Override
	public String toString() {
		return "MineBlockTask [x=" + x + ", y=" + y + ", z=" + z + "]";
	}

}