package com.swind.cloud.v2.common.msg;

import java.util.List;

/**
 * ${DESCRIPTION}
 */
public class PageResultResponse<T> extends BaseResponse {

    TableData<T> data;

    public PageResultResponse(int totalPage, int currentPage, long total, List<T> rows) {
        this.data = new TableData<T>(totalPage, currentPage, total, rows);
    }

    public PageResultResponse() {
        this.data = new TableData<T>();
    }

    PageResultResponse<T> total(int total) {
        this.data.setTotal(total);
        return this;
    }

    PageResultResponse<T> total(List<T> rows) {
        this.data.setRows(rows);
        return this;
    }

    public TableData<T> getData() {
        return data;
    }

    public void setData(TableData<T> data) {
        this.data = data;
    }

    class TableData<T> {
        int totalPage;
        int currentPage;
        long total;
        List<T> rows;

        public TableData(int totalPage, int currentPage, long total, List<T> rows) {
            this.totalPage = totalPage;
            this.currentPage = currentPage;
            this.total = total;
            this.rows = rows;
        }

        public TableData() {
        }

        public int getTotalPage() {
            return totalPage;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public long getTotal() {
            return total;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public List<T> getRows() {
            return rows;
        }

        public void setRows(List<T> rows) {
            this.rows = rows;
        }
    }
}
