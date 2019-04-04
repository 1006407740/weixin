package org.fkjava.weixin.domain.event;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.fkjava.weixin.domain.InMessage;

@XmlRootElement(name = "xml")
@XmlAccessorType(XmlAccessType.FIELD)
public class EventInMessage extends InMessage{

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventkey() {
		return eventkey;
	}

	public void setEventkey(String eventkey) {
		this.eventkey = eventkey;
	}

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "Event")
	private String event;
	@XmlElement(name = "Eventkey")
	private String eventkey;
	
	public EventInMessage() {
		super("event");
	}
}
