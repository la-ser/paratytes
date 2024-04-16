package org.laser.paratytes;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Paratytes extends JavaPlugin {

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block clickedBlock = event.getClickedBlock();

        if (clickedBlock != null && clickedBlock.getType() == Material.RED_BED) {
            Location bedLocation = clickedBlock.getLocation();

            if (bedLocation.getBlockX() == 46 && bedLocation.getBlockY() == 56 && bedLocation.getBlockZ() == 54) {
                player.sendMessage("Time to sleep... (0, 0, 0)!");
            }
        }
    }
}