/*
静态代理举例
 */

interface ClothFactory {
    public abstract void produceCloth();
}

//代理类
class ProxyClothFactory implements ClothFactory {
    private ClothFactory factory;//用被代理类进行实例化

    public ProxyClothFactory(ClothFactory factory) {
        this.factory = factory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        factory.produceCloth();
        System.out.println("代理工厂做一些后续的收尾工作");
    }
}

//被代理类
class NikeClothFactory implements ClothFactory {
    @Override
    public void produceCloth() {
        System.out.println("Nike工厂生产一批运动服");
    }
}

public class w01_StaticProxyTest {

    public static void main(String[] args) {
//        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(new NikeClothFactory());
        proxyClothFactory.produceCloth();

        System.out.println("**********************");
        //动态代理
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ClothFactory proxyInstance = (ClothFactory) ProxyFactory.getProxyInstance(nikeClothFactory);
        proxyInstance.produceCloth();


    }


}
