package Gateways;

import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAddedMobileMessage;

public class SMSGateway {
	
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here 
		
		if(message instanceof DailyNewsMobileMessage) {
			AnnouncementFactory factoryAnnounce =new AnnouncementFactory();
			Announcement announcement = factoryAnnounce.getMessage("DailyNewsMobileMessage");
			announcement.prepareMessage(placeHolders);
			/*
			DailyNewsMobileMessage msg = (DailyNewsMobileMessage) message;
			msg.prepareMessage(placeHolders);
			// some code to send message
			 */
		}
		
		else if(message instanceof GradesAnnouncementMobileMessage) {
			AnnouncementFactory factoryAnnounce =new AnnouncementFactory();
			Announcement announcement = factoryAnnounce.getMessage("GradesAnnouncementMobileMessage");
			announcement.prepareMessage(placeHolders);
			/*
			GradesAnnouncementMobileMessage msg = (GradesAnnouncementMobileMessage) message;
			msg.prepareMessage(placeHolders);
			// some code to send message
			*/
		}
		
		else if(message instanceof TaskAddedMobileMessage) {
			AnnouncementFactory factoryAnnounce =new AnnouncementFactory();
			Announcement announcement = factoryAnnounce.getMessage("TaskAddedMobileMessage");
			announcement.prepareMessage(placeHolders);
			/*
			TaskAddedMobileMessage msg = (TaskAddedMobileMessage) message;
			msg.prepareMessage(placeHolders);
			// some code to send message to user
			 */
		}
		
	}
}
