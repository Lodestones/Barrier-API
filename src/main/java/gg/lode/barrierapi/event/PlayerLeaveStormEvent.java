package gg.lode.barrierapi.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;

public class PlayerLeaveStormEvent extends BaseEvent {
    private final Player player;

    public PlayerLeaveStormEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
