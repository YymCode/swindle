package alkweb.huawei.swindle.common.domain;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/12
 */
public class QueryRequest implements Serializable {


    private static final long serialVersionUID = 5931781773480863141L;


    private int pageSize;
    private int pageNum;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("pageSize", pageSize)
                .add("pageNum", pageNum)
                .toString();
    }




}
