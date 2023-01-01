package hello.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MemberController {
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
  @RequestMapping("/member")
  // @ResponseBody
  public String getMemberName() {
    return "hello.html";
  }
  


}
