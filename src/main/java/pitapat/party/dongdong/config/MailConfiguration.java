package pitapat.party.dongdong.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
@PropertySource("classpath:mail.properties")
public class MailConfiguration {

    Properties pt=new Properties();



}
