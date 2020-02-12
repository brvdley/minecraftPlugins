package com.brvdleyowens.listeners;

import org.bukkit.plugin.java.JavaPlugin;

import join.JoinListener;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		
		new JoinListener(this);
	}

}
