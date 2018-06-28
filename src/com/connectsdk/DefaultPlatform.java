package com.connectsdk;

import java.util.HashMap;

public class DefaultPlatform {
    public DefaultPlatform() {
    }

    public static HashMap<String, String> getDeviceServiceMap() { 
        HashMap<String, String> devicesList = new HashMap<String, String>();
        devicesList.put("com.connectsdk.service.CastService", "com.connectsdk.discovery.provider.CastDiscoveryProvider");
        return devicesList;
    }
}
