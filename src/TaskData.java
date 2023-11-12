import java.util.ArrayList;
import java.util.HashMap;

public class TaskData {
    HashMap <Integer, Task> tasksList = new HashMap<>();

    Task addNewTask(String taskName) {
        Task newTask = new Task(taskName);

        tasksList.put(newTask.hashCode(), newTask);

        return newTask;
    }

    ArrayList<String> getAllTasks() {
        ArrayList<String> allTasks = new ArrayList<>();

        for (Task task : tasksList.values()) {
            allTasks.add(task.taskName);
        }

        return allTasks;
    }

    String deleteAllTask() {
        if (!tasksList.isEmpty()) {
            tasksList.clear();
            return "Список очещиен";
        }

        return "Задачи для удаления отсутствуют";
    }

    String getTaskByID(int IDOfTask) {
        return tasksList.get(IDOfTask).taskName;
    }

    Task changeTaskStatus(String taskName, String newTaskStatus) {
        for (int key : tasksList.keySet()) {
            if (tasksList.get(key).taskName.equals(taskName)) {
                tasksList.get(key).statusOfTask = newTaskStatus;

                return tasksList.get(key);
            }
        }

        return null;
    }

    Task changeTaskName(String oldTaskName, String newTaskName) {
        for (int key : tasksList.keySet()) {
            if (tasksList.get(key).taskName.equals(oldTaskName)) {
                tasksList.get(key).taskName = newTaskName;

                return tasksList.get(key);
            }
        }

        return null;
    }

    String deleteTaskByID (int IDOfTask) {
        tasksList.remove(IDOfTask);
        
        return "Задача успешно удалена";
    }
}
