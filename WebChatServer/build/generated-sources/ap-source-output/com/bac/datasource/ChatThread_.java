package com.bac.datasource;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-04-23T05:37:16")
@StaticMetamodel(ChatThread.class)
public class ChatThread_ { 

    public static volatile SingularAttribute<ChatThread, Integer> threadId;
    public static volatile SingularAttribute<ChatThread, String> threadTitle;
    public static volatile SingularAttribute<ChatThread, String> creatorId;
    public static volatile SingularAttribute<ChatThread, Date> lasteditTime;

}