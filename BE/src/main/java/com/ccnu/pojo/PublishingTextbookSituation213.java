package com.ccnu.pojo;

import java.io.Serializable;

public class PublishingTextbookSituation213 implements Serializable {
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
     * publishing_textbook_situation_2_1_3
     */
    private static final long serialVersionUID = 1L;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 导师唯一识别码
     * @return tutor_identification_code 导师唯一识别码
     */
    public String getTutorIdentificationCode() {
        return tutorIdentificationCode;
    }

    /**
     * 导师唯一识别码
     * @param tutorIdentificationCode 导师唯一识别码
     */
    public void setTutorIdentificationCode(String tutorIdentificationCode) {
        this.tutorIdentificationCode = tutorIdentificationCode == null ? null : tutorIdentificationCode.trim();
    }

    /**
     * 教材名称
     * @return textbook_name 教材名称
     */
    public String getTextbookName() {
        return textbookName;
    }

    /**
     * 教材名称
     * @param textbookName 教材名称
     */
    public void setTextbookName(String textbookName) {
        this.textbookName = textbookName == null ? null : textbookName.trim();
    }

    /**
     * 教材入选情况
     * @return situation_with_selected_textbooks 教材入选情况
     */
    public String getSituationWithSelectedTextbooks() {
        return situationWithSelectedTextbooks;
    }

    /**
     * 教材入选情况
     * @param situationWithSelectedTextbooks 教材入选情况
     */
    public void setSituationWithSelectedTextbooks(String situationWithSelectedTextbooks) {
        this.situationWithSelectedTextbooks = situationWithSelectedTextbooks == null ? null : situationWithSelectedTextbooks.trim();
    }

    /**
     * 出版社
     * @return publishing_house 出版社
     */
    public String getPublishingHouse() {
        return publishingHouse;
    }

    /**
     * 出版社
     * @param publishingHouse 出版社
     */
    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse == null ? null : publishingHouse.trim();
    }

    /**
     * 出版社所在国家
     * @return publisher_country 出版社所在国家
     */
    public String getPublisherCountry() {
        return publisherCountry;
    }

    /**
     * 出版社所在国家
     * @param publisherCountry 出版社所在国家
     */
    public void setPublisherCountry(String publisherCountry) {
        this.publisherCountry = publisherCountry == null ? null : publisherCountry.trim();
    }

    /**
     * 总字数
     * @return total_number_of_words 总字数
     */
    public String getTotalNumberOfWords() {
        return totalNumberOfWords;
    }

    /**
     * 总字数
     * @param totalNumberOfWords 总字数
     */
    public void setTotalNumberOfWords(String totalNumberOfWords) {
        this.totalNumberOfWords = totalNumberOfWords == null ? null : totalNumberOfWords.trim();
    }

    /**
     * 发行数
     * @return number_of_issues 发行数
     */
    public String getNumberOfIssues() {
        return numberOfIssues;
    }

    /**
     * 发行数
     * @param numberOfIssues 发行数
     */
    public void setNumberOfIssues(String numberOfIssues) {
        this.numberOfIssues = numberOfIssues == null ? null : numberOfIssues.trim();
    }

    /**
     * 出版日期
     * @return publication_date 出版日期
     */
    public String getPublicationDate() {
        return publicationDate;
    }

    /**
     * 出版日期
     * @param publicationDate 出版日期
     */
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate == null ? null : publicationDate.trim();
    }

    /**
     * 书号（ISBN）
     * @return book_number 书号（ISBN）
     */
    public String getBookNumber() {
        return bookNumber;
    }

    /**
     * 书号（ISBN）
     * @param bookNumber 书号（ISBN）
     */
    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber == null ? null : bookNumber.trim();
    }

    /**
     * 出版语言
     * @return publishing_language 出版语言
     */
    public String getPublishingLanguage() {
        return publishingLanguage;
    }

    /**
     * 出版语言
     * @param publishingLanguage 出版语言
     */
    public void setPublishingLanguage(String publishingLanguage) {
        this.publishingLanguage = publishingLanguage == null ? null : publishingLanguage.trim();
    }

    /**
     * 本人角色
     * @return role 本人角色
     */
    public String getRole() {
        return role;
    }

    /**
     * 本人角色
     * @param role 本人角色
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * 最后更新时间
     * @return last_time 最后更新时间
     */
    public String getLastTime() {
        return lastTime;
    }

    /**
     * 最后更新时间
     * @param lastTime 最后更新时间
     */
    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    /**
     * 是否删除
     * @return isdelete 是否删除
     */
    public String getIsdelete() {
        return isdelete;
    }

    /**
     * 是否删除
     * @param isdelete 是否删除
     */
    public void setIsdelete(String isdelete) {
        this.isdelete = isdelete == null ? null : isdelete.trim();
    }

    /**
     *
     * @mbggenerated 2020-12-21
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tutorIdentificationCode=").append(tutorIdentificationCode);
        sb.append(", textbookName=").append(textbookName);
        sb.append(", situationWithSelectedTextbooks=").append(situationWithSelectedTextbooks);
        sb.append(", publishingHouse=").append(publishingHouse);
        sb.append(", publisherCountry=").append(publisherCountry);
        sb.append(", totalNumberOfWords=").append(totalNumberOfWords);
        sb.append(", numberOfIssues=").append(numberOfIssues);
        sb.append(", publicationDate=").append(publicationDate);
        sb.append(", bookNumber=").append(bookNumber);
        sb.append(", publishingLanguage=").append(publishingLanguage);
        sb.append(", role=").append(role);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}