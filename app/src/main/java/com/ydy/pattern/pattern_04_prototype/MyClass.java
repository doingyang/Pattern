package com.ydy.pattern.pattern_04_prototype;

public class MyClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        //1.构建文档对象
        WordDocument originDoc = new WordDocument();
        //2.编辑文档，添加图片
        originDoc.setText("这是一篇文档");
        originDoc.addImages("图片1");
        originDoc.addImages("图片2");
        originDoc.addImages("图片3");
        originDoc.showDocument();

        //以原始文档为原型，拷贝一份副本
        WordDocument cloneDoc = originDoc.clone();
        cloneDoc.showDocument();
        //修改文档副本，不会影响原始文档
        cloneDoc.setText("这是修改过的文本");
        cloneDoc.showDocument();
        //显示原文档
        originDoc.showDocument();
    }
}
