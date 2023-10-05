package com.restapi.restapidynamiccontent;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatetimePresenterController {

    @RequestMapping(method = RequestMethod.GET, path = "/current/{dateOrTimeOrDatetime}")
    public String getCurrentDateOrDatetime(@PathVariable String dateOrTimeOrDatetime) {
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter datetime = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        switch (dateOrTimeOrDatetime) {
            case "date":
                return date.format(now);
            case "time":
                return time.format(now);
            case "datetime":
                return datetime.format(now);
            default:
                return "Sorry, invalid input type!";
        }
    }
}
