package gg.lode.barrierapi;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public interface IStorm {
    double getDamage();

    int getDamageTick();

    double getCurrentX();

    double getCurrentZ();

    double getTargetX();

    double getTargetZ();

    Location getCurrentCenter();

    Location getTargetCenter();

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

    void setSize(double size, int time);

    void setSize(double size);

    void setSize(double width, double height, double length);

    void setSize(double width, double length);

    void setSize(double width, double height, double length, int time);

    void setSize(double width, double length, int time);

    double getTargetHeight();

    double getCurrentHeight();

    Color getColor();

    void setColor(Color color);

    void hideStorm(Player player);

    void showStorm(Player player);

    // Movement helpers
    void moveUp(double value);

    void moveUp(double value, int time);

    void moveDown(double value);

    void moveDown(double value, int time);

    void moveTo(Location location);

    void moveTo(Location location, int time);

    // Size helpers - radius (circle)
    void shrink(double value);

    void shrink(double value, int time);

    void expand(double value);

    void expand(double value, int time);

    // Size helpers - area (width & length)
    void shrinkArea(double value);

    void shrinkArea(double value, int time);

    void expandArea(double value);

    void expandArea(double value, int time);

    // Size helpers - height
    void shrinkHeight(double value);

    void shrinkHeight(double value, int time);

    void expandHeight(double value);

    void expandHeight(double value, int time);

    // Control helpers
    void stop();

    void stopMoving();

    void stopResizing();

    // Query helpers
    boolean isMoving();

    boolean isResizing();
}
