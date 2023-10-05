package com.restapi.restapidynamiccontent;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoPresenterController {

    @Autowired
    VideoRepositoryController videoRepositoryController;

    @RequestMapping(method = RequestMethod.GET, path = "/GetVideos/{videoTopic}")
    public String GetVideos(@PathVariable String videoTopic) {
        switch (videoTopic) {
            case "python":
                return String.format("These are all Python videos");
            case "java":
                return String.format("These are all Java videos");
            default:
                return String.format("Sorry, incorrect input!");
        }
    }

    @RequestMapping(method = RequestMethod.GET, path = "/getAllVideos")
    public List<Videos> getAllVideos() {
        return videoRepositoryController.getAllVideos();
    }

}
