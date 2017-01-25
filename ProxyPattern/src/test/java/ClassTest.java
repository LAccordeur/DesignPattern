import com.guoyang.proxy.protect.PersonBean;
import com.guoyang.proxy.protect.PersonBeanImpl;

/**
 * Created by L'Accordeur on 2017/1/22.
 */
public class ClassTest {
    public static void main(String[] args) {
        PersonBean personBean = new PersonBeanImpl();
        PersonBeanImpl personBean1 = new PersonBeanImpl();
        System.out.println(personBean.getClass().getInterfaces());
        System.out.println(personBean1.getClass().getInterfaces());
    }
}
