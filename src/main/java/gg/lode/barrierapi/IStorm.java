package gg.lode.barrierapi;

import org.bukkit.Color;
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

    void setOrigin(double x, double z);

    void setOrigin(double x, double z, int time);

    void setOrigin(double x, double y, double z);

    void setOrigin(double x, double y, double z, int time);

    void setX(double x);

    void setZ(double z);

    void setY(double y);

    int getTicksBeforeDamage();

    void setTicksBeforeDamage(int ticksBeforeDamage);

    void damage(Player player);

    int getTicksToMove();

    int getTicksToShrink();

    boolean isInStorm(Entity entity);

    StormType getStormType();

    void setStormType(StormType stormType);

    void setWidth(double width);

    void setWidth(double width, int time);

    double getTargetY();

    double getCurrentY();

    double getTargetWidth();

    double getCurrentWidth();

    void setLength(double length);

    void setLength(double length, int time);

    double getTargetLength();

    double getCurrentLength();

    void setHeight(double height);

    void setHeight(double height, int time);

    double getTargetHeight();

    double getCurrentHeight();

    Color getColor();

    void setColor(Color color);
}
