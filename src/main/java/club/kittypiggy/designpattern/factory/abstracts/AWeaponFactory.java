package club.kittypiggy.designpattern.factory.abstracts;

public class AWeaponFactory implements WeaponFactory {
    public Gun getGun() {
        return new GunA();
    }
    public Bullet getBullet() {
        return new BulletA();
    }
}
