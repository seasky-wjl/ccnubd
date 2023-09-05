package com.ccnu.pojo.vo;

/**
 * @program: ccnu-bd
 * @description: 表225前端展示数据
 * @author: lsc
 * @create: 2021-10-21 22:55
 **/
public class ParticipationInternationalAcademicConferences225Vo {

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

    public String getAcademicConferenceName() {
        return academicConferenceName;
    }

    public void setAcademicConferenceName(String academicConferenceName) {
        this.academicConferenceName = academicConferenceName;
    }

    public String getOrganizer() {
        return organizer;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public String getConferenceHeldCountryOrRegion() {
        return conferenceHeldCountryOrRegion;
    }

    public void setConferenceHeldCountryOrRegion(String conferenceHeldCountryOrRegion) {
        this.conferenceHeldCountryOrRegion = conferenceHeldCountryOrRegion;
    }

    public String getConferenceCity() {
        return conferenceCity;
    }

    public void setConferenceCity(String conferenceCity) {
        this.conferenceCity = conferenceCity;
    }

    public String getOpeningDateOfMeeting() {
        return openingDateOfMeeting;
    }

    public void setOpeningDateOfMeeting(String openingDateOfMeeting) {
        this.openingDateOfMeeting = openingDateOfMeeting;
    }

    public String getWhetherChairmanOfConference() {
        return whetherChairmanOfConference;
    }

    public void setWhetherChairmanOfConference(String whetherChairmanOfConference) {
        this.whetherChairmanOfConference = whetherChairmanOfConference;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
