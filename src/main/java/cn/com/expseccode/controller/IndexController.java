package cn.com.expseccode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

    private static final String INDEX_PAGE = "123";

    /**
     * 首页跳转测试
     *
     * @param model
     * @return
     */
    @GetMapping(value = "/index")
    public String index(Model model, @RequestParam String name) {
        model.addAttribute("jsp", "Hello Jsp!");
        model.addAttribute("name", name);
        return INDEX_PAGE;
    }
}
