package me.spyro.testing;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.ChatColor;

import java.util.Objects;


public class Leave implements Listener {
    Main plugin;

    public Leave(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent ev) {
        String config = (String) this.plugin.getConfig().get("prefix");

        String text = ev.getPlayer().getName() + " Has left the server";
        ev.setQuitMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(config)) + ChatColor.RED + text);
    }
}
