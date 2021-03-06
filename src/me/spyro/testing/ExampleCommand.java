package me.spyro.testing;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.Objects;

public class ExampleCommand implements CommandExecutor {
    Main plugin;

    public ExampleCommand(Main plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        String cmdName = cmd.getName().toLowerCase();

        if (!cmdName.equals("example")) {
            return false;
        }

        String config = (String) this.plugin.getConfig().get("prefix");

        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(config)) + sender.getName() + " has successfully used example command!");

        return true;
    }
}