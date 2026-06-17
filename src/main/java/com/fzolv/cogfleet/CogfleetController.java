package com.fzolv.cogfleet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RefreshScope
public class CogfleetController {

    @Value("${liti.man.gonzael:}")
    String sdhd;

    @RequestMapping(path="/scot", method=RequestMethod.GET)
    public String requestMethodName() {
        return "Consule fetch:" + sdhd;
    }
    
}
