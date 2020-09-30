package com.webservice.dto;

import com.webservice.entity.MeettingEntity;

import java.util.List;

public class MeetingResponse {

    private List<MeettingEntity> meettings;

    public List<MeettingEntity> getMeettings() {
        return meettings;
    }

    public void setMeettings(List<MeettingEntity> meettings) {
        this.meettings = meettings;
    }
}
