package com.tamenserver.sudo.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class SudoCommand implements CommandExecutor {
    protected static JavaPlugin plugin;
    
    public static void setPlugin(JavaPlugin plugin) {
        SudoCommand.plugin = plugin;
    }

}
