package join;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.brvdleyowens.listeners.Main;

import utils.Utils;

public class JoinListener implements Listener {
	
	private static Main plugin;
	
	public JoinListener(Main plugin) {
		this.plugin = plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		if (!p.hasPlayedBefore()) {
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("firstJoin_Message").replace("<player>", p.getName())));
		} else {
			e.setJoinMessage(Utils.chat(plugin.getConfig().getString("join_Message").replace("<player>", p.getName())));
		}
	}
}
