package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表213前端展示数据
 * @author: lsc
 * @create: 2021-10-21 22:09
 **/
public class PublishingTextbookSituation213Vo {

    /**
     *
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 教材名称
     */
    private String textbookName;

    /**
     * 教材入选情况
     */
    private String situationWithSelectedTextbooks;

    /**
     * 出版社
     */
    private String publishingHouse;

    /**
     * 出版社所在国家
     */
    private String publisherCountry;

    /**
     * 总字数
     */
    private String totalNumberOfWords;

    /**
     * 发行数
     */
    private String numberOfIssues;

    /**
     * 出版日期
     */
    private String publicationDate;

    /**
     * 书号（ISBN）
     */
    private String bookNumber;

    /**
     * 出版语言
     */
    private String publishingLanguage;

    /**
     * 本人角色
     */
    private String role;

    /**
     * 最后更新时间
     */
    private String lastTime;

    /**
     * 是否删除
     */
    private String isdelete;

    /**
     * 博导姓名
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

    public String getTextbookName() {
        return textbookName;
    }

    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName;
    }

    public String getSituationWithSelectedTextbooks() {
        return situationWithSelectedTextbooks;
    }

    public void setSituationWithSelectedTextbooks(String situationWithSelectedTextbooks) {
        this.situationWithSelectedTextbooks = situationWithSelectedTextbooks;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getPublisherCountry() {
        return publisherCountry;
    }

    public void setPublisherCountry(String publisherCountry) {
        this.publisherCountry = publisherCountry;
    }

    public String getTotalNumberOfWords() {
        return totalNumberOfWords;
    }

    public void setTotalNumberOfWords(String totalNumberOfWords) {
        this.totalNumberOfWords = totalNumberOfWords;
    }

    public String getNumberOfIssues() {
        return numberOfIssues;
    }

    public void setNumberOfIssues(String numberOfIssues) {
        this.numberOfIssues = numberOfIssues;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getPublishingLanguage() {
        return publishingLanguage;
    }

    public void setPublishingLanguage(String publishingLanguage) {
        this.publishingLanguage = publishingLanguage;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
