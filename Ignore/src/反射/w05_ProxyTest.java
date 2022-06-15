
/*
动态代理举例
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Human{
    String getBelief();
    void eat(String food);
}

//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "I believe I can fly!";
    }

    @Override
    public void eat(String food) {
        System.out.println("我喜欢吃" + food);
    }
}

/*
实现动态代理
 */
class ProxyFactory{
    //调用此方法，返回一个代理类的对象，
    public static Object getProxyInstance(Object obj){//obj ：被代理类的对象
        MyInvocationHandler handler = new MyInvocationHandler();

        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),handler);
    }
}

class MyInvocationHandler implements InvocationHandler{
    private Object obj;//需要使用被代理类的对象进行赋值

    public void bind(Object obj){
        this.obj = obj;
    }

    //当通过代理类的对象，调用方法a时，会自动调用入选的方法invoke（）
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //method：即为代理类对象调用的方法，此方法作为了被代理类对象要调用的方法
        //obj ：被代理类的对象
        Object returnValue = method.invoke(obj, args);
        //上述方法的返回值作为当前类中的invoke()
        return returnValue;

    }
}

public class w02_ProxyTest {
    public static void main(String[] args) {
        SuperMan superMan = new SuperMan();
        //proxyInstance 代理类的对象
        Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);

        System.out.println(proxyInstance.getBelief());
        proxyInstance.eat("香蕉");
    }


}
