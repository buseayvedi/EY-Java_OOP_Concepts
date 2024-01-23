package lesson05_Inheritance.typesOfInheritance;

import java.time.LocalDate;

public class President extends Person{

    private LocalDate electedDate;

    public President(String name, char gender, LocalDate dateOfBirth,LocalDate electedDate) {
        super(name, gender, dateOfBirth);
        setElectedDate(electedDate);
    }

    public LocalDate getElectedDate() {
        return electedDate;
    }

    public void setElectedDate(LocalDate electedDate) {
        this.electedDate = electedDate;
    }

    public void lie(){
        System.out.println(getName()+" is lying");
    }
}
