package hello.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping("/")
  // @ResponseBody
  public String index() {
    return "hello.html";
  }

  @RequestMapping("/name")
  // @ResponseBody
  public String getName() {
    return "hello.html";
  }

  
  @RequestMapping("/update/name")
  // @ResponseBody
  public String updateName() {
    return "hello.html";
  }

}
