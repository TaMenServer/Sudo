package com.tamenserver.sudo;

import org.bukkit.plugin.java.JavaPlugin;

import com.tamenserver.sudo.command.Sudo;
import com.tamenserver.sudo.command.SudoCommand;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable() {
        this.getLogger().info("Sudo plugin is enabled!");
        SudoCommand.setPlugin(this);
        this.getCommand("sudo").setExecutor(new Sudo());
    }
    
    @Override
    public void onDisable() {
        this.getLogger().info("Sudo plugin is disabled!");
    }
}
