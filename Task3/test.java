package Task3;

import Task3.*;

import java.util.*;
/*
. Создать список строк, добавить в него 5 марок автомобилей, вывести список в
консоль. Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль
из списка. Распечатать список.
2. Создать новый список, заполнить его четными числами от 0 до 30 и от 300 до 350.
Вывести список.
3. *Выполнять в подпапке task3 в day12*
Создать класс Музыкальная Группа (англ. MusicBand) с полями name и year
(название музыкальной группы и год основания). Создать 10 или более экземпляров
класса MusicBand , добавить их в список (выбирайте такие музыкальные группы,
которые были созданы как до 2000 года, так и после, жанр не важен). Перемешать
список. Создать статический метод в классе Task3:
public static List<MusicBand> groupsAfter2000(List<MusicBand>
bands)
Этот метод принимает список групп в качестве аргумента и возвращает новый список,
состоящий из групп, основанных после 2000 года. Вызвать метод
groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке
из 10 групп. Вывести в консоль оба списка (оригинальный и с группами, основанными
после 2000 года).

4. *Выполнять в подпапке task4 в day12*
Скопировать MusicBand из прошлого задания и доработать таким образом, чтобы в
группу можно было добавлять и удалять участников. Под участником понимается
строка (String) с именем и фамилией. Реализовать статический метод слияния групп
(в классе MusicBand), т.е. все участники группы А переходят в группу B. Название
метода: transferMembers. Этот метод принимает в качестве аргументов два
экземпляра класса MusicBand. Реализовать метод printMembers (в классе
MusicBand), выводящий список участников в консоль. Проверить состав групп после
слияния.

5. *Выполнять в подпапке task5 в day12*
Скопировать MusicBand из прошлого задания и доработать - теперь у участника
музыкальной группы есть не только имя, но и возраст. Соответственно, теперь под
участником понимается не строка, а объект класса MusicArtist. Необходимо
реализовать класс MusicArtist и доработать класс MusicBand (создать копию
класса) таким образом, чтобы участники были - объекты класса MusicArtist. После
этого, надо сделать то же самое, что и требовалось в 4 задании - слить две группы и
проверить состав групп после слияния. Методы для слияния и для вывода участников
в консоль необходимо тоже переработать, чтобы они работали с объектами класса
MusicArtist.
 */

public class test {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
for (int i=0; i<bands.size();i++){
int year=bands.get(i).getYear();
if (year>2000){
    groupsAfter2000.add(bands.get(i));
}

}
        return groupsAfter2000;
    }
    public static void main(String[] args) {
        List<MusicBand> grup = new ArrayList<>();

        grup.add(new MusicBand("Niger",1989));
        grup.add(new MusicBand("BTC",2000));
        grup.add(new MusicBand("Руки-Вверх",2004));
        grup.add(new MusicBand("Maroon",2003));
        grup.add(new MusicBand("Френдзона",1999));
        grup.add(new MusicBand("Black Star",2000));
        grup.add(new MusicBand("Балканика",1970));
        grup.add(new MusicBand("Pico",2002));
        grup.add(new MusicBand("RepGey",2000));
        grup.add(new MusicBand("Lu",1980));
        System.out.println(grup);
        System.out.println(groupsAfter2000(grup));
        grup.get(0).addmen("Вася","Пупкин");
        grup.get(0).addmen("Маша","Пупкина");

        grup.get(1).addmen("Жопкин","Пупкин");
        grup.get(1).addmen("Алеша","Ритузкин");
        System.out.println("Участники группы: \""+grup.get(1).getName()+"\""+grup.get(1).printMembers());
        grup.get(1).removemen(1);
        System.out.println("Участники группы: \"Niger\""+grup.get(0).printMembers());
        System.out.println("Участники группы: \""+grup.get(1).getName()+"\""+grup.get(1).printMembers());


    }
}
