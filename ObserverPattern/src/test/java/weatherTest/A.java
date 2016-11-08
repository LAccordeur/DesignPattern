package weatherTest;

/**
 * Created by HP on 2016/11/8.
 */
public class A{
    public A(){
        this.print();//这个print方法在子类中被覆盖
        System.out.println(this.getClass());
    }
    public void print(){
        System.out.println("A");
    }
}
class B extends A{
    B(){
        super();//调用父类构造函数
    }
//    public void print(){
//        System.out.println("B");
//    }
}

class Test {
    public static void main(String[] args) {
        A a = new B();
    }
}
