package com.noa.exception;
@SuppressWarnings("all")
//�Զ�����쳣��
public class CustomException extends Exception {
	// �쳣��Ϣ
	public String messages;

	public CustomException(String messages) {
		super(messages);
		this.messages = messages;
	}

	public String getMessages() {
		return messages;
	}

	public void setMessages(String messages) {
		this.messages = messages;
	}
}