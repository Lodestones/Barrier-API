package gg.lode.barrierapi.event;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import to.lodestone.bookshelfapi.api.event.BaseEvent;

public class PlayerDamageByStormEvent extends BaseEvent implements Cancellable {

    private final Player player;
    private double damage;
    private boolean isCancelled;

    public PlayerDamageByStormEvent(Player player, double damage) {
        this.player = player;
        this.damage = damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    public Player getPlayer() {
        return player;
    }

    public double getDamage() {
        return damage;
    }

}
