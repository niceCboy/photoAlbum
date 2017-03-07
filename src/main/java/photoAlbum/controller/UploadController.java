package photoAlbum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by chen7 on 2017/3/7.
 */
@Controller
public class UploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    String upload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) {
        System.out.println(name);
        System.out.println(file);
        return "Hello World!";
    }
}
