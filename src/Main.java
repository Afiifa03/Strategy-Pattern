interface QuackBehavior {
    void quack();
}

interface FlyBehavior {
    void fly();
}

class Quack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwek - Qwek");
    }
}

class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

class MuteQuack implements  QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Tidak Bisa Bersuara");
    }
}
class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Terbang");
    }
}

class FlyNoway implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Cool, terbang menggunakan roket");
    }
}

abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    abstract void display();

    void swim(){
        System.out.println("Berenang");
    }

    void performQuack(){
        System.out.println("Berenang");
    }
    void performFly(){
        flyBehavior.fly();
    }
    void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

class MallarDuck extends Duck {
    public MallardDuck (){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Tampilan RedHeadDuck");

    }
}

class RubberDuck extends Duck {
    public RubberDuck (){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoway();
    }

    @Override
    void display() {
        System.out.println("TampilanRubberDuck");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck (){
        quackBehavior = new Quack();
        flyBehavior = new FlyNoway();
    }

    @Override
    void display() {
        System.out.println("Tampilan WoodenDuck");
    }
}

class ModelDuck extends Duck {
    ModelDuck(){
        flyBehavior = new FlyNoway();
        quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("Tampilan ModelDuck");
    }
}
