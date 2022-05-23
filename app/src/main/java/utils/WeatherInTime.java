package utils;

public class WeatherInTime {
    private String time;
    private float percentRainDown;
    private float term;
    private float precipitation;
    private float windChill;
    private float cloudCoverPercent;
    private String moonPhases;
    private float windSpeed;
    private float humidityPercent;
    private int dewPoint;
    private int pressure;
    private int ultraVioletIndex;
    private String windDir;

    public WeatherInTime() {
    }

    public WeatherInTime(String time, float percentRainDown, float term, float precipitation, float windChill, float cloudCoverPercent, String moonPhases, float windSpeed, float humidityPercent, int dewPoint, int pressure, int ultraVioletIndex, String windDir) {
        this.time = time;
        this.percentRainDown = percentRainDown;
        this.term = term;
        this.precipitation = precipitation;
        this.windChill = windChill;
        this.cloudCoverPercent = cloudCoverPercent;
        this.moonPhases = moonPhases;
        this.windSpeed = windSpeed;
        this.humidityPercent = humidityPercent;
        this.dewPoint = dewPoint;
        this.pressure = pressure;
        this.ultraVioletIndex = ultraVioletIndex;
        this.windDir = windDir;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public float getPercentRainDown() {
        return percentRainDown;
    }

    public void setPercentRainDown(float percentRainDown) {
        this.percentRainDown = percentRainDown;
    }

    public float getTerm() {
        return term;
    }

    public void setTerm(float term) {
        this.term = term;
    }

    public float getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(float precipitation) {
        this.precipitation = precipitation;
    }

    public float getWindChill() {
        return windChill;
    }

    public void setWindChill(float windChill) {
        this.windChill = windChill;
    }

    public float getCloudCoverPercent() {
        return cloudCoverPercent;
    }

    public void setCloudCoverPercent(float cloudCoverPercent) {
        this.cloudCoverPercent = cloudCoverPercent;
    }

    public String getMoonPhases() {
        return moonPhases;
    }

    public void setMoonPhases(String moonPhases) {
        this.moonPhases = moonPhases;
    }

    public float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public float getHumidityPercent() {
        return humidityPercent;
    }

    public void setHumidityPercent(float humidityPercent) {
        this.humidityPercent = humidityPercent;
    }

    public int getDewPoint() {
        return dewPoint;
    }

    public void setDewPoint(int dewPoint) {
        this.dewPoint = dewPoint;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getUltraVioletIndex() {
        return ultraVioletIndex;
    }

    public void setUltraVioletIndex(int ultraVioletIndex) {
        this.ultraVioletIndex = ultraVioletIndex;
    }

    public String getWindDir() {
        return windDir;
    }

    public void setWindDir(String windDir) {
        this.windDir = windDir;
    }

    @Override
    public String toString() {
        return "WeatherInTime{" +
                "precipitation=" + precipitation +
                ", windChill=" + windChill +
                ", cloudCoverPercent=" + cloudCoverPercent +
                ", moonPhases='" + moonPhases + '\'' +
                ", windSpeed=" + windSpeed +
                ", humidityPercent=" + humidityPercent +
                ", dewPoint=" + dewPoint +
                ", pressure=" + pressure +
                ", ultraVioletIndex=" + ultraVioletIndex +
                ", windDir='" + windDir + '\'' +
                '}';
    }
}
