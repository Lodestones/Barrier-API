package to.lodestone.barrierapi.event;

import org.bukkit.entity.Player;
import to.lodestone.bookshelfapi.api.event.BaseEvent;

public class PlayerLeaveStormEvent extends BaseEvent {
    private final Player player;

    public PlayerLeaveStormEvent(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
