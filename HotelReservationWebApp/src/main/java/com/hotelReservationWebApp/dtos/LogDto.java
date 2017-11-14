package com.hotelReservationWebApp.dtos;

import java.time.LocalDate;

public class LogDto {

    private String message;

    private LocalDate date;

    public LogDto() {
    }

    public LogDto(String message) {
        this.message = message;
        this.date = LocalDate.now();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
