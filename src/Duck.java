interface QuackBehavior {
    void quack();
}
interface FlyBehavior {
    void fly();
}

class Quack implements QuackBehavior{
    public void quack() {
        System.out.println("Qwek - Qwek");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Tidak Bisa Bersuara");
    }
}

class FlyWithWings implements FlyBehavior{
    public void fly() {
        System.out.println("Terbng");
    }
}
class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("Tidak bisa terbang");
    }
}

class FlyWithRocketPower implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Cool, terbang menggunakan rocket");
    }
}


