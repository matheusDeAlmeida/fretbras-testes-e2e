package fretbras.android.data;

public class DeviceCapabilities {
    private String deviceName;
    private String platformName;
    private String platformVersion;

    public DeviceCapabilities(String deviceName, String platformName, String platformVersion) {
        this.deviceName = deviceName;
        this.platformName = platformName;
        this. platformVersion = platformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public String getPlatformVersion() {
        return platformVersion;
    }
}