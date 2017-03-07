package photoAlbum.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chen7 on 2017/3/7.
 */
//@Controller
public class SelfErrorController implements ErrorController {
    private static final String ERROR_PATH = "/error";

    @RequestMapping(value = ERROR_PATH)
    public String handleError() {
        return "static/404.html";
    }

    public String getErrorPath() {
        // TODO Auto-generated method stub
        return ERROR_PATH;
    }

}
