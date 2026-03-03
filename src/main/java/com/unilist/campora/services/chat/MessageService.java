package com.unilist.campora.services.chat;

import com.unilist.campora.dto.messages.MessageResponseDto;
import com.unilist.campora.model.Chat;
import com.unilist.campora.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MessageService {
    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<MessageResponseDto> getAllMessagesByChat(Chat chat){
        return chat.getMessages().stream()
                .map(msg -> MessageResponseDto.builder()
                        .id(msg.getId())
                        .senderId(msg.getSender().getId())
                        .senderFirstName(msg.getSender().getFirstName())
                        .senderLastName(msg.getSender().getLastName())
                        .content(msg.getContent())
                        .createdAt(msg.getCreatedAt())
                        .build()
                ).toList();
    }
}
