package com.dashen.xiangmu.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by Administrator on 2016/7/3.
 */
@Table(name = "search_history",id = "_id")
public class HistoryEntity extends Model {

    @Column(name = "searchHistory")
    private String searchHistory;

    public HistoryEntity() {
    }

    public HistoryEntity(String searchHistory) {
        this.searchHistory = searchHistory;
    }

    public String getSearchHistory() {
        return searchHistory;
    }

    public void setSearchHistory(String searchHistory) {
        this.searchHistory = searchHistory;
    }
}
