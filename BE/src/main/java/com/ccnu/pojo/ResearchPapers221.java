package com.ccnu.pojo;

import java.io.Serializable;

public class ResearchPapers221 implements Serializable {
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
     * research_papers_2_2_1
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
     * 论文名称
     * @return paper_name 论文名称
     */
    public String getPaperName() {
        return paperName;
    }

    /**
     * 论文名称
     * @param paperName 论文名称
     */
    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    /**
     * 论文类型
     * @return paper_type 论文类型
     */
    public String getPaperType() {
        return paperType;
    }

    /**
     * 论文类型
     * @param paperType 论文类型
     */
    public void setPaperType(String paperType) {
        this.paperType = paperType == null ? null : paperType.trim();
    }

    /**
     * 期刊名称
     * @return journal_name 期刊名称
     */
    public String getJournalName() {
        return journalName;
    }

    /**
     * 期刊名称
     * @param journalName 期刊名称
     */
    public void setJournalName(String journalName) {
        this.journalName = journalName == null ? null : journalName.trim();
    }

    /**
     * 期刊号ISSN
     * @return issue_number 期刊号ISSN
     */
    public String getIssueNumber() {
        return issueNumber;
    }

    /**
     * 期刊号ISSN
     * @param issueNumber 期刊号ISSN
     */
    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber == null ? null : issueNumber.trim();
    }

    /**
     * 发表语言
     * @return publishing_language 发表语言
     */
    public String getPublishingLanguage() {
        return publishingLanguage;
    }

    /**
     * 发表语言
     * @param publishingLanguage 发表语言
     */
    public void setPublishingLanguage(String publishingLanguage) {
        this.publishingLanguage = publishingLanguage == null ? null : publishingLanguage.trim();
    }

    /**
     * DOI
     * @return DOI DOI
     */
    public String getDoi() {
        return doi;
    }

    /**
     * DOI
     * @param doi DOI
     */
    public void setDoi(String doi) {
        this.doi = doi == null ? null : doi.trim();
    }

    /**
     * 是否ESI收录
     * @return whether_esi_is_included 是否ESI收录
     */
    public String getWhetherEsiIsIncluded() {
        return whetherEsiIsIncluded;
    }

    /**
     * 是否ESI收录
     * @param whetherEsiIsIncluded 是否ESI收录
     */
    public void setWhetherEsiIsIncluded(String whetherEsiIsIncluded) {
        this.whetherEsiIsIncluded = whetherEsiIsIncluded == null ? null : whetherEsiIsIncluded.trim();
    }

    /**
     * 收录索引
     * @return index 收录索引
     */
    public String getIndex() {
        return index;
    }

    /**
     * 收录索引
     * @param index 收录索引
     */
    public void setIndex(String index) {
        this.index = index == null ? null : index.trim();
    }

    /**
     * 作者序位
     * @return author_order 作者序位
     */
    public String getAuthorOrder() {
        return authorOrder;
    }

    /**
     * 作者序位
     * @param authorOrder 作者序位
     */
    public void setAuthorOrder(String authorOrder) {
        this.authorOrder = authorOrder == null ? null : authorOrder.trim();
    }

    /**
     * 是否通讯作者
     * @return whether_corresponding_author 是否通讯作者
     */
    public String getWhetherCorrespondingAuthor() {
        return whetherCorrespondingAuthor;
    }

    /**
     * 是否通讯作者
     * @param whetherCorrespondingAuthor 是否通讯作者
     */
    public void setWhetherCorrespondingAuthor(String whetherCorrespondingAuthor) {
        this.whetherCorrespondingAuthor = whetherCorrespondingAuthor == null ? null : whetherCorrespondingAuthor.trim();
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
        sb.append(", paperName=").append(paperName);
        sb.append(", paperType=").append(paperType);
        sb.append(", journalName=").append(journalName);
        sb.append(", issueNumber=").append(issueNumber);
        sb.append(", publishingLanguage=").append(publishingLanguage);
        sb.append(", doi=").append(doi);
        sb.append(", whetherEsiIsIncluded=").append(whetherEsiIsIncluded);
        sb.append(", index=").append(index);
        sb.append(", authorOrder=").append(authorOrder);
        sb.append(", whetherCorrespondingAuthor=").append(whetherCorrespondingAuthor);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isdelete=").append(isdelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}