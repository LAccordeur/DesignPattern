import com.guoyang.adapter.Duck;
import com.guoyang.adapter.Turkey;
import com.guoyang.adapter.TurkeyAdapter;
import com.guoyang.adapter.WildTurkey;

/**
 * Created by L'Accordeur on 2016/12/2.
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        testDuck(duck);
    }

    static void testDuck(Duck duck) {
        duck.fly();
        duck.quack();
    }
}
