package src.File1.exer_图片的加密解密_统计文本字符出现次数;

import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 遍历文本的每一个字符，并统计每个字符出现的次数
 * @Time : 2022/6/9 21:49
 * @Author : wu
 * @File : WordCount.java
 * @Software: IntelliJ IDEA
 */
public class WordCount {

    @Test
    public void testWordCount(){

        FileReader fileReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            HashMap<Character,Integer > map = new HashMap<>();
            fileReader = new FileReader("dbcu.txt");
            int c = 0;
            while ((c = fileReader.read()) != -1){
                //int 还原 char
                char ch = (char) c;
                //判断char是否在map中第一次出现
                if (map.get(ch) == null){
                    map.put(ch,1);
                }else {
                    map.put(ch,map.get(ch) + 1);
                }
            }

            //把map中数据存在文件count.txt中
            bufferedWriter = new BufferedWriter(new FileWriter("wordcount.txt"));

            //遍历map，再写入数据
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry:entrySet) {
                switch (entry.getKey()){
                    case ' ':
                        bufferedWriter.write("空格=" + entry.getValue());
                        break;
                    case '\t':
                        bufferedWriter.write("tab键=" + entry.getValue());
                        break;
                    case '\r':
                        bufferedWriter.write("回车=" + entry.getValue());
                        break;
                    case '\n':
                        bufferedWriter.write("换行=" + entry.getValue());
                        break;
                    default:
                        bufferedWriter.write(entry.getKey()+ "=" + entry.getValue());
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader!= null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedWriter!= null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
