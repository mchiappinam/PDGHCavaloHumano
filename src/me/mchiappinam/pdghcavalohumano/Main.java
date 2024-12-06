package me.mchiappinam.pdghcavalohumano;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	   
    public void onEnable() {
    	getLogger().info("PDGHCavaloHumano ativado - Plugin by: mchiappinam");
    	getLogger().info("Acesse: http://pdgh.net/");
       
    }
   
    public void onDisable() {
    	getLogger().info("PDGHCavaloHumano ativado - Plugin by: mchiappinam");
    	getLogger().info("Acesse: http://pdgh.net/");
    }
   
    @SuppressWarnings("deprecation")
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
       
        @EventHandler
        public void onPlayerInteract(PlayerInteractEntityEvent e) {
        Player player = e.getPlayer();
        Entity entity = e.getRightClicked();
        Player target = getServer().getPlayer(args[0]);
            if(player.getItemInHand().getTypeId() == Material.AIR.getId()) {
                player.setPassenger(target);
        }
        }
    }
}
