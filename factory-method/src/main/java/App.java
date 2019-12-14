import com.sl.Creator;
import com.sl.creatro.ConcreteCreator;
import com.sl.product.BMWCar;

/**
 * @author shuliangzhao
 * @Title: App
 * @ProjectName maven-parent
 * @Description: 设计模式-工厂方法
 * @date 2018/12/23 14:54
 */
public class App {

    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        BMWCar bmwCar = creator.creatorCar(BMWCar.class);
        bmwCar.brand();
    }
}
