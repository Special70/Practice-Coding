package com.special70.minigamescreator;

import com.special70.minigamescreator.commands.Commands01;
import com.special70.minigamescreator.events.EventsManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinigamesCreator extends JavaPlugin {
    private static MinigamesCreator instance;

    public static MinigamesCreator getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        System.out.println("Plugin has loaded");


        getServer().getPluginManager().registerEvents(new EventsManager(), this);

        getCommand("die").setExecutor(new Commands01());
        getCommand("feed").setExecutor(new Commands01());
        getCommand("micro").setExecutor(new Commands01());

        getConfig().options().copyDefaults();
        saveDefaultConfig();

    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
        System.out.println("Plugin has unloaded");
    }
}
