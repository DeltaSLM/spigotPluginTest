package me.spyro.testing;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;

import java.util.Objects;


public class Join implements Listener {
    Main plugin;

    public Join(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent ev) {
        String config = (String) this.plugin.getConfig().get("prefix");

        String text = ev.getPlayer().getName() + " Has joined the server";
        ev.setJoinMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(config)) + ChatColor.GREEN + text);
    }
}
