package com.xinyu.mwp.entity;


/**
 * Created by qiang_xi on 2016/10/6 13:20.
 * 服务端返回的更新信息实体类
 */

public class CheckUpdateInfoEntity extends BaseEntity{
    private String appName;//app名称
    private float newAppSize;//新app大小
    private int newAppVersionCode;//新app版本号
    private String newAppVersionName;//新app版本名
    private String newAppUpdateDesc;//新app更新描述
    private String newAppReleaseTime;//新app发布时间
    private String newAppUrl;//新app下载地址
    private int isForceUpdate;//是否强制更新(可自行与服务端商议,比如0表示强制更新,1表示非强制更新)

    public CheckUpdateInfoEntity() {
    }

    public CheckUpdateInfoEntity(String appName, float newAppSize, int newAppVersionCode,
                           String newAppVersionName, String newAppUpdateDesc, String newAppReleaseTime,
                           String newAppUrl, int isForceUpdate) {
        this.appName = appName;
        this.newAppSize = newAppSize;
        this.newAppVersionCode = newAppVersionCode;
        this.newAppVersionName = newAppVersionName;
        this.newAppUpdateDesc = newAppUpdateDesc;
        this.newAppReleaseTime = newAppReleaseTime;
        this.newAppUrl = newAppUrl;
        this.isForceUpdate = isForceUpdate;
    }

    public String getAppName() {
        return appName;
    }

    public CheckUpdateInfoEntity setAppName(String appName) {
        this.appName = appName;
        return this;
    }

    public float getNewAppSize() {
        return newAppSize;
    }

    public CheckUpdateInfoEntity setNewAppSize(float newAppSize) {
        this.newAppSize = newAppSize;
        return this;
    }

    public int getNewAppVersionCode() {
        return newAppVersionCode;
    }

    public CheckUpdateInfoEntity setNewAppVersionCode(int newAppVersionCode) {
        this.newAppVersionCode = newAppVersionCode;
        return this;
    }

    public String getNewAppUpdateDesc() {
        return newAppUpdateDesc;
    }

    public CheckUpdateInfoEntity setNewAppUpdateDesc(String newAppUpdateDesc) {
        this.newAppUpdateDesc = newAppUpdateDesc;
        return this;
    }

    public String getNewAppVersionName() {
        return newAppVersionName;
    }

    public CheckUpdateInfoEntity setNewAppVersionName(String newAppVersionName) {
        this.newAppVersionName = newAppVersionName;
        return this;
    }

    public String getNewAppReleaseTime() {
        return newAppReleaseTime;
    }

    public CheckUpdateInfoEntity setNewAppReleaseTime(String newAppReleaseTime) {
        this.newAppReleaseTime = newAppReleaseTime;
        return this;
    }

    public String getNewAppUrl() {
        return newAppUrl;
    }

    public CheckUpdateInfoEntity setNewAppUrl(String newAppUrl) {
        this.newAppUrl = newAppUrl;
        return this;
    }

    public int getIsForceUpdate() {
        return isForceUpdate;
    }

    public CheckUpdateInfoEntity setIsForceUpdate(int isForceUpdate) {
        this.isForceUpdate = isForceUpdate;
        return this;
    }
}
