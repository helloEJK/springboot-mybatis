package com.example.springbootmybatis.entity;

public class Page<T> {

    int page;//起始页
    int limit;//页数大小
    int count;//数据数量
    int currentResult; //当前起始索引
    T example;//任何类型条件
    boolean paging = false;//是否需要分页

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCurrentResult() {
        currentResult = (getPage()-1)*getLimit();
        if(currentResult<0)
            currentResult = 0;
        return currentResult;
    }

    public void setCurrentResult(int currentResult) {
        this.currentResult = currentResult;
    }

    public T getExample() {
        return example;
    }

    public void setExample(T example) {
        this.example = example;
    }

    public boolean isPaging() {
        return paging;
    }

    public void setPaging(boolean paging) {
        this.paging = paging;
    }

}
