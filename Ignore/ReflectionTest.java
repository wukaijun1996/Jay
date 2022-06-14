import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionTest {

    @Test
    public void test1(){
        Person p1 = new Person("Tom", 12);

        p1.age = 10;
        System.out.println(p1);

        p1.show();
    }

    @Test
    public void test2() throws Exception {

        Class<Person> personClass = Person.class;
        //通过反射，创建Person类的对象
        Constructor<Person> constructor = personClass.getConstructor(String.class, int.class);

        Person p = constructor.newInstance("Tom", 12);
        System.out.println(p);

        //通过反射，调用对象指定的属性，方法
        Field age = personClass.getDeclaredField("age");
        age.set(p,10);
        System.out.println(p);
        //调用方法
        Method show = personClass.getDeclaredMethod("show");
        show.invoke(p);

        System.out.println("**************************");
        //通过反射，可以调用Person类的私有结构，比如：私有的构造器  方法 属性
        //调用私有的构造器
        Constructor<Person> declaredConstructor = personClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Person p1 = declaredConstructor.newInstance("Jerry");
        System.out.println(p1);

        //调用私有的属性
        Field name = personClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p,"hanmeimei");
        name.set(p1,"hanmeimei");
        System.out.println(p);
        System.out.println(p1);

        //调用私有的方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = (String) showNation.invoke(p1, "中国");//相当于 String nation = p1.showNation("中国)
        System.out.println(nation);

    }

    /*
    Class的实例对应着一个运行时类
     */
    //获取Class的实例的方式(前3种需要掌握)
    @Test
    public void test3() throws ClassNotFoundException {

        //方式1  调用运行时类的属性 .class
        Class<Person> personClass1 = Person.class;
        System.out.println(personClass1);
        //方式2 通过运行时类的对象 调用getClass()
        Person person = new Person();
        Class<? extends Person> personClass2 = person.getClass();
        System.out.println(personClass2);

        //方式3 调用class的静态方法 调用forName(String classPath) (用的比较多)
        Class<?> personClass3 = Class.forName("Person");
        Class<?> personClass4 = Class.forName("java.lang.String");
        System.out.println(personClass3);
        System.out.println(personClass4);

        System.out.println(personClass1 == personClass2);
        System.out.println(personClass1 == personClass3);

        //方式4  使用类的加载器：Classloader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class<?> personClass5 = classLoader.loadClass("Person");
        System.out.println(personClass5);

        System.out.println(personClass1 == personClass5);


    }



}
