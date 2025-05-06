package gg.lode.barrierapi.event;

import gg.lode.bookshelfapi.api.event.BaseEvent;
import org.bukkit.entity.Player;

public class PlayerEnterStormEvent extends BaseEvent {
    private final Player player;
    private int ticksBeforeDamage;
    private final boolean isInvulnerable;

    public PlayerEnterStormEvent(Player player) {
        this.player = player;
        this.ticksBeforeDamage = 0;
        this.isInvulnerable = false;
    }

    public PlayerEnterStormEvent(Player player, int ticksBeforeDamage) {
        this.player = player;
        this.ticksBeforeDamage = ticksBeforeDamage;
        this.isInvulnerable = false;
    }

    public PlayerEnterStormEvent(Player player, int ticksBeforeDamage, boolean isInvulnerable) {
        this.player = player;
        this.ticksBeforeDamage = ticksBeforeDamage;
        this.isInvulnerable = isInvulnerable;
    }

    public boolean isInvulnerable() {
        return isInvulnerable;
    }

    public int getTicksBeforeDamage() {
        return ticksBeforeDamage;
    }

    public void setTicksBeforeDamage(int ticksBeforeDamage) {
        this.ticksBeforeDamage = ticksBeforeDamage;
    }

    public Player getPlayer() {
        return player;
    }
}
