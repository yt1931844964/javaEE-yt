package java进阶;

import java.io.*;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

// 定义女朋友信息注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface GirlfriendInfo {
    String value();
}

// 定义基础对象类：女朋友
class Girlfriend {
    private String name;
    private int age;
    private double height;
    private double weight;
    private String profession;

    public Girlfriend() {}

    public Girlfriend(String name, int age, double height, double weight, String profession) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

// 女朋友管理器类
class GirlfriendManager {
    private Map<String, Girlfriend> girlfriends;

    public GirlfriendManager() {
        girlfriends = new HashMap<>();
    }

    // 添加新女朋友
    public void addGirlfriend(Girlfriend girlfriend) {
        girlfriends.put(girlfriend.getName(), girlfriend);
        System.out.println("女朋友 " + girlfriend.getName() + " 已添加成功。");
    }

    // 删除女朋友
    public void removeGirlfriend(String name) {
        if (girlfriends.containsKey(name)) {
            girlfriends.remove(name);
            System.out.println("女朋友 " + name + " 已删除成功。");
        } else {
            System.out.println("女朋友 " + name + " 不存在，请重新输入。");
        }
    }

    // 查找女朋友
    public Girlfriend findGirlfriend(String name) {
        if (girlfriends.containsKey(name)) {
            return girlfriends.get(name);
        } else {
            System.out.println("女朋友 " + name + " 不存在，请重新输入。");
            return null;
        }
    }

    // 修改女朋友信息
    public void modifyGirlfriend(String name, Map<String, Object> properties) throws Exception {
        Girlfriend girlfriend = findGirlfriend(name);
        if (girlfriend == null) {
            return;
        }

        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Field field = girlfriend.getClass().getDeclaredField(key);
            field.setAccessible(true);
            field.set(girlfriend, value);
            System.out.println("女朋友 " + girlfriend.getName() + " 的 " + key + " 已修改为 " + value);
        }
    }

    // 列出所有女朋友
    public void listGirlfriends() {
        for (Girlfriend girlfriend : girlfriends.values()) {
            System.out.println(girlfriend.getName() + "，" + girlfriend.getAge() + "岁，"
                    + girlfriend.getHeight() + "cm，" + girlfriend.getWeight() + "kg，"
                    + girlfriend.getProfession());
        }
    }

    // 保存女朋友信息到文件中
    public void saveToFile(String filename) throws IOException {
        File file = new File(filename);
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        for (Girlfriend girlfriend : girlfriends.values()) {
            StringBuilder sb = new StringBuilder();
            sb.append(girlfriend.getName()).append(",").append(girlfriend.getAge()).append(",")
                    .append(girlfriend.getHeight()).append(",").append(girlfriend.getWeight()).append(",")
                    .append(girlfriend.getProfession()).append("\n");
            bw.write(sb.toString());
        }

        bw.close();
        fw.close();
        System.out.println("女朋友信息已保存至文件 " + filename);
    }

    // 从文件中读取女朋友信息
    public void loadFromFile(String filename) throws IOException {
        File file = new File(filename);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;

        while ((line = br.readLine()) != null) {
            String[] arr = line.split(",");
            Girlfriend girlfriend = new Girlfriend(arr[0], Integer.parseInt(arr[1]),
                    Double.parseDouble(arr[2]), Double.parseDouble(arr[3]),
                    arr[4]);
            girlfriends.put(girlfriend.getName(), girlfriend);
        }

        br.close();
        fr.close();
        System.out.println("女朋友信息已从文件 " + filename + " 中读取成功。");
    }
}

// 测试类
public class GirlfriendManagementSystemTest {
    public static void main(String[] args) throws Exception {
        GirlfriendManager manager = new GirlfriendManager();

        // 添加女朋友
        Girlfriend gf1 = new Girlfriend("Alice", 20, 165.5, 55.0, "程序员");
        manager.addGirlfriend(gf1);

        // 修改女朋友信息
        Map<String, Object> properties = new HashMap<>();
        properties.put("age", 22);
        properties.put("height", 170.0);
        manager.modifyGirlfriend("Alice", properties);

        // 列出所有女朋友
        manager.listGirlfriends();

        // 保存女朋友信息到文件中
        manager.saveToFile("girlfriends.txt");

        // 从文件中读取女朋友信息
        manager.loadFromFile("girlfriends.txt");
    }
}
