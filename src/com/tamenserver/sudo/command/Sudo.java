package com.tamenserver.sudo.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;

public class Sudo extends SudoCommand {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(args.length<3){
            sender.sendMessage("参数太少！");
            
        }else{
            StringBuilder sb = new StringBuilder();
            for(int i=2;i<args.length;i++){
                sb.append(args[i]);
            }
            try{
                if(args[1].equalsIgnoreCase("Console")){
                    plugin.getServer().dispatchCommand(plugin.getServer().getConsoleSender(), sb.toString());
                }else{
                    
                }
            }catch (CommandException e){
                e.printStackTrace();
            }
        }
        return false;
    }

}
