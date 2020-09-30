package com.webservice.service;

import com.webservice.entity.MeettingEntity;

import java.util.List;

public interface MeetingService {
    void save(MeettingEntity meettingEntity);
    List<MeettingEntity> getAll();
}
