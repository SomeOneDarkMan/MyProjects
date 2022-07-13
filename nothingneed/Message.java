package nothingneed;

import java.util.Date;

/*Класс Message должен иметь следующую структуру:
Поля:
- Поле типа User “отправитель” (англ. sender) - отправитель сообщения
- Поле типа User “получатель” (англ. receiver) - получатель сообщения
- Строковое поле “текст” (англ. text) - текст сообщения
- Поле типа Date “дата” (англ. date) - дата отправки сообщения
Конструктор:
- Конструктор должен принимать 3 аргумента - отправителя, получателя и текст
сообщения. Также, конструктор должен назначать полю date текущее время
(то есть время создания объекта Message).
Методы:
- Геттеры на все поля
- Метод toString(), который возвращает строковое представление сообщения
в таком формате:
FROM: 'Имя отправителя'
TO: 'Имя получателя'
ON: Sun Aug 30 19:07:34 MSK 2020
'Текст сообщения'
*в поле ON должна быть дата создания объекта класса Message

*/
public class  Message {
    private User sender;
    private User receiver;
    String  text;
    Date date;
    public  Message(User sender,User receiver,String text){
        this.sender=sender;
        this.receiver=receiver;
        this.text=text;
        date=new Date();
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public User getSender() {
        return sender;
    }

    @Override
    public String toString() {
       /* TO: 'Имя получателя'
        ON: Sun Aug 30 19:07:34 MSK 2020
        'Текст сообщения'
                *в поле ON должна быть дата создания объекта класса Message
        Класс MessageDatabase должен иметь следующую структуру:
        Поля*/
        return "TO:"+receiver+"\n"+
                "ON:"+date+"\n"+
                text+"\n"+
                "-----------"+"\n";
    }
}
