package com.stage1.hngApp1.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class InfoDetails {
    private String slackName;
    private String currentDayOfTheWeek;
    private String currentUTCTime;
    private String track;
    private String githubFileUrl;
    private String githubRepoUrl;
    private final int status = 200;
}
