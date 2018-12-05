package com.july.po;

import java.util.Date;

public class BlogContent {
    private Integer contentId;

    private Integer contentType;

    private String contentTitle;

    private Date contentCreateTime;

    private Date contentUpdateTime;

    private Integer contentStatus;

    private String contentContent;

    private Integer contentViews;

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle == null ? null : contentTitle.trim();
    }

    public Date getContentCreateTime() {
        return contentCreateTime;
    }

    public void setContentCreateTime(Date contentCreateTime) {
        this.contentCreateTime = contentCreateTime;
    }

    public Date getContentUpdateTime() {
        return contentUpdateTime;
    }

    public void setContentUpdateTime(Date contentUpdateTime) {
        this.contentUpdateTime = contentUpdateTime;
    }

    public Integer getContentStatus() {
        return contentStatus;
    }

    public void setContentStatus(Integer contentStatus) {
        this.contentStatus = contentStatus;
    }

    public String getContentContent() {
        return contentContent;
    }

    public void setContentContent(String contentContent) {
        this.contentContent = contentContent == null ? null : contentContent.trim();
    }

    public Integer getContentViews() {
        return contentViews;
    }

    public void setContentViews(Integer contentViews) {
        this.contentViews = contentViews;
    }
}