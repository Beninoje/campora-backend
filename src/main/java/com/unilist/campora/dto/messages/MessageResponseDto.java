package com.unilist.campora.dto.messages;

import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageResponseDto {

    private UUID id;
    private UUID senderId;
    private String senderFirstName;
    private String senderLastName;
    private String content;
    private Instant createdAt;
}
