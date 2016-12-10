import com.guoyang.composite.menu.Menu;
import com.guoyang.composite.menu.MenuComponent;
import com.guoyang.composite.menu.MenuItem;
import com.guoyang.composite.menu.Waitress;

/**
 * Created by L'Accordeur on 2016/12/3.
 */
public class NewMenuTest {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU","BREAKFAST");
        MenuComponent dinerMenu = new Menu("DINER MENU","LUNCH");
        MenuComponent cafeMenu = new Menu("CAFE MENU","DINNER");
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS","All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("Vegetarian BLT","Bacon with lettuce & tomato on whole wheat",true,2.99));
        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("Soup of the day","Soup with the day,with a side of potato salad",false,3.29));

        cafeMenu.add(new MenuItem("Hotdog","A hot dog,with saurkraut,relish,onions,topped with cheese",false,3.05));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
