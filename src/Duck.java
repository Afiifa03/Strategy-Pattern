//Tahap 1. Menggunakan Inheritance
abstract class duck {
    void quack(){
        System.out.println("Queck Qweck");
    }
    void swim(){
        System.out.println("Berenang");
    }
    abstract void display();

    void fly(){
        System.out.println("Terbang");
    }
}

class Mallarduck extends Duck{
    @Override
    void display() {
        System.out.println("Tampilan MallarDuck");
    }
}

class RedHeadDuck extends Duck{
    @Override
    void display() {
        System.out.println("Tampilan RedHeadDuck");
    }
}

class rubberducK extends Duck{

    @Override
    void display() {
        System.out.println("Tampilan RubberDuck");
    }

    void quack(){
        System.out.println("Bunyinya squeek, bukan qwak");
    }

    void fly(){
        //Tidak ada implementasi, karena bebek mainan tidak dapat terbang
    }
}

class woodenDuck extends  Duck {

    @Override
    void display() {
        System.out.println("Tampilan WoodenDuck");
    }

    void quack(){
        //Tidak ada implementasi, karena bebek mainan idak dapat bersuara
    }
    @Override
    void swim(){
        System.out.println("Mengambang");
    }

    void fly(){
        //Tidak ada implementasi, karena bebek mainan tidak dapat terbang
    }
}

//Tahap 2. Menggunakan Interface
interface Quackable {
    void quack();
}
interface Flyable {
    void fly();
}
abstract class DUck{
    abstract void display();

    void swim(){
        System.out.println("Berenang");
    }
}
class MallardDuck extends Duck implements Quackable, Flyable{

    @Override
    void display() {
        System.out.println("Qwek Qwek");
    }

    @Override
    public void quack() {
        System.out.println("Terbang");
    }

    @Override
    public void fly() {
        System.out.println("Tampilan MallardDuck");

    }
}

class  RedheadDuck extends  Duck implements Quackable,Flyable{

    @Override
    void display() {
        System.out.println("Tampilan RedheadDuck");
    }

    @Override
    public void quack() {
        System.out.println("Qwek Qwek");

    }

    @Override
    public void fly() {
        System.out.println("Terbang");
    }
}

class Rubberduck extends Duck implements Quackable {
    @Override
    public void quack(){
        System.out.println("Squeak");
    }
    @Override
    void display(){
        System.out.println("Tampilan RubberDuck");
    }
}

class ToyDuck extends Duck implements Flyable {

    @Override
    void display() {
        System.out.println("Tampilan ToyDuck");

    }

    @Override
    public void fly() {
        System.out.println("Terbang seperti mainan");

    }
}

// Tahap 3
interface Quackbehavior {
    void quack();
}

interface flyBehavior {
    void fly();
}

class quack implements  QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Qwek - Qwek");
    }
}

class squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}

class Mutequack implements  QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Tidak Bisa Bersuara");
    }
}
class flyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("Terbang");
    }
}

class flyNoway implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Cool, terbang menggunakan roket");
    }
}

abstract class dUck {
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

class Mallardduck extends Duck {
    public Mallardduck (){
        Quack quackBehavior = new Quack();
        FlyWithWings flyBehavior = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Tampilan RedHeadDuck");

    }
}

class rubberduck extends Duck {
    public rubberduck (){
        Squeak quackBehavior = new Squeak();
        FlyNoway flyBehavior = new FlyNoway();
    }

    @Override
    void display() {
        System.out.println("TampilanRubberDuck");
    }
}

class Woodenduck extends Duck {
    public Woodenduck (){
        Quack quackBehavior = new Quack();
        FlyNoway flyBehavior = new FlyNoway();
    }

    @Override
    void display() {
        System.out.println("Tampilan WoodenDuck");
    }
}

class Modelduck extends Duck {
    Modelduck(){
        FlyNoway flyBehavior = new FlyNoway();
        Quack quackBehavior = new Quack();
    }

    @Override
    void display() {
        System.out.println("Tampilan ModelDuck");
    }
}
