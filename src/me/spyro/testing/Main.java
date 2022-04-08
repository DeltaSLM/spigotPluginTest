package me.spyro.testing;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("example").setExecutor(new ExampleCommand(this));
        Bukkit.getPluginManager().registerEvents(new Join(this),this);
        Bukkit.getPluginManager().registerEvents(new Leave(this),this);
        this.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
    }
}
