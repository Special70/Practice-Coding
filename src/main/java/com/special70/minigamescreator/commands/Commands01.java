package com.special70.minigamescreator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import static com.special70.minigamescreator.MinigamesCreator.getInstance;

public class Commands01 implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String myString = getInstance().getConfig().getString("Food");

        if (command.getName().equalsIgnoreCase("die")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.setHealth(0);
                p.sendMessage("§cYou have died because you typed this command.");
            } else if (sender instanceof ConsoleCommandSender) {
                System.out.println("This command can only be executed by a player.");
            }
        } else if (command.getName().equalsIgnoreCase("feed")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.setFoodLevel(20);
                p.sendMessage("");
            }
        } else if (command.getName().contains("micro ")) {
            if (sender instanceof Player) {
                Player p = (Player) sender;
                p.sendMessage("§9Unknown Command. Type /micro help for help");
            }
        }

        return true;
    }
}
