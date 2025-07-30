package gg.lode.barrierapi.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class PlayerLeaveStormEvent extends BaseEvent {
    private final Player player;
    private final World world;

    public PlayerLeaveStormEvent(World world, Player player) {
        this.world = world;
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
