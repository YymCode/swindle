package alkweb.huawei.swindle.system.requestQo;

import com.google.common.base.MoreObjects;

import java.io.Serializable;

/**
 * @Author: YuYuMing
 * @email 642346596@qq.com
 * @Date: 2020/3/15
 */
public class MainPageQo implements Serializable {
    private static final long serialVersionUID = -4725378532882229291L;

    //搜索日期
    private String searchDate;

    //预警级别
    private String warnLevel;

    public String getSearchDate() {
        return searchDate;
    }

    public void setSearchDate(String searchDate) {

        this.searchDate = searchDate;
    }

    public String getWarnLevel() {
        return warnLevel;
    }

    public void setWarnLevel(String warnLevel) {

        this.warnLevel = warnLevel == null ? null : warnLevel.trim();
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("searchDate", searchDate)
                .add("warnLevel", warnLevel)
                .toString();
    }

}
