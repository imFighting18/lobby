package me.imfighting.lobby.managers;

import me.imfighting.lobby.util.ItemBuilder;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;

public class PlayerManager {

    public static void updatePlayer(Player player) {
        player.setGameMode(GameMode.SURVIVAL);
        player.setHealth(20);
        player.setFoodLevel(20);

        ItemBuilder compass = new ItemBuilder(Material.COMPASS)
                .setName("§aSelecionar jogo")
                .setLore("§7Abra o menu de jogos!");

        ItemBuilder skull = new ItemBuilder(Material.SKULL_ITEM)
                .setName("§aPerfil")
                .setLore("§7Veja algumas de suas informações.")
                .setSkullOwner(player.getName());

        ItemBuilder chest = new ItemBuilder(Material.CHEST)
                .setName("§aColecionáveis")
                .setLore("§7Selecione seus colecionáveis!");

        ItemBuilder dye = new ItemBuilder(Material.INK_SACK)
                .setName("§fPlayers: §aON")
                .setLore("§7Alterne a visibilidade de players.")
                .setDurability((short)10);

        ItemBuilder netherStar = new ItemBuilder(Material.NETHER_STAR)
                .setName("§aSelecionar lobby")
                .setLore("§7Escolha um outro lobby!");

        player.getInventory().setItem(0, compass.build());
        player.getInventory().setItem(1, skull.build());

        player.getInventory().setItem(4, chest.build());

        player.getInventory().setItem(7, dye.build());
        player.getInventory().setItem(8, netherStar.build());

        //player.teleport();
    }
}
