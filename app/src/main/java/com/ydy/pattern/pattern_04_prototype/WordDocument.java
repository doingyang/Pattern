package com.ydy.pattern.pattern_04_prototype;

/**
 * Author: ydy
 * Created: 2017/6/13 16:04
 * Description:
 */

import java.util.ArrayList;

/**
 * 文档类型，扮演的是具体的原型类角色；Cloneable是代表原型角色，是个接口（或者抽象类），声明具备clone能力
 */
public class WordDocument implements Cloneable{
    //文本
    private String mText;
    //图片列表
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("--------------WordDocument构造函数--------------");
    }

    @Override
    public WordDocument clone() throws CloneNotSupportedException {
        WordDocument document = (WordDocument) super.clone();
        document.mText = this.mText;
        document.mImages = this.mImages;
        return document;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getImages() {
        return mImages;
    }

    public void addImages(String img) {
        this.mImages.add(img);
    }

    /**
     * 打印文档内容
     */
    public void showDocument(){
        System.out.println("--------------Word Content Start--------------");
        System.out.println("Text：" + mText);
        System.out.println("Images List：");
        for (String imgName:mImages) {
            System.out.println("image name：" + imgName);
        }
        System.out.println("--------------Word Content End--------------");
    }

}
