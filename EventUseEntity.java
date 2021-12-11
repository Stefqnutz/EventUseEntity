package me.Tengoku.Terror.event.events;

import me.Tengoku.Terror.event.Event;
import net.minecraft.entity.Entity;

public class EventUseEntity extends Event<EventUseEntity> {

	private Entity target;
	
    private static double x;
    private static double y;
    private static double z;
    public boolean onGround;
    private static float pitch;
    private static float yaw;
	
	public EventUseEntity(Entity target, double x, double y, double z, float yaw, float pitch, boolean onGround) {
		this.target = target;
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw = yaw;
		this.pitch = pitch;
		this.onGround = onGround;
		setEntity(target);
	}
	
	public static double getX() {
		return x;
	}



	public static void setX(double x) {
		EventUseEntity.x = x;
	}



	public static double getY() {
		return y;
	}



	public static void setY(double y) {
		EventUseEntity.y = y;
	}



	public static double getZ() {
		return z;
	}



	public static void setZ(double z) {
		EventUseEntity.z = z;
	}



	public boolean isOnGround() {
		return onGround;
	}



	public void setOnGround(boolean onGround) {
		this.onGround = onGround;
	}



	public static float getPitch() {
		return pitch;
	}



	public static void setPitch(float pitch) {
		EventUseEntity.pitch = pitch;
	}



	public static float getYaw() {
		return yaw;
	}



	public static void setYaw(float yaw) {
		EventUseEntity.yaw = yaw;
	}



	public Entity getEntity() {
		return this.target;
	}
	
	public void setEntity(Entity target) {
		this.target = target;	
	}

}