package rmi;

import java.io.File;
import java.rmi.RemoteException;
import serverside.DatabaseOperations;
import java.rmi.server.UnicastRemoteObject;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import notificationsystem.Event;
import notificationsystem.Notification;
import notificationsystem.PublisherService;
import notificationsystem.ReminderPreferences;

public class StudentDbImplementation extends UnicastRemoteObject implements StudentDbInterface{
    DatabaseOperations operate= new DatabaseOperations();
    
    public StudentDbImplementation() throws RemoteException{
        
    }
        @Override
        public String registerStudent(String studentID, String studentFname, String studentSurname, String studentEmail, String password, String confirmPassword) throws RemoteException{
            operate.registerStudent(studentID, studentFname,studentSurname, studentEmail, password, confirmPassword );
        }
        
        @Override
        public String loginStudent(String studentID, String password) throws RemoteException{
            operate.loginStudent(studentID, password);
        }
        
        @Override
        public String[] getStudentNameById(String studentId) throws RemoteException{
            operate.getStudentNameById(studentId);
        }
        
        @Override
        public String getProfilePicturePath(String studentId) throws RemoteException{
            operate.getProfilePicturePath(studentId);
        }
        
        @Override
        public Map<Integer, List<String>> getTasksForMonth(int month, int year, String studentId) throws RemoteException{
            operate.getTasksForMonth(month, year, studentId);
        }
        
        @Override
        public int insertTask(String studentId, String title, String description, Timestamp deadline, String status) throws RemoteException{
            operate.insertTask(studentId, title, description, deadline, status);
        }
        
        @Override
        public boolean deleteTasks(String studentId, List<String> titles) throws RemoteException{
            operate.deleteTasks(studentId, titles);
        }
        @Override
        public List<Map<String, Object>> getAllTasks(String studentId) throws RemoteException{
            operate.getAllTasks(studentId);
        }
        @Override
        public Map<String,Object> getPriorityTask(String studentId) throws RemoteException{
            operate.getPriorityTask(studentId);
        }
        @Override
        public boolean markTasksAsCompleted(String studentId, List<String>taskTitles) throws RemoteException{
            operate.markTasksAsCompleted(studentId, taskTitles);
        }
        @Override
        public void updateTaskDay(String title, Timestamp newDeadline, String studentId) throws RemoteException{
            operate.updateTaskDay(title, newDeadline, studentId);
        }
        @Override
        public boolean updateEmail(String studentId, String newEmail) throws RemoteException{
            operate.updateEmail(studentId, newEmail);
        }
        @Override
        public boolean updatePassword(String studentId, String newPassword) throws RemoteException{
            operate.updatePassword(studentId, newPassword);
        }
        @Override
        public boolean updateReminderPreferences(String studentId, boolean enabled) throws RemoteException{
            operate.updateReminderPreference(studentId, enabled);
        }
        @Override
        public void updateStudentDetails(String studentId, String newEmail, String newPassword, String profilePath, boolean remiindersEnabled) throws RemoteException{
            operate.updateStudentDetails(studentId, newEmail, newPassword, profilePath, remiindersEnabled);
        }
        @Override
        public boolean storeProfilePicture(String studentId, File file) throws RemoteException{
            operate.storeProfilePicture(studentId, file);
        }
        @Override
        public boolean getReminderSetting(String studentId) throws RemoteException{
            operate.getReminderSetting(studentId);
        }
        @Override
        public Map<String, Integer> getCompletedTaskCountsLast7Days(String studentId) throws RemoteException{
            operate.getCompletedTaskCountsLast7Days(studentId);
        }
        @Override
        public void insertPublisher(PublisherService publisher) throws RemoteException{
            operate.insertPublisher(publisher);
        }
        @Override
        public void insertEvent(Event event) throws RemoteException{
            operate.insertEvent(event);
        }
        @Override
        public void insertNotification(Notification notification) throws RemoteException{
            operate.insertNotification(notification);
        }
        @Override
        public void insertReminderPreferences(String studentId, String frequency, int hoursBeforeDeadline, boolean priorityOnly) throws RemoteException{
            operate.insertReminderPreferences(studentId, frequency, hoursBeforeDeadline, priorityOnly);
        }
        @Override
        public void updateReminderPreferences(String studentId, String preferredTime, String frequencyHours, int hoursBeforePriority) throws RemoteException{
            operate.updateReminderPreferences(studentId, preferredTime, frequencyHours, hoursBeforePriority);
        }
        @Override
        public ReminderPreferences getReminderPreferences(String studentId) throws RemoteException{
            operate.getReminderPreferences(studentId);
        }
        @Override
        public List<Map<String, String>> getStudentsWithUpcomingTasks()throws RemoteException{
            operate.getStudentsWithUpcomingTasks();
        }
        @Override
        public void processReminders() throws RemoteException{
            operate.processReminders();
        }
}
