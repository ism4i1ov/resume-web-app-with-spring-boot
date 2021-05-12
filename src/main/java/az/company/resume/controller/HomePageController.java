package az.company.resume.controller;

import az.company.resume.dto.request.UserDto;
import az.company.resume.service.HomePageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomePageController {

    private final HomePageService homePageService;

    public HomePageController(HomePageService homePageService) {
        this.homePageService = homePageService;
    }

    @GetMapping
    public String getInfoUser(Model model) {
        UserDto user = homePageService.getUser();
        model.addAttribute("user", user);
        return "index";
    }
}
