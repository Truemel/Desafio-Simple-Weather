package com.example.desafio_simple_weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.desafio_simple_weather.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binder;
    private DailyWeather weather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binder = DataBindingUtil.setContentView(this, R.layout.activity_main);
        init();
    }

    public void init(){
        weather = new DailyWeather("Santiago", "4 de Agosto", 125.2f, "C");
        binder.city.setText(weather.getCity());
        binder.date.setText(weather.getDate());
        binder.clima.setImageResource(R.drawable.ic_sun_yellow_24dp);
        binder.temp.setText(weather.getTemp());
        binder.medUnit.setText(weather.getMedUnit());
    }
}
