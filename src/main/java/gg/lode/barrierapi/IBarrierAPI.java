package gg.lode.barrierapi;

import org.bukkit.World;
import org.bukkit.entity.Player;

public interface IBarrierAPI {

    /**
     * Resolves the world-scoped storm. When the storm's {@link AffectMode} is
     * {@link AffectMode#GLOBAL} (the default) this is the single shared border;
     * mutating it affects every player in the world.
     */
    IStorm getStorm(World world);

    /**
     * Resolves a player-scoped view of the storm in the player's current world.
     *
     * <p>When the storm is in {@link AffectMode#PER_PLAYER}, the returned
     * {@link IStorm} reads and writes that player's own border state (seeded from
     * the global template on first access), so mutations affect only this player.
     *
     * <p>When the storm is in {@link AffectMode#GLOBAL}, the returned view writes
     * through to the shared global border, preserving legacy behavior.
     */
    IStorm getStorm(Player player);

}
