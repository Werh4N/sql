package com.example.ol.pojo;

public class Bwlist {
    private int id;
    private int uid;
    private String status;
    private String business;
    private long create_time;
    private long update_time;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setUid(int uid){
        this.uid = uid;
    }
    public int getUid(){
        return uid;
    }

    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }

    public void setBusiness(String business){
        this.business= business;
    }
    public String getBusiness(){
        return business;
    }

    public void setCreate_time(long create_time){
        this.create_time = create_time;
    }
    public long getCreate_time(){
        return create_time;
    }

    public void setUpdate_time(long update_time){
        this.update_time = update_time;
    }
    public long getUpdate_time(){
        return update_time;
    }

}
