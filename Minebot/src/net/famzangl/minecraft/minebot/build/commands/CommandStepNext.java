package net.famzangl.minecraft.minebot.build.commands;

import net.famzangl.minecraft.minebot.ai.AIHelper;
import net.famzangl.minecraft.minebot.ai.AIStrategy;
import net.famzangl.minecraft.minebot.ai.command.AICommand;
import net.famzangl.minecraft.minebot.ai.command.AICommandInvocation;
import net.famzangl.minecraft.minebot.ai.command.AICommandParameter;
import net.famzangl.minecraft.minebot.ai.command.ParameterType;
import net.famzangl.minecraft.minebot.ai.task.AITask;
import net.famzangl.minecraft.minebot.build.NextTaskTask;

@AICommand(helpText = "Select the next task as active.", name = "minebuild")
public class CommandStepNext {

	@AICommandInvocation()
	public static AIStrategy run(
			AIHelper helper,
			@AICommandParameter(type = ParameterType.FIXED, fixedName = "step", description = "") String nameArg2,
			@AICommandParameter(type = ParameterType.FIXED, fixedName = "next", description = "") String nameArg3) {
		return new AIStrategy() {
			private boolean done;

			@Override
			public void searchTasks(AIHelper helper) {
				if (!done) {
					helper.addTask(new NextTaskTask());
					done = true;
				}
			}

			@Override
			public AITask getOverrideTask(AIHelper helper) {
				return null;
			}

			@Override
			public String getDescription() {
				return null;
			}
		};
	}
}
