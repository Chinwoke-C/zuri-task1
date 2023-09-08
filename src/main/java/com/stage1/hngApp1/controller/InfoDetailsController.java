package com.stage1.hngApp1.controller;

import com.stage1.hngApp1.data.InfoDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@RestController
@RequestMapping("/api")
public class InfoDetailsController {

    @GetMapping("")
    public ResponseEntity<InfoDetails> getInfoDetails(
            @RequestParam String slackName,
            @RequestParam String track
    ){
        //get current day of the week
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String currentDay = dayOfWeekFormat.format(new Date());

        //get current time in utc
        SimpleDateFormat utcTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String currentTime = utcTimeFormat.format(new Date());

        //Github urls

    }
}
