
package com.bac.chatservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bac.chatservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateMessageResponse_QNAME = new QName("http://services.bac.com/", "createMessageResponse");
    private final static QName _FindDuplicateThreads_QNAME = new QName("http://services.bac.com/", "findDuplicateThreads");
    private final static QName _ChatsInThread_QNAME = new QName("http://services.bac.com/", "chatsInThread");
    private final static QName _CreateThreadResponse_QNAME = new QName("http://services.bac.com/", "createThreadResponse");
    private final static QName _ChatMessage_QNAME = new QName("http://services.bac.com/", "chatMessage");
    private final static QName _UpdateChatThreadResponse_QNAME = new QName("http://services.bac.com/", "updateChatThreadResponse");
    private final static QName _CreateThread_QNAME = new QName("http://services.bac.com/", "createThread");
    private final static QName _UpdateChatThread_QNAME = new QName("http://services.bac.com/", "updateChatThread");
    private final static QName _ChatsInThreadResponse_QNAME = new QName("http://services.bac.com/", "chatsInThreadResponse");
    private final static QName _FindDuplicateThreadsResponse_QNAME = new QName("http://services.bac.com/", "findDuplicateThreadsResponse");
    private final static QName _ChatThreadList_QNAME = new QName("http://services.bac.com/", "chatThreadList");
    private final static QName _ChatThread_QNAME = new QName("http://services.bac.com/", "chatThread");
    private final static QName _ChatThreadListResponse_QNAME = new QName("http://services.bac.com/", "chatThreadListResponse");
    private final static QName _CreateMessage_QNAME = new QName("http://services.bac.com/", "createMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bac.chatservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChatsInThread }
     * 
     */
    public ChatsInThread createChatsInThread() {
        return new ChatsInThread();
    }

    /**
     * Create an instance of {@link CreateThreadResponse }
     * 
     */
    public CreateThreadResponse createCreateThreadResponse() {
        return new CreateThreadResponse();
    }

    /**
     * Create an instance of {@link CreateMessageResponse }
     * 
     */
    public CreateMessageResponse createCreateMessageResponse() {
        return new CreateMessageResponse();
    }

    /**
     * Create an instance of {@link FindDuplicateThreads }
     * 
     */
    public FindDuplicateThreads createFindDuplicateThreads() {
        return new FindDuplicateThreads();
    }

    /**
     * Create an instance of {@link ChatMessage }
     * 
     */
    public ChatMessage createChatMessage() {
        return new ChatMessage();
    }

    /**
     * Create an instance of {@link UpdateChatThreadResponse }
     * 
     */
    public UpdateChatThreadResponse createUpdateChatThreadResponse() {
        return new UpdateChatThreadResponse();
    }

    /**
     * Create an instance of {@link UpdateChatThread }
     * 
     */
    public UpdateChatThread createUpdateChatThread() {
        return new UpdateChatThread();
    }

    /**
     * Create an instance of {@link CreateThread }
     * 
     */
    public CreateThread createCreateThread() {
        return new CreateThread();
    }

    /**
     * Create an instance of {@link CreateMessage }
     * 
     */
    public CreateMessage createCreateMessage() {
        return new CreateMessage();
    }

    /**
     * Create an instance of {@link ChatThreadListResponse }
     * 
     */
    public ChatThreadListResponse createChatThreadListResponse() {
        return new ChatThreadListResponse();
    }

    /**
     * Create an instance of {@link ChatThread }
     * 
     */
    public ChatThread createChatThread() {
        return new ChatThread();
    }

    /**
     * Create an instance of {@link ChatThreadList }
     * 
     */
    public ChatThreadList createChatThreadList() {
        return new ChatThreadList();
    }

    /**
     * Create an instance of {@link ChatsInThreadResponse }
     * 
     */
    public ChatsInThreadResponse createChatsInThreadResponse() {
        return new ChatsInThreadResponse();
    }

    /**
     * Create an instance of {@link FindDuplicateThreadsResponse }
     * 
     */
    public FindDuplicateThreadsResponse createFindDuplicateThreadsResponse() {
        return new FindDuplicateThreadsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "createMessageResponse")
    public JAXBElement<CreateMessageResponse> createCreateMessageResponse(CreateMessageResponse value) {
        return new JAXBElement<CreateMessageResponse>(_CreateMessageResponse_QNAME, CreateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDuplicateThreads }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "findDuplicateThreads")
    public JAXBElement<FindDuplicateThreads> createFindDuplicateThreads(FindDuplicateThreads value) {
        return new JAXBElement<FindDuplicateThreads>(_FindDuplicateThreads_QNAME, FindDuplicateThreads.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChatsInThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "chatsInThread")
    public JAXBElement<ChatsInThread> createChatsInThread(ChatsInThread value) {
        return new JAXBElement<ChatsInThread>(_ChatsInThread_QNAME, ChatsInThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "createThreadResponse")
    public JAXBElement<CreateThreadResponse> createCreateThreadResponse(CreateThreadResponse value) {
        return new JAXBElement<CreateThreadResponse>(_CreateThreadResponse_QNAME, CreateThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChatMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "chatMessage")
    public JAXBElement<ChatMessage> createChatMessage(ChatMessage value) {
        return new JAXBElement<ChatMessage>(_ChatMessage_QNAME, ChatMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateChatThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "updateChatThreadResponse")
    public JAXBElement<UpdateChatThreadResponse> createUpdateChatThreadResponse(UpdateChatThreadResponse value) {
        return new JAXBElement<UpdateChatThreadResponse>(_UpdateChatThreadResponse_QNAME, UpdateChatThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "createThread")
    public JAXBElement<CreateThread> createCreateThread(CreateThread value) {
        return new JAXBElement<CreateThread>(_CreateThread_QNAME, CreateThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateChatThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "updateChatThread")
    public JAXBElement<UpdateChatThread> createUpdateChatThread(UpdateChatThread value) {
        return new JAXBElement<UpdateChatThread>(_UpdateChatThread_QNAME, UpdateChatThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChatsInThreadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "chatsInThreadResponse")
    public JAXBElement<ChatsInThreadResponse> createChatsInThreadResponse(ChatsInThreadResponse value) {
        return new JAXBElement<ChatsInThreadResponse>(_ChatsInThreadResponse_QNAME, ChatsInThreadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDuplicateThreadsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "findDuplicateThreadsResponse")
    public JAXBElement<FindDuplicateThreadsResponse> createFindDuplicateThreadsResponse(FindDuplicateThreadsResponse value) {
        return new JAXBElement<FindDuplicateThreadsResponse>(_FindDuplicateThreadsResponse_QNAME, FindDuplicateThreadsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChatThreadList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "chatThreadList")
    public JAXBElement<ChatThreadList> createChatThreadList(ChatThreadList value) {
        return new JAXBElement<ChatThreadList>(_ChatThreadList_QNAME, ChatThreadList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChatThread }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "chatThread")
    public JAXBElement<ChatThread> createChatThread(ChatThread value) {
        return new JAXBElement<ChatThread>(_ChatThread_QNAME, ChatThread.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChatThreadListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "chatThreadListResponse")
    public JAXBElement<ChatThreadListResponse> createChatThreadListResponse(ChatThreadListResponse value) {
        return new JAXBElement<ChatThreadListResponse>(_ChatThreadListResponse_QNAME, ChatThreadListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bac.com/", name = "createMessage")
    public JAXBElement<CreateMessage> createCreateMessage(CreateMessage value) {
        return new JAXBElement<CreateMessage>(_CreateMessage_QNAME, CreateMessage.class, null, value);
    }

}
