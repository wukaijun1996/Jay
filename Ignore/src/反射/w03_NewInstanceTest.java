package src.反射;

import org.junit.Test;

import java.util.Random;

/*

通过反射创建对应的运行时类的对象

 */
public class w03_NewInstanceTest {

    @Test
    public void test1() throws InstantiationException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        //newInstance() 调用此方法创建对应的运行时类的对象
        Person person = personClass.newInstance();
        System.out.println(person);

    }

    @Test
    public void test2(){

        for (int j = 0; j < 100; j++) {


        int i = new Random().nextInt(3);
        String classPath = "";
        switch (i){
            case 0:
                classPath = "java.util.Date";
                break;
            case 1:
                classPath = "java.lang.object";
                break;
            case 2:
                classPath = "src.反射.Person";
                break;
        }

        try {
            Object o = getInstance(classPath);
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }

        }

    }

    //创建一个指定类的对象
    public Object getInstance(String classPath) throws Exception {
        Class<?> aClass = Class.forName(classPath);
        return aClass.newInstance();
    }



}
