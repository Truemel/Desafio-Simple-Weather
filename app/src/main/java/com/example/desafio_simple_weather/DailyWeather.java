package com.example.desafio_simple_weather;

public class DailyWeather {

    private String city, date, temp, medUnit;

    public DailyWeather(String city, String date, float temp, String medUnit){
        this.city = city;
        this.date = date;
        this.temp = temp+"°";
        this.medUnit = medUnit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp+"°";
    }

    public String getMedUnit() {
        return medUnit;
    }

    public void setMedUnit(String medUnit) {
        this.medUnit = medUnit;
    }
}
