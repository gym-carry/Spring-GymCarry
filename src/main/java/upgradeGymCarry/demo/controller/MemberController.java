package upgradeGymCarry.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import upgradeGymCarry.demo.service.MemberService;
@RequiredArgsConstructor // final이 붙거나 @NotNull이 붙은 필드 생성자 추가
@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/members/login")
    public String loginForm(){
        return "members/createLoginForm";
    }
}
