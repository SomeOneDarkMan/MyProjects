package Task3;
import java.util.LinkedHashSet;
import java.util.Set;


public class MusicBand {
    private Set<boys> Command=new LinkedHashSet<>();
    private String name;
    private int year;
public class boys{
   private String fisrtname;
   private String lastname;
    public boys(String fisrtname,String lastname){
        this.fisrtname=fisrtname;
        this.lastname=lastname;

    }
    public void addmen(boys one) {
Command.add(one);
    }


    @Override
    public String toString() {
        return "boys{" +
                "fisrtname='" + fisrtname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}

public void addmen(String fisrtname,String lastname){
    boys now=new boys(fisrtname,lastname);
    now.addmen(now);


}
    public void removemen(int i) {
    int b = 0;
         for (boys elemen:Command){
             if(b==i){
                 Command.remove(elemen);}
             b++;
         }
    }
    public Set<boys> printMembers(){

        return Command;
    }
    public MusicBand(String name,int year){
        this.name=name;
        this.year=year;
    }
    public class MusicBoy{
        String name;
        public MusicBoy(String name){
            this.name=name;
        }

    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}'+ "\n";
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
