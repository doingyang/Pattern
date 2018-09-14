package com.ydy.pattern.pattern_16_visitor;

/**
 * Author: ydy
 * Created: 2017/9/21 11:02
 * Description:
 */

import java.util.LinkedList;
import java.util.List;

/**
 * 员工业务报表类
 */
public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("于经理"));
        mStaffs.add(new Engineer("工程师-Shawn.Xiong"));
        mStaffs.add(new Engineer("工程师-Kael"));
        mStaffs.add(new Engineer("工程师-Chaos"));
        mStaffs.add(new Engineer("工程师-Tilime"));
    }

    /**
     * 为访问者展示报表
     * @param visitor visitor公司高层，如CEO、CTO
     */
    public void showReport(Visitor visitor){
        for (Staff staff:mStaffs) {
            staff.accept(visitor);
        }
    }
}
