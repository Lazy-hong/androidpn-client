package org.androidpn.client;

import org.jivesoftware.smack.packet.IQ;

public class DeliverConfirmIQ extends IQ {
String uuid;
	public String getUuid() {
	return uuid;
}
public void setUuid(String uuid) {
	this.uuid = uuid;
}
	@Override
	public String getChildElementXML() {
		  StringBuilder buf = new StringBuilder();
	        buf.append("<").append("delivercomfirm").append(" xmlns=\"").append(
	                "androidpn:iq:delivercomfirm").append("\">");
	        if (uuid != null) {
	            buf.append("<uuid>").append(uuid).append("</uuid>");
	        }
	        buf.append("</").append("delivercomfirm").append("> ");
	        return buf.toString();
	}

}
