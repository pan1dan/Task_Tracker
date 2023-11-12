import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userCommand1;
        int userCommand2;
        String userAnswer1;
        String userAnswer2;
        String userAnswer3;
        TaskData taskData = new TaskData();
        EpicAndSubtaskData epicData = new EpicAndSubtaskData();


        while(true) {
            printMenu();
            userCommand1 = scanner.nextInt();
            
            if (userCommand1 == 1) { // Задача
                printTask();
                userCommand2 = scanner.nextInt();
                
                if (userCommand2 == 1) {
                    taskData.getAllTasks();
                    
                } else if (userCommand2 == 2) {
                    taskData.deleteAllTask();
                    
                } else if (userCommand2 == 3) {
                    System.out.println("Введите идентификатор: ");
                    userAnswer1 = scanner.next();
                    
                    taskData.getTaskByID(Integer.parseInt(userAnswer1));
                    
                } else if (userCommand2 == 4) {
                    System.out.println("Введите имя");
                    userAnswer1 = scanner.next();
                    
                    taskData.addNewTask(userAnswer1);
                    
                } else if (userCommand2 == 5) {
                    System.out.println("Какую информацию вы хотите изменить?");
                    System.out.println("1. Статус задачи");
                    System.out.println("2. Имя задачи");
                    userAnswer1 = scanner.next();

                    if (userAnswer1.equals("1")) {
                        System.out.println("Введите имя изменяемого объекта");
                        userAnswer2 = scanner.next();

                        System.out.println("Введите новый статус изменяемого объекта");
                        userAnswer3 = scanner.next();

                        taskData.changeTaskStatus(userAnswer2, userAnswer3);

                    } else if (userAnswer1.equals("2")) {
                        System.out.println("Введите старое имя изменяемого объекта");
                        userAnswer2 = scanner.next();

                        System.out.println("Введите новое имя изменяемого объекта");
                        userAnswer3 = scanner.next();

                        taskData.changeTaskName(userAnswer2, userAnswer3);

                    }

                } else if (userCommand2 == 6) {
                    System.out.println("Введите идентификатор: ");
                    userAnswer1 = scanner.next();
                    
                    taskData.deleteTaskByID(Integer.parseInt(userAnswer1));
                }

            } else if (userCommand1 == 2) {     //Эпик
                printEpic();
                userCommand2 = scanner.nextInt();

                if (userCommand2 == 1) {
                    epicData.getAllEpics();

                } else if (userCommand2 == 2) {
                    epicData.deleteAllEpics();

                } else if (userCommand2 == 3) {
                    System.out.println("Введите идентификатор: ");
                    userAnswer1 = scanner.next();

                    epicData.getEpicByID(Integer.parseInt(userAnswer1));

                } else if (userCommand2 == 4) {
                    System.out.println("Введите имя");
                    userAnswer1 = scanner.next();

                    System.out.println("Введите сопутствующий текст");
                    userAnswer2 = scanner.next();

                    epicData.addNewEpic(userAnswer1, userAnswer2);

                } else if (userCommand2 == 5) {
                    System.out.println("Какую информацию вы хотите изменить?");
                    System.out.println("1. Имя задачи");
                    System.out.println("2. Изменить сопутствующую информацию");
                    userAnswer1 = scanner.next();


                    if (userAnswer1.equals("1")) {
                        System.out.println("Введите старое имя изменяемого объекта");
                        userAnswer2 = scanner.next();

                        System.out.println("Введите новое имя изменяемого объекта");
                        userAnswer3 = scanner.next();

                        epicData.changeEpicName(userAnswer2, userAnswer3);

                    } else if (userAnswer1.equals("2")) {
                        System.out.println("Введите имя изменяемого объекта");
                        userAnswer2 = scanner.next();

                        System.out.println("Введите новую сопутствующую информацию изменяемого объекта");
                        userAnswer3 = scanner.next();

                        epicData.changeEpicAdditionalInformation(userAnswer2, userAnswer3);

                    }

                } else if (userCommand2 == 6) {
                    System.out.println("Введите идентификатор: ");
                    userAnswer1 = scanner.next();

                    epicData.deleteEpicByID(Integer.parseInt(userAnswer1));
                }


            } else if (userCommand1 == 3) {  // Подзадача
                printSubtask();
                userCommand2 = scanner.nextInt();
                
                if (userCommand2 == 1) {
                    epicData.getAllSubtask();
                    
                } else if (userCommand2 == 2) {
                    epicData.deleteAllSubtask();
                } else if (userCommand2 == 3) {
                    System.out.println("Введите идентификатор: ");
                    userAnswer1 = scanner.next();

                    epicData.getSubtaskByID(Integer.parseInt(userAnswer1));
                } else if (userCommand2 == 4) {
                    System.out.println("Введите эпика, в который добавится подзадача");
                    userAnswer1 = scanner.next();

                    System.out.println("Введите имя");
                    userAnswer2 = scanner.next();

                    epicData.addNewSubtask(userAnswer1, userAnswer2);
                } else if (userCommand2 == 5) {
                    System.out.println("Какую информацию вы хотите изменить?");
                    System.out.println("1. Статус ");
                    System.out.println("2. Имя ");
                    userAnswer1 = scanner.next();

                    if (userAnswer1.equals("1")) {
                        System.out.println("Введите имя изменяемого объекта");
                        userAnswer1 = scanner.next();

                        System.out.println("Введите имя эпика изменяемого объекта");
                        userAnswer2 = scanner.next();

                        System.out.println("Введите новый статус изменяемого объекта");
                        userAnswer3 = scanner.next();

                        epicData.changeSubtaskStatus(userAnswer1, userAnswer2, userAnswer3);

                    } else if (userAnswer1.equals("2")) {
                        System.out.println("Введите старое имя изменяемого объекта");
                        userAnswer1 = scanner.next();

                        System.out.println("Введите имя эпика изменяемого объекта");
                        userAnswer2 = scanner.next();

                        System.out.println("Введите новое имя изменяемого объекта");
                        userAnswer3 = scanner.next();

                        epicData.changeSubtaskName(userAnswer1, userAnswer2, userAnswer3);

                    }
                } else if (userCommand2 == 6) {
                    System.out.println("Введите идентификатор: ");
                    userAnswer1 = scanner.next();

                    epicData.deleteSubtaskByID(Integer.parseInt(userAnswer1));
                }
            }
        }

    }

    static void printMenu() {
        System.out.println("Что вы хотите посмотреть/добавить/изменить? ");
        System.out.println("1. Задача");
        System.out.println("2. Эпик");
        System.out.println("3. Подзадача");
    }

    static void printTask () {
        System.out.println("Выберите одно из действий: ++++++++++++++++");
        System.out.println("1. Посмотреть список всех задач +");
        System.out.println("2. Удалить все задачи +");
        System.out.println("3. Получить задачу по идентификатору +");
        System.out.println("4. Добавить задачу +");
        System.out.println("5. Обновить информация об объекте +");
        System.out.println("6. Удалить задачу по идентификатору +");
    }

    static void printEpic() {
        System.out.println("Выберите одно из действий: ");
        System.out.println("1. Посмотреть список всех эпиков +");
        System.out.println("2. Удалить все эпиков +");
        System.out.println("3. Получить эпик по идентификатору +");
        System.out.println("4. Добавить эпик +");
        System.out.println("5. Обновить информация об объекте"); //!!!!ПЕРЕДЕЛАТЬ
        System.out.println("6. Удалить эпик по идентификатору +");
    }

    static void printSubtask() {
        System.out.println("Выберите одно из действий: ");
        System.out.println("1. Посмотреть список всех подзадач +");
        System.out.println("2. Удалить все подзадачи +");
        System.out.println("3. Получить подзадачу по идентификатору +");
        System.out.println("4. Добавить подзадачу +");
        System.out.println("5. Обновить информация об объекте, (изменение статуса) +");
        System.out.println("6. Удалить подзадачу по идентификатору ");
    }
}