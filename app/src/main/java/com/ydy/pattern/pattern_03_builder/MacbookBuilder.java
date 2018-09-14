package com.ydy.pattern.pattern_03_builder;

/**
 * Author: ydy
 * Created: 2017/6/13 11:29
 * Description:
 */
//具体的Builder类
public class MacbookBuilder extends Builder {

    private Computer mComputer = new Macbook();

    @Override
    public void buildBoard(String board) {
        mComputer.setBoard(board);
    }

    @Override
    public void buildDisplay(String display) {
        mComputer.setDisplay(display);
    }

    @Override
    public void buildOS() {
        mComputer.setOS();
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
