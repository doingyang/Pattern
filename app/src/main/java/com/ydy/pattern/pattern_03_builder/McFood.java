package com.ydy.pattern.pattern_03_builder;

/**
 * Author: ydy
 * Created: 2017/6/13 14:31
 * Description:
 */

public class McFood {

    private int totalCount;    //份数
    private String remark;      //备注
    private boolean addIce;    //饮料是否去冰
    private boolean takeOut;   //是否外带
    private Hamburg hamburg;    //汉堡包
    private Drink drink;        //饮品

    //汉堡包类
    public static class Hamburg {
        public static final String HAMBURG_CHICKEN = "chicken";
        public static final String HAMBURG_BEEF = "beef";
        private String hamburgName;

        public Hamburg(String hamburgName) {
            this.hamburgName = hamburgName;
        }

        public String getHamburgName() {
            return hamburgName;
        }

        @Override
        public String toString() {
            return getHamburgName();
        }
    }

    //饮品类
    public static class Drink {
        public static final String DRINK_COLA = "cola";
        public static final String DRINK_SPRITE = "sprite";
        private String drinkName;

        public Drink(String drinkName) {
            this.drinkName = drinkName;
        }

        public String getDrinkName() {
            return drinkName;
        }

        @Override
        public String toString() {
            return getDrinkName();
        }
    }

    //设置McFood的构造方法【引入Builder】
    public McFood(Builder builder) {
        this.totalCount = builder.totalCount;
        this.addIce = builder.addIce;
        this.hamburg = builder.hamburg;
        this.drink = builder.drink;
        this.remark = builder.remark;
        this.takeOut = builder.takeOut;
    }

    //引入Builder类，增强客户端可用性和可读性【McFood的内部类】
    public static class Builder {
        private int totalCount = 0;
        private String remark = null;
        private Hamburg hamburg = null;
        private Drink drink = null;
        private boolean addIce = false;
        private boolean takeOut = false;

        public Builder totalCount(int totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public Builder addIce(boolean addIce) {
            this.addIce = addIce;
            return this;
        }

        public Builder hamburg(Hamburg hamburg) {
            this.hamburg = hamburg;
            return this;
        }

        public Builder drink(Drink drink) {
            this.drink = drink;
            return this;
        }

        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        public Builder takeOut(boolean takeOut) {
            this.takeOut = takeOut;
            return this;
        }

        public McFood create() { // 构建，返回一个新对象
            return new McFood(this);
        }
    }

    @Override
    public String toString() {
        return "McFood{" +
                "totalCount=" + totalCount +
                ", remark='" + remark + '\'' +
                ", addIce=" + addIce +
                ", takeOut=" + takeOut +
                ", hamburg=" + hamburg +
                ", drink=" + drink +
                '}';
    }
}
