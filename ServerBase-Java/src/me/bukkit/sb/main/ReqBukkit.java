package me.bukkit.sb.main;
 
// import java.util.ArrayList;
//import java.util.Iterator;

import org.bukkit.plugin.java.JavaPlugin;

import me.bukkit.sb.utils.OwnerUtils;
 
 public class ReqBukkit extends JavaPlugin {
 	public static double ver;
 	
 	public void onEnable() {
 		getLogger().info("[SB-INFO]Server-Base " + ReqBukkit.ver + " has been disabled.");
// 		ArrayList<String> OwnerUtils = new ArrayList<String>();
// 		OwnerUtils.add("list");
// 		OwnerUtils.add("l");
// 		
// 		Iterator<String> ou_itr = OwnerUtils.iterator();
// 		
// 		for (int i=0;i<OwnerUtils.size();i++) {
// 			this.getCommand( ou_itr.next()).setExecutor(new OwnerUtils());
// 			
// 		}
 		this.getCommand("list").setExecutor(new OwnerUtils());
 		this.getCommand("l").setExecutor(new OwnerUtils());
 	}
 	
 	public void onDisable() {
 		ver = 0.0;
 		getLogger().info("[SB-INFO]Server-Base " + ver + " has been disabled.");
 	}
 	
 	//this.getCommand("dc").setExecutor(new DevChat());
 	//this.getCommand("devchat").setExecutor(new DevChat());
 }