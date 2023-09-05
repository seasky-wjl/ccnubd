package com.ccnu.pojo;

import java.io.Serializable;

public class ParticipationInternationalAcademicConferences225 implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 导师唯一识别码
     */
    private String tutorIdentificationCode;

    /**
     * 学术会议名称
     */
    private String academicConferenceName;

    /**
     * 主办单位
     */
    private String organizer;

    /**
     * 会议举办所在国家/地区
     */
    private String conferenceHeldCountryOrRegion;

    /**
     * 会议举办所在城市
     */
    private String conferenceCity;

    /**
     * 会议开幕日期
     */
    private String openingDateOfMeeting;

    /**
     * 是否为大会主席
     */
    private String whetherChairmanOfConference;

    /**
     * 报告类型
     */
    private String reportType;

    /**
     * 报告题目
     */
    private String reportName;

    /**
     * 报告日期
     */
    private String reportDate;

    /**
     * 报告人
     */
    private String reporter;

    /**
     * 
     */
    private String lastTime;

    /**
     * 
     */
    private String isDelete;

    /**
     * participation_international_academic_conferences_2_2_5
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
     * 学术会议名称
     * @return academic_conference_name 学术会议名称
     */
    public String getAcademicConferenceName() {
        return academicConferenceName;
    }

    /**
     * 学术会议名称
     * @param academicConferenceName 学术会议名称
     */
    public void setAcademicConferenceName(String academicConferenceName) {
        this.academicConferenceName = academicConferenceName == null ? null : academicConferenceName.trim();
    }

    /**
     * 主办单位
     * @return organizer 主办单位
     */
    public String getOrganizer() {
        return organizer;
    }

    /**
     * 主办单位
     * @param organizer 主办单位
     */
    public void setOrganizer(String organizer) {
        this.organizer = organizer == null ? null : organizer.trim();
    }

    /**
     * 会议举办所在国家/地区
     * @return conference_held_country_or_region 会议举办所在国家/地区
     */
    public String getConferenceHeldCountryOrRegion() {
        return conferenceHeldCountryOrRegion;
    }

    /**
     * 会议举办所在国家/地区
     * @param conferenceHeldCountryOrRegion 会议举办所在国家/地区
     */
    public void setConferenceHeldCountryOrRegion(String conferenceHeldCountryOrRegion) {
        this.conferenceHeldCountryOrRegion = conferenceHeldCountryOrRegion == null ? null : conferenceHeldCountryOrRegion.trim();
    }

    /**
     * 会议举办所在城市
     * @return conference_city 会议举办所在城市
     */
    public String getConferenceCity() {
        return conferenceCity;
    }

    /**
     * 会议举办所在城市
     * @param conferenceCity 会议举办所在城市
     */
    public void setConferenceCity(String conferenceCity) {
        this.conferenceCity = conferenceCity == null ? null : conferenceCity.trim();
    }

    /**
     * 会议开幕日期
     * @return opening_date_of_meeting 会议开幕日期
     */
    public String getOpeningDateOfMeeting() {
        return openingDateOfMeeting;
    }

    /**
     * 会议开幕日期
     * @param openingDateOfMeeting 会议开幕日期
     */
    public void setOpeningDateOfMeeting(String openingDateOfMeeting) {
        this.openingDateOfMeeting = openingDateOfMeeting == null ? null : openingDateOfMeeting.trim();
    }

    /**
     * 是否为大会主席
     * @return whether_chairman_of_conference 是否为大会主席
     */
    public String getWhetherChairmanOfConference() {
        return whetherChairmanOfConference;
    }

    /**
     * 是否为大会主席
     * @param whetherChairmanOfConference 是否为大会主席
     */
    public void setWhetherChairmanOfConference(String whetherChairmanOfConference) {
        this.whetherChairmanOfConference = whetherChairmanOfConference == null ? null : whetherChairmanOfConference.trim();
    }

    /**
     * 报告类型
     * @return report_type 报告类型
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * 报告类型
     * @param reportType 报告类型
     */
    public void setReportType(String reportType) {
        this.reportType = reportType == null ? null : reportType.trim();
    }

    /**
     * 报告题目
     * @return report_name 报告题目
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * 报告题目
     * @param reportName 报告题目
     */
    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    /**
     * 报告日期
     * @return report_date 报告日期
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * 报告日期
     * @param reportDate 报告日期
     */
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    /**
     * 报告人
     * @return reporter 报告人
     */
    public String getReporter() {
        return reporter;
    }

    /**
     * 报告人
     * @param reporter 报告人
     */
    public void setReporter(String reporter) {
        this.reporter = reporter == null ? null : reporter.trim();
    }

    /**
     * 
     * @return last_time 
     */
    public String getLastTime() {
        return lastTime;
    }

    /**
     * 
     * @param lastTime 
     */
    public void setLastTime(String lastTime) {
        this.lastTime = lastTime == null ? null : lastTime.trim();
    }

    /**
     * 
     * @return is_delete 
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 
     * @param isDelete 
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
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
        sb.append(", academicConferenceName=").append(academicConferenceName);
        sb.append(", organizer=").append(organizer);
        sb.append(", conferenceHeldCountryOrRegion=").append(conferenceHeldCountryOrRegion);
        sb.append(", conferenceCity=").append(conferenceCity);
        sb.append(", openingDateOfMeeting=").append(openingDateOfMeeting);
        sb.append(", whetherChairmanOfConference=").append(whetherChairmanOfConference);
        sb.append(", reportType=").append(reportType);
        sb.append(", reportName=").append(reportName);
        sb.append(", reportDate=").append(reportDate);
        sb.append(", reporter=").append(reporter);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}