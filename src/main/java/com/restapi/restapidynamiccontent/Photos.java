package com.restapi.restapidynamiccontent;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Photos {

    @Id
    @GeneratedValue
    private long pid;
    private String photolink;
    private String description;

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getPhotolink() {
        return photolink;
    }

    public void setPhotolink(String photolink) {
        this.photolink = photolink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Photos{" +
               "pid=" + pid +
               ", photolink='" + photolink + '\'' +
               ", description='" + description + '\'' +
               '}';
    }
}
