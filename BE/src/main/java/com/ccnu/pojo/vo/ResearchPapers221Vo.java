package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表221前端展示数据
 * @author: lsc
 * @create: 2021-10-21 22:30
 **/
public class ResearchPapers221Vo {

    /**
     *
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 论文名称
     */
    private String paperName;

    /**
     * 论文类型
     */
    private String paperType;

    /**
     * 期刊名称
     */
    private String journalName;

    /**
     * 期刊号ISSN
     */
    private String issueNumber;

    /**
     * 发表语言
     */
    private String publishingLanguage;

    /**
     * DOI
     */
    private String doi;

    /**
     * 是否ESI收录
     */
    private String whetherEsiIsIncluded;

    /**
     * 收录索引
     */
    private String index;

    /**
     * 作者序位
     */
    private String authorOrder;

    /**
     * 是否通讯作者
     */
    private String whetherCorrespondingAuthor;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 是否删除
     */
    private String isdelete;

    /**
     * 导师姓名
     */
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName;
    }

    public String getPaperType() {
        return paperType;
    }

    public void setPaperType(String paperType) {
        this.paperType = paperType;
    }

    public String getJournalName() {
        return journalName;
    }

    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getPublishingLanguage() {
        return publishingLanguage;
    }

    public void setPublishingLanguage(String publishingLanguage) {
        this.publishingLanguage = publishingLanguage;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getWhetherEsiIsIncluded() {
        return whetherEsiIsIncluded;
    }

    public void setWhetherEsiIsIncluded(String whetherEsiIsIncluded) {
        this.whetherEsiIsIncluded = whetherEsiIsIncluded;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getAuthorOrder() {
        return authorOrder;
    }

    public void setAuthorOrder(String authorOrder) {
        this.authorOrder = authorOrder;
    }

    public String getWhetherCorrespondingAuthor() {
        return whetherCorrespondingAuthor;
    }

    public void setWhetherCorrespondingAuthor(String whetherCorrespondingAuthor) {
        this.whetherCorrespondingAuthor = whetherCorrespondingAuthor;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

