package com.stage1.hngApp1.controller;

import com.stage1.hngApp1.data.InfoDetailsResponse;
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
    public ResponseEntity<InfoDetailsResponse> getInfoDetails(
            @RequestParam String slack_name,
            @RequestParam String track
    ){
        //get current day of the week
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String currentDayOfTheWeek = dayOfWeekFormat.format(new Date());

        //get current time in utc
        SimpleDateFormat utcTimeFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        String currentUTCTime = utcTimeFormat.format(new Date());

        //Github urls
        String githubFileUrl = "https://github.com/Chinwoke-C/zuri-task1/blob/main/src/main/java/com/stage1/hngApp1/controller/InfoDetailsController.java";
        String githubRepoUrl = "https://github.com/Chinwoke-C/zuri-task1";

        InfoDetailsResponse response = new InfoDetailsResponse(slack_name,currentDayOfTheWeek,currentUTCTime,track, githubFileUrl, githubRepoUrl);
        return ResponseEntity.ok(response);
    }
}
