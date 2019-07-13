package de.pb42.tutorial.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.pb42.tutorial.commands.HealCommand;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getCommand("heal").setExecutor(new HealCommand());
	}

}
