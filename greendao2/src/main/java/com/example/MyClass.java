package com.example;


import org.greenrobot.greendao.generator.DaoGenerator;
import org.greenrobot.greendao.generator.Entity;
import org.greenrobot.greendao.generator.Schema;

public class MyClass {
    public static void main(String[] args) {
        //创建一个模板
        /**
         * 参数一：当前模板的名称，会作为自动生成的java泪的e
         */
        Schema schema = new Schema("Android1607",1,"com.android.chengl.greendao.dao");
        Entity entity = schema.addEntity("User");
        entity.addIdProperty().primaryKey().autoincrement();
        entity.addStringProperty("name").notNull();
        entity.addStringProperty("sex");

        try {
            new DaoGenerator().generateAll(schema,"../GiftOne/grrndao/src/java");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
