package gg.lode.barrierapi;

/**
 * Controls whether a storm's geometry, damage and visuals are shared by every
 * player in the world ({@link #GLOBAL}) or maintained independently per player
 * ({@link #PER_PLAYER}).
 *
 * <p>Defaults to {@link #GLOBAL}, which is identical to the historical
 * (single shared border) behavior. Switching to {@link #PER_PLAYER} lets callers
 * resolve a player-scoped {@link IStorm} via {@link IBarrierAPI#getStorm(org.bukkit.entity.Player)}
 * and mutate that player's border without affecting anyone else.
 */
public enum AffectMode {
    /** One shared border for the whole world. */
    GLOBAL,
    /** Each player has their own independent border, seeded from the global template. */
    PER_PLAYER
}
