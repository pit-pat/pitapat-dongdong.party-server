package pitapat.party.dongdong.service.account;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;


@RequiredArgsConstructor
@Service
public class MailService {

    private final JavaMailSender mailSender;

    public void sendMail(String to){
        MimeMessage message = mailSender.createMimeMessage();
        String subject = "제목";
        String text = "<button>버튼</button>";
        String from = "contactdongdong@gmail.com";

        try {
            MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");
            messageHelper.setSubject(subject);
            messageHelper.setText(text, true);
            messageHelper.setFrom(from);
            messageHelper.setTo(to);

            mailSender.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
