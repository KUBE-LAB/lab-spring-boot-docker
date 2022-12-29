package hello.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
  /** 루트 호출시 초기화면 로딩  *
   * 
   * @return
  */
  @RequestMapping("/")
  // @ResponseBody
  public String index() {
    return "hello.html";
  }
  
/**
 * 메서드명 : 회원이름 조회하기
 * @return
 */
  @RequestMapping("/name")
  // @ResponseBody
  public String getName() {
    return "hello.html";
  }
  
  /** 메서드명: 회원성명 수정함수 **
   * 
   * @return
  */
  @RequestMapping("/update/name")
  // @ResponseBody
  public String updateName() {
    return "hello.html";
  }

 /** 메서드명: 회원성명 입력함수 **
   * 
   * @return
  */
  @RequestMapping("/input/name")
  // @ResponseBody
  public String inputName() {
    return "hello.html";
  }


}
