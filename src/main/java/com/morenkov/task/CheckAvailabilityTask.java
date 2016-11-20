package com.morenkov.task;

import com.atlassian.bamboo.build.logger.BuildLogger;
import com.atlassian.bamboo.task.*;
import org.jetbrains.annotations.NotNull;

/**
 * Created by solorad on 20.11.16.
 */
public class CheckAvailabilityTask implements TaskType{
    @NotNull
    public TaskResult execute(@NotNull TaskContext taskContext) throws TaskException {
        final BuildLogger buildLogger = taskContext.getBuildLogger();

        final String say = taskContext.getConfigurationMap().get("say");

        buildLogger.addBuildLogEntry(say);

        return TaskResultBuilder.create(taskContext).success().build();
    }
}
