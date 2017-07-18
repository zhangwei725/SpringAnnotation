package com.werner.di.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "T_HOTEL")
public class Hotel {
    private Integer hId;
    private String myName;
    private String address;
    private Boolean atfullflag;
    private int cashback;
    private String commentnum;
    private String commentscore;
    private String desc_;
    private String distance;
    private Boolean freepark;
    private Boolean freewifi;
    private Double gaodelatitude;
    private Double gaodelongitude;
    private int goodrating;
    private String hoteldetailurl;
    private String hotelid;
    private String images;
    private double latitude;
    private double longitude;
    private Boolean mediaflag;
    private String name;
    private String nearby;
    private String placetype;
    private Boolean presellflag;
    private Boolean promotionflag;
    private Boolean recommend;
    private int sellprice;
    private String specialinfo;
    private String stardesc;
    private String starid;
    private List<String> subjectnames;

    public Hotel() {
        this.myName = "何潇";
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HID")
    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public String getMyName() {
        return "何潇";
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean isAtfullflag() {
        return atfullflag;
    }

    public void setAtfullflag(Boolean atfullflag) {
        this.atfullflag = atfullflag;
    }

    public int getCashback() {
        return cashback;
    }

    public void setCashback(int cashback) {
        this.cashback = cashback;
    }

    public String getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(String commentnum) {
        this.commentnum = commentnum;
    }

    public String getCommentscore() {
        return commentscore;
    }

    public void setCommentscore(String commentscore) {
        this.commentscore = commentscore;
    }

    public String getDesc_() {
        return desc_;
    }

    public void setDesc_(String desc) {
        this.desc_ = desc;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public Boolean isFreepark() {
        return freepark;
    }

    public void setFreepark(Boolean freepark) {
        this.freepark = freepark;
    }

    public Boolean isFreewifi() {
        return freewifi;
    }

    public void setFreewifi(Boolean freewifi) {
        this.freewifi = freewifi;
    }

    public double getGaodelatitude() {
        return gaodelatitude;
    }

    public void setGaodelatitude(double gaodelatitude) {
        this.gaodelatitude = gaodelatitude;
    }

    public double getGaodelongitude() {
        return gaodelongitude;
    }

    public void setGaodelongitude(double gaodelongitude) {
        this.gaodelongitude = gaodelongitude;
    }

    public int getGoodrating() {
        return goodrating;
    }

    public void setGoodrating(int goodrating) {
        this.goodrating = goodrating;
    }

    public String getHoteldetailurl() {
        return hoteldetailurl;
    }

    public void setHoteldetailurl(String hoteldetailurl) {
        this.hoteldetailurl = hoteldetailurl;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public Boolean isMediaflag() {
        return mediaflag;
    }

    public void setMediaflag(Boolean mediaflag) {
        this.mediaflag = mediaflag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNearby() {
        return nearby;
    }

    public void setNearby(String nearby) {
        this.nearby = nearby;
    }

    public String getPlacetype() {
        return placetype;
    }

    public void setPlacetype(String placetype) {
        this.placetype = placetype;
    }

    public Boolean isPresellflag() {
        return presellflag;
    }

    public void setPresellflag(Boolean presellflag) {
        this.presellflag = presellflag;
    }

    public Boolean isPromotionflag() {
        return promotionflag;
    }

    public void setPromotionflag(Boolean promotionflag) {
        this.promotionflag = promotionflag;
    }

    public Boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public int getSellprice() {
        return sellprice;
    }

    public void setSellprice(int sellprice) {
        this.sellprice = sellprice;
    }

    public String getSpecialinfo() {
        return specialinfo;
    }

    public void setSpecialinfo(String specialinfo) {
        this.specialinfo = specialinfo;
    }

    public String getStardesc() {
        return stardesc;
    }

    public void setStardesc(String stardesc) {
        this.stardesc = stardesc;
    }

    public String getStarid() {
        return starid;
    }

    public void setStarid(String starid) {
        this.starid = starid;
    }

    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "SUBJECT_NAMES", joinColumns = @JoinColumn(name = "HID"))
    @Column(name = "SUBJECT_NAME")
    public List<String> getSubjectnames() {
        return subjectnames;
    }

    public void setSubjectnames(List<String> subjectnames) {
        this.subjectnames = subjectnames;
    }
}