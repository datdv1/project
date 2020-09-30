package com.webservice.api;

import com.webservice.entity.MeettingEntity;
import com.webservice.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/save-meeting")
public class SaveMeeting {

    @Autowired
    private MeetingService meetingService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public void saveMeeting(@RequestBody MeettingEntity meettingEntity){
        meetingService.save(meettingEntity);
    }
}
