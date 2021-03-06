package com.qcloud.cos.region;

public class Region {
    private String regionName;
    private String displayName;

    public Region(String region_name) {
        this(region_name, region_name);
    }
    
    public Region(String region_name, String displayName) {
        this.regionName = region_name;
        this.displayName = displayName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
