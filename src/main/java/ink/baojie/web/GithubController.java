package ink.baojie.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@Slf4j
public class GithubController {

    @PostMapping("/trigger")
    public void githubTrigger(HttpServletRequest request) {
        log.info("github触发器来了");
        System.out.println(request.toString());
    }
}
