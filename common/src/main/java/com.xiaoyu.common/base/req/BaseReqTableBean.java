package com.xiaoyu.common.base.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
/**
 * WJY
 */
@Data
@ApiModel(value = "BaseReqTableBean", description = "表格信息入参")
public class BaseReqTableBean extends BaseReqBean {

    private static final long serialVersionUID = -6869657724402999129L;

    @ApiModelProperty(value = "查询第几页数据", name = "pageNo")
    @NotNull(message = "查询第几页不能为空")
    private Integer pageNo;
    @ApiModelProperty(value = "每页查询条数", name = "pageSize")
    @NotNull(message = "每页查询多少行不能为空")
    private Integer pageSize;

    @ApiModelProperty(value = "排序字段，非必填", name = "orderField")
    private String orderField;
    @ApiModelProperty(value = "升序或者降序，非必填 ASC DESC", name = "ascOrDesc")
    private String ascOrDesc;

    @ApiModelProperty(hidden = true)
    private Integer startIndex;
    @ApiModelProperty(hidden = true)
    private Integer limit;

    public void setPage(Integer pageNo, Integer pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;

        if (pageNo == null || pageNo < 1) {
            this.pageNo = 1;
        }
        if (pageSize == null || pageSize < 1) {
            this.pageSize = 20;
        }

        if (pageSize != null && pageSize > 1000) {
            this.pageSize = 1000;
        }

        this.setStartIndex((this.pageNo - 1) * this.pageSize);
        this.setLimit(this.pageSize);
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        if (pageNo == null || pageNo < 1) {
            this.pageNo = 1;
        }
        setPage(this.pageNo, this.pageSize);
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        if (pageSize == null || pageSize < 1) {
            this.pageSize = 20;
        }
        setPage(this.pageNo, this.pageSize);
    }

    public Integer getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(Integer startIndex) {
        this.startIndex = startIndex;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

}
