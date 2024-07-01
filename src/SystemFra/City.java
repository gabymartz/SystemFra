package SystemFra;

public class City {
    private String cityId;
    private String cityName;

    public City(String cityId, String cityName) {
        this.cityId = cityId;
        this.cityName = cityName;
    }

    // Getters and Setters
    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}

