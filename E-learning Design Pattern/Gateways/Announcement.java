package Gateways;

import Messages.DailyNewsEmailMessage;
import Messages.DailyNewsMobileMessage;
import Messages.GradesAnnouncementEmailMessage;
import Messages.GradesAnnouncementMobileMessage;
import Messages.TaskAddedEmailMessage;
import Messages.TaskAddedMobileMessage;

public interface Announcement{
    String prepareMessage(String placeHolders[]);
}

