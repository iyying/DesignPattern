package club.kittypiggy.designpattern.factory.abstracts;

public class BWeaponFactory implements WeaponFactory {
    public Gun getGun() {
        return new GunB();
    }
    public Bullet getBullet() {
        return new BulletB();
    }
}
