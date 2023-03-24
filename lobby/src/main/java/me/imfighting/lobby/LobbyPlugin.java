package me.imfighting.lobby;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import me.imfighting.lobby.util.ConfigUtil;
import me.saiintbrisson.minecraft.ViewFrame;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyPlugin extends JavaPlugin {

    private static LobbyPlugin plugin;
    private ConfigUtil config;
    private ViewFrame view;

    @Override
    public void onLoad() {
        config = new ConfigUtil(this, "config.yml");
    }

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {


    }

    public static LobbyPlugin getPlugin() {
        return plugin;
    }
}
