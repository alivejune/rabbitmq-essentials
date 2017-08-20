package rmqess.ch02.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class Message implements Serializable {
    private static final long serialVersionUID = 3944006083135142237L;
    private String topic;
    private Long userId;
    private Long addresseeUserId;
    private String subject;
    private String content;
    private Long timeSent;

    public Message withSenderId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Message withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public Message withAddresseeId(long addresseeUserId) {
        this.addresseeUserId = addresseeUserId;
        return this;
    }

    public Message withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    public Message withContent(String content) {
        this.content = content;
        return this;
    }

    public Message withTimeSent(long timeSent) {
        this.timeSent = timeSent;
        return this;
    }


}
