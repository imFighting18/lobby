package me.imfighting.lobby;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import me.imfighting.lobby.listeners.PlayerDropItemListener;
import me.imfighting.lobby.listeners.PlayerJoinListener;
import me.imfighting.lobby.listeners.PlayerQuitListener;
import me.imfighting.lobby.util.ConfigUtil;
import me.saiintbrisson.minecraft.ViewFrame;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
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

        registerEvents();
    }

    @Override
    public void onDisable() {


    }

    private void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerQuitListener(), this);
        pm.registerEvents(new PlayerDropItemListener(), this);
    }

    public static LobbyPlugin getPlugin() {
        return plugin;
    }
}
