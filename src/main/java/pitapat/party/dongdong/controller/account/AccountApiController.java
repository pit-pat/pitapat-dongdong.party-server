package pitapat.party.dongdong.controller.account;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import pitapat.party.dongdong.service.account.MailService;


@RequiredArgsConstructor
@RestController
public class AccountApiController {

    private final MailService mailService;

    @ApiOperation(value = "이메일 인증 API")
    @PostMapping("/api/v1/mail-auth")
    public void sendMail() {
        mailService.sendMail("제목", "내용", "contactdongdong@gmail.com", "khjvvv7@gmail.com");
    }

}
