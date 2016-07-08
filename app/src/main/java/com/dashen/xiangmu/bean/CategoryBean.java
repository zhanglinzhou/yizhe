package com.dashen.xiangmu.bean;

import java.util.List;

/**
 * Created by Administrator on 2016/6/28.
 *
 */
public class CategoryBean {

    /**
     * 调用 getResult（）可以得到CategoryBean的集合
     * error_code : 0
     * reason : Success!
     * result : [{"id":11,"name":"减肥瘦身"},{"id":7,"name":"私密生活"},{"id":5,"name":"女性保养"},{"id":4,"name":"男性健康"},{"id":6,"name":"孕婴手册"},{"id":13,"name":"夫妻情感"},{"id":8,"name":"育儿宝典"},{"id":3,"name":"健康饮食"},{"id":12,"name":"医疗护理"},{"id":1,"name":"老人健康"},{"id":2,"name":"孩子健康"},{"id":10,"name":"四季养生"},{"id":9,"name":"心里健康"}]
     */

    private int error_code;
    private String reason;
    /**
     * id : 11
     * name : 减肥瘦身
     */

    private List<ResultBean> result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
