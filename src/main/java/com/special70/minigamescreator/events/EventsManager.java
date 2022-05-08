package com.special70.minigamescreator.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class EventsManager implements Listener {
    public EventsManager() {
    }

    @EventHandler()
        public void onPlayerJoin (PlayerJoinEvent event){
        Player player = event.getPlayer();
        if (!player.hasPlayedBefore()) {
            player.sendMessage("§9Hello " + player.getName() + "! Welcome to the server! Hope you enjoy your stay!");
            event.setJoinMessage("§e" + player.getName() + "§f has joined the server for the first time!");
        } else event.setJoinMessage("§e" + player.getName() + "§f has joined the server");
    }
    @EventHandler()
        public void onPlayerLeave (PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + player.getName() + ChatColor.WHITE + " has left the server");
        }
}
