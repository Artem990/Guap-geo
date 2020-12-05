package ru.muravev.SpringHello.model;

import javax.persistence.*;

@Entity
@Table(name = "dump")
public class Dump {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "station_name")
    private String stationName;
    @Column(name = "date")
    private String date;
    @Column(name = "longitude")
    private double longitude;
    @Column(name = "latitude")
    private double latitude;

    public Dump() {
        super();
    }

    public Dump(String stationName, String date, double longitude, double latitude) {
        super();
        this.stationName = stationName;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
}
