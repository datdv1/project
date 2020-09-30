package com.webservice.api;

import com.webservice.dto.MeetingResponse;
import com.webservice.service.MeetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get-all-meeting")
public class MeetingAPI {

    @Autowired
    private MeetingService meetingService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public MeetingResponse getAllMeeting(){
        MeetingResponse response = new MeetingResponse();
        response.setMeettings(meetingService.getAll());
        return response;
    }
}
