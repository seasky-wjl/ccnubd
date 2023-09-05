package com.ccnu.pojo;

import java.io.Serializable;

public class PublicationStatus223 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 著作名称
     */
    private String bookName;

    /**
     * 著作类别
     */
    private String bookType;

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
     * 语种
     */
    private String language;

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
     * publication_status_2_2_3
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
     * 著作名称
     * @return book_name 著作名称
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * 著作名称
     * @param bookName 著作名称
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * 著作类别
     * @return book_type 著作类别
     */
    public String getBookType() {
        return bookType;
    }

    /**
     * 著作类别
     * @param bookType 著作类别
     */
    public void setBookType(String bookType) {
        this.bookType = bookType == null ? null : bookType.trim();
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
     * 语种
     * @return language 语种
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 语种
     * @param language 语种
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
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
        sb.append(", bookName=").append(bookName);
        sb.append(", bookType=").append(bookType);
        sb.append(", publishingHouse=").append(publishingHouse);
        sb.append(", publisherCountry=").append(publisherCountry);
        sb.append(", totalNumberOfWords=").append(totalNumberOfWords);
        sb.append(", numberOfIssues=").append(numberOfIssues);
        sb.append(", publicationDate=").append(publicationDate);
        sb.append(", bookNumber=").append(bookNumber);
        sb.append(", language=").append(language);
        sb.append(", role=").append(role);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}