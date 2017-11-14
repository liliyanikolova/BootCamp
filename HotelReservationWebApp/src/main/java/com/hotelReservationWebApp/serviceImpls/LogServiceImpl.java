package com.hotelReservationWebApp.serviceImpls;

import com.hotelReservationWebApp.dtos.LogDto;
import com.hotelReservationWebApp.entities.Log;
import com.hotelReservationWebApp.repositories.LogRepository;
import com.hotelReservationWebApp.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    private LogRepository logRepository;

    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public void create(LogDto logDto) {
        Log log = new Log();
        log.setMessage(logDto.getMessage());
        log.setDate(logDto.getDate());

        this.logRepository.save(log);
    }
}
