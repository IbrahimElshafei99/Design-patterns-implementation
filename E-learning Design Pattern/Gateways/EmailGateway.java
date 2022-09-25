package Gateways;

import Messages.DailyNewsEmailMessage;
import Messages.GradesAnnouncementEmailMessage;
import Messages.TaskAddedEmailMessage;

public class EmailGateway {
	//****
	public void sendMessage(Object message, String user) {
		String[] placeHolders = new String[] {}; // set some place holders here

		if(message instanceof DailyNewsEmailMessage) {
			AnnouncementFactory factoryAnnounce =new AnnouncementFactory();
			Announcement announcement = factoryAnnounce.getMessage("DailyNewsEmailMessage");
			announcement.prepareMessage(placeHolders);
			/*
			DailyNewsEmailMessage dailyNewsEmailMessage = (DailyNewsEmailMessage) message;
			//****
			dailyNewsEmailMessage.prepareMessage(placeHolders);
			 */
			
			// some code to send message
		}
		
		else if(message instanceof GradesAnnouncementEmailMessage) {
			AnnouncementFactory factoryAnnounce =new AnnouncementFactory();
			Announcement announcement = factoryAnnounce.getMessage("GradesAnnouncementEmailMessage");
			announcement.prepareMessage(placeHolders);
			/*
			GradesAnnouncementEmailMessage announcementEmailMessage = (GradesAnnouncementEmailMessage) message;
			announcementEmailMessage.prepareMessage(placeHolders);
			// some code to send message
			 */
		}
		
		else if(message instanceof TaskAddedEmailMessage) {
			AnnouncementFactory factoryAnnounce =new AnnouncementFactory();
			Announcement announcement = factoryAnnounce.getMessage("TaskAddedEmailMessage");
			announcement.prepareMessage(placeHolders);
			/*
			TaskAddedEmailMessage addedEmailMessage = (TaskAddedEmailMessage) message;
			addedEmailMessage.prepareMessage(placeHolders);
			// some code to send message by email to user
			 */
		}
		
	}

}
