package src.集合.exer;

import java.util.*;

/**
 * @Time : 2022/6/7 20:41
 * @Author : wu
 * @File : DAO.java
 * @Software: IntelliJ IDEA
 */
public class DAO<T> {

    private Map<String,T> map = new HashMap<String,T>();

    //保存T类型的对象到Map 成员变量中
    public void save(String id,T entity){

        map.put(id,entity);
    }

    //从map中获取id对应的对象
    public T get(String id){

        return map.get(id);
    }

    //替换 map中key为id的内容，改为entiy对象
    public void update(String id,T entity){

        if (map.containsKey(id)){
            map.put(id,entity);
        }

    }

    //返回map中 存放的所有T对象
    public List<T> list(){

        ArrayList<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t:values) {
            list.add(t);
        }
        return list;
    }

    //删除指定id对象
    public void delete(String id){
        map.remove(id);
    }


}
