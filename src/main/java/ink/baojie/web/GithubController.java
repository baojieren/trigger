package ink.baojie.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class GithubController {

    @PostMapping("/trigger")
    public void githubTrigger() {
        log.info("Github触发器来了");
        String shellPath = "/baojie/gitbook/gitbook.sh";
        try {
            int result = Runtime.getRuntime().exec(shellPath).waitFor();
            // BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            // StringBuilder sb = new StringBuilder();
            // String line;
            // while ((line = br.readLine()) != null) {
            //     sb.append(line).append("\n");
            // }
            // log.info("脚本执行日志:{}", sb.toString());
            log.info("执行脚本结果:{}", result);
        } catch (Exception e) {
            log.error("执行脚本出错");
            e.printStackTrace();
        }
    }
}
