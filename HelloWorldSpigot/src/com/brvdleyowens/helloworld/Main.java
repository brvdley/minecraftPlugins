package com.brvdleyowens.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import com.brvdleyowens.helloworld.commands.helloCommand;

public class Main extends JavaPlugin{
	
	@Override 
	public void onEnable() {
		new helloCommand(this);
	}
}
