/*
 * Copyright (c) 2017.版权所有
 */

package configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页控制
 */
@Controller
public class HomeController {
    @RequestMapping({"/"})
    public String index() {

        return "redirect:swagger-ui.html";
    }
}
