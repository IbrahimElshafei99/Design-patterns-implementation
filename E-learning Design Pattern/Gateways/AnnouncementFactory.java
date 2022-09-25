package Gateways;

import Messages.*;

public class AnnouncementFactory {
    public Announcement getMessage(String type) {
        if (type == null || type.isEmpty())
            return null;
        switch (type) {
            case "DailyNewsEmailMessage":
                return new DailyNewsEmailMessage();
            case "DailyNewsMobileMessage":
                return new DailyNewsMobileMessage();
            case "GradesAnnouncementEmailMessage":
                return new GradesAnnouncementEmailMessage();
            case "GradesAnnouncementMobileMessage":
                return new GradesAnnouncementMobileMessage();
            case "TaskAddedEmailMessage":
                return new TaskAddedEmailMessage();
            case "TaskAddedMobileMessage":
                return new TaskAddedMobileMessage();
            default:
                throw new IllegalArgumentException("Unknown channel " + type);
        }
    }


}
