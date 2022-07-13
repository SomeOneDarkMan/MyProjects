package nothingneed;
/*Класс MessageDatabase должен иметь следующую структуру:
        Поля:
        - Статическое поле “сообщения” (англ. messages), которое будет хранить список
        из сообщений (объектов класса Message). Это поле должно
        инициализироваться пустым списком. Этот список и есть наша условная “база
        данных”, которая хранит все сообщения в соц. сети.
        Конструктор:
        Нет конструктора. Объекты класса MessageDatabase создаваться не будут (все
        методы и поля статические).
        Методы:

        - public static void sendMessage(User u1, User u2, String text)-!!!ОСТАНОВИЛСЯ ТУТ ПОЛЯ ОТПРАВКИ СООБЩЕНИЯ В КЛАССЕ USER НЕ РЕАЛИЗОВАННЫ!!!
        ДОПИСАТЬ БАЗУ И ДЕЛАТЬ РЕАЛИЗАЦИЮ В USER!!!

        - этот метод “отправляет” новое сообщение от пользователя u1 пользователю
        u2 с текстом text. Отправка в нашем контексте означает добавление
        сообщения в нашу “базу данных”.
        - public static List<Message> getMessages() - возвращает список всех
        сообщений в “базе данных”.
        - public static void showDialog(User u1, User u2) - этот метод
        должен вывести цепочку сообщений (диалог) пользователей u1 и u2. Формат
        вывода должен быть таким:
        user1: Привет!
        user2: Привет, user1!
        user1: Как у тебя дела?
        user2: Все ок, спасибо :)
        * У вас могут быть любые другие сообщения. Где user1 и user2 - имена
        пользователей u1 и u2.*/

import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MessageDatabase {
  static List<Message> messages=new LinkedList<>();

    public static void sendMessage(User u1, User u2, String text){
messages.add(new Message(u1,u2,text));

    }

  public static List<Message> getMessages() {
    return messages;
  }
  public static void showDialog(User u1, User u2){
      for (Message elements:messages){
        if(elements.getSender()==u1 & elements.getReceiver()==u2){
          System.out.println(u1.getUsername()+":"+elements.getText());
        }
        if(elements.getSender()==u2 & elements.getReceiver()==u1){
          System.out.println(u2.getUsername()+":"+elements.getText());
        }

      }
  }

}
