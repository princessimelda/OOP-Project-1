
package rmi;

import java.io.File;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import notificationsystem.Event;
import notificationsystem.Notification;
import notificationsystem.PublisherService;
import notificationsystem.ReminderPreferences;

public interface StudentDbInterface extends Remote {
        public String registerStudent(String studentID, String studentFname, String studentSurname, String studentEmail, String password, String confirmPassword) throws RemoteException;
        public String loginStudent(String studentID, String password) throws RemoteException;
        public String[] getStudentNameById(String studentId) throws RemoteException;
        public String getProfilePicturePath(String studentId) throws RemoteException;
        public Map<Integer, List<String>> getTasksForMonth(int month, int year, String studentId) throws RemoteException;
        public int insertTask(String studentId, String title, String description, Timestamp deadline, String status) throws RemoteException;
        public boolean deleteTasks(String studentId, List<String> titles) throws RemoteException;
        public List<Map<String, Object>> getAllTasks(String studentId) throws RemoteException;
        public Map<String,Object> getPriorityTask(String studentId) throws RemoteException;
        public boolean markTasksAsCompleted(String studentId, List<String>taskTitles) throws RemoteException;
        public void updateTaskDay(String title, Timestamp newDeadline, String studentId) throws RemoteException;
        public boolean updateEmail(String studentId, String newEmail) throws RemoteException;
        public boolean updatePassword(String studentId, String newPassword) throws RemoteException;
        public boolean updateReminderPreferences(String studentId, boolean enabled) throws RemoteException;
        public void updateStudentDetails(String studentId, String newEmail, String newPassword, String profilePath, boolean remiindersEnabled) throws RemoteException;
        public boolean storeProfilePicture(String studentId, File file) throws RemoteException;
        public boolean getReminderSetting(String studentId) throws RemoteException;
        public Map<String, Integer> getCompletedTaskCountsLast7Days(String studentId) throws RemoteException;
        public void insertPublisher(PublisherService publisher) throws RemoteException;
        public void insertEvent(Event event) throws RemoteException;
        public void insertNotification(Notification notification) throws RemoteException;
        public void insertReminderPreferences(String studentId, String frequency, int hoursBeforeDeadline, boolean priorityOnly) throws RemoteException;
        public void updateReminderPreferences(String studentId, String preferredTime, String frequencyHours, int hoursBeforePriority) throws RemoteException;
        public ReminderPreferences getReminderPreferences(String studentId) throws RemoteException;
        public List<Map<String, String>> getStudentsWithUpcomingTasks()throws RemoteException;
        public void processReminders() throws RemoteException;
        
}
