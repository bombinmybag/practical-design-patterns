package in.ashwanik.pdp.creational.prototype;

class LongSword extends Weapon {
    LongSword(String name,
              String description,
              int weight,
              int minimumDamage,
              int maximumDamage) {
        super(name, description, weight, minimumDamage, maximumDamage);
    }
}
