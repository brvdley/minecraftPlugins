package com.brvdleyowens.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.brvdleyowens.helloworld.Main;

public class helloCommand implements CommandExecutor{
		
		private Main plugin;
		
		public helloCommand(Main plugin) {
			this.plugin = plugin;
			plugin.getCommand("hello").setExecutor(this);
		}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only players may execute this command!");
			return true;
		}
		Player p = (Player) sender;
		
		if (p.hasPermission("hello.use")) {
			p.sendMessage("Hi!");
			return true;
		} else {
			p.sendMessage("You do not have permission to execute this command!");
		}
		
		return false;
	}
	
}
