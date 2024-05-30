package com.email.SpringBootMail.domain;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmailDTO {
    private String[] toUser;
    private String subject;
    private String message;
}
