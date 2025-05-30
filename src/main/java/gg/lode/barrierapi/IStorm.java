package gg.lode.barrierapi;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public interface IStorm {
    double getDamage();

    int getDamageTick();

    double getX();

    double getZ();

    void setTicksToShrink(int time);

    void setRadius(double radius, int time);

    void setRadius(double radius);

    void setRadius(int radius);

    void setTicksToMove(int time);

    void update();

    void setDamage(double damage);

    double getCurrentRadius();

    double getTargetRadius();

    void setDamageTick(int damageTick);

    void setOrigin(double x, double z, int time);

    void setOrigin(double x, double z);

    void setX(double x);

    void setZ(double z);

    int getTicksBeforeDamage();

    void setTicksBeforeDamage(int ticksBeforeDamage);

    void damage(Player player);

    int getTicksToMove();

    int getTicksToShrink();
    boolean isInStorm(Entity entity);
}
