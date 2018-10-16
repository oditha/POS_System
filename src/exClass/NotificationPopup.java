
package exClass;

import com.alee.extended.panel.GroupPanel;
import com.alee.extended.time.ClockType;
import com.alee.extended.time.WebClock;
import com.alee.managers.notification.NotificationIcon;
import com.alee.managers.notification.NotificationManager;
import com.alee.managers.notification.WebNotification;


public class NotificationPopup {
    
    
    public static void save(){
    
         final WebNotification notificationPopup = new WebNotification ();
                notificationPopup.setIcon ( NotificationIcon.clock );
                notificationPopup.setDisplayTime ( 2000 );

                final WebClock clock = new WebClock ();
                clock.setClockType ( ClockType.timer );
                clock.setTimeLeft ( 3000 );
                clock.setTimePattern ( "'Sucessfully Saved'" );
                notificationPopup.setContent ( new GroupPanel ( clock ) );

                NotificationManager.showNotification ( notificationPopup );
                clock.start ();
    
    
    }
     public static void fillFeilds(){
    
         final WebNotification notificationPopup = new WebNotification ();
                notificationPopup.setIcon ( NotificationIcon.clock );
                notificationPopup.setDisplayTime ( 2000 );

                final WebClock clock = new WebClock ();
                clock.setClockType ( ClockType.timer );
                clock.setTimeLeft ( 3000 );
                clock.setTimePattern ( "'Fill all feilds'" );
                notificationPopup.setContent ( new GroupPanel ( clock ) );

                NotificationManager.showNotification ( notificationPopup );
                clock.start ();
    
    
    }
     
     public static void Delete(){
    
         final WebNotification notificationPopup = new WebNotification ();
                notificationPopup.setIcon ( NotificationIcon.clock );
                notificationPopup.setDisplayTime ( 2000 );

                final WebClock clock = new WebClock ();
                clock.setClockType ( ClockType.timer );
                clock.setTimeLeft ( 3000 );
                clock.setTimePattern ( "'Sucessfully Deleted'" );
                notificationPopup.setContent ( new GroupPanel ( clock ) );

                NotificationManager.showNotification ( notificationPopup );
                clock.start ();
    
    
    }
    
     public static void already(){
    
         final WebNotification notificationPopup = new WebNotification ();
                notificationPopup.setIcon ( NotificationIcon.clock );
                notificationPopup.setDisplayTime ( 2000 );

                final WebClock clock = new WebClock ();
                clock.setClockType ( ClockType.timer );
                clock.setTimeLeft ( 3000 );
                clock.setTimePattern ( "'Sucessfully Deleted'" );
                notificationPopup.setContent ( new GroupPanel ( clock ) );

                NotificationManager.showNotification ( notificationPopup );
                clock.start ();
    
    
    }
    
}
