package realDuck;
import duck.Duck;
import duck.FlyNoWay;
import duck.Quack;

/**
 * Created by L'Accordeur on 2016/9/19.
 */
public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I'm a model duck.");
    }
}
