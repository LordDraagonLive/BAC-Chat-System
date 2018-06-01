package com.bac.datasource;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T05:37:16")
@StaticMetamodel(ChatMessage.class)
public class ChatMessage_ { 

    public static volatile SingularAttribute<ChatMessage, Integer> threadId;
    public static volatile SingularAttribute<ChatMessage, String> creatorId;
    public static volatile SingularAttribute<ChatMessage, Integer> messageId;
    public static volatile SingularAttribute<ChatMessage, Date> createdatetime;
    public static volatile SingularAttribute<ChatMessage, String> message;

}