package me.bukkit.sb.utils;
 
 import org.bukkit.ChatColor;
 //import org.bukkit.Color;
 import org.bukkit.Bukkit;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandExecutor;
 import org.bukkit.command.CommandSender;
 
 public class OwnerUtils implements CommandExecutor {
 	public boolean onCommand(CommandSender sender, Command command, String label, String args[]) {
 		
 		if (label.equalsIgnoreCase("l") || label.equalsIgnoreCase("list")) {
 			switch (args[0]) {
 				case "players":
 					sender.sendMessage(ChatColor.GREEN + "Online Players: " + Bukkit.getOnlinePlayers());
 					break;
 				case "banned":
 					if (args[1].equalsIgnoreCase("players")) {
 						sender.sendMessage(ChatColor.RED + "Banned Players: " + Bukkit.getBannedPlayers());
 					} else {
 						sender.sendMessage(ChatColor.RED + "Banned IP's: " + Bukkit.getIPBans());
 					}
 					break;
 				
 					
 			}
 			
 		
 		
 		}
 		
 		return false;
 }
 }
 	