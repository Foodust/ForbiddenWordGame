package org.forbiddenwordgame.BaseModule;

import lombok.RequiredArgsConstructor;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;
import org.forbiddenwordgame.Data.TaskData;
import org.forbiddenwordgame.ForbiddenWordGame;

@RequiredArgsConstructor
public class TaskModule {
    private final ForbiddenWordGame plugin;

    public BukkitTask runBukkitTask(Runnable task) {
        BukkitTask bukkitTask = Bukkit.getScheduler().runTask(plugin, task);
        TaskData.tasks.add(bukkitTask);
        return bukkitTask;
    }

    public BukkitTask runBukkitTaskLater(Runnable task, Long delay) {
        BukkitTask bukkitTask = Bukkit.getScheduler().runTaskLater(plugin, task, delay);
        TaskData.tasks.add(bukkitTask);
        return bukkitTask;
    }

    public BukkitTask runBukkitTaskLater(Runnable task, double delay) {
        BukkitTask bukkitTask = Bukkit.getScheduler().runTaskLater(plugin, task, (long) delay);
        TaskData.tasks.add(bukkitTask);
        return bukkitTask;
    }

    public BukkitTask runBukkitTaskLater(Runnable task, float delay) {
        BukkitTask bukkitTask = Bukkit.getScheduler().runTaskLater(plugin, task, (long) delay);
        TaskData.tasks.add(bukkitTask);
        return bukkitTask;
    }

    public BukkitTask runBukkitTaskTimer(Runnable task, Long delay, Long tick) {
        BukkitTask bukkitTask = Bukkit.getScheduler().runTaskTimer(plugin, task, delay, tick);
        TaskData.tasks.add(bukkitTask);
        return bukkitTask;
    }

    public void cancelBukkitTask(BukkitTask bukkitTask) {
        if (bukkitTask != null)
            Bukkit.getScheduler().cancelTask(bukkitTask.getTaskId());
    }
}
