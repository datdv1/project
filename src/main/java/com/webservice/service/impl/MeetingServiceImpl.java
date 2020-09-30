package com.webservice.service.impl;

import com.webservice.entity.MeettingEntity;
import com.webservice.repository.MeetingRepository;
import com.webservice.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeetingServiceImpl implements MeetingService {

    @Autowired
    private MeetingRepository meetingRepository;

    @Override
    public void save(MeettingEntity meettingEntity) {
        meetingRepository.save(meettingEntity);
    }

    @Override
    public List<MeettingEntity> getAll() {
        return meetingRepository.findAll();
    }
}
