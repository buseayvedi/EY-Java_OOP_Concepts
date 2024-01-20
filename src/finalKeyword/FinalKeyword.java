package finalKeyword;

import java.time.LocalDate;

class  Student {

final public void language(){
    System.out.println("Java Programming");
}

}


public class FinalKeyword extends Student{

   /*
    @Override
    public void language() {
        System.out.println("Python Programming");
    }

     */ // final methods can never be overridden

    /*
    public final FinalKeyword(){

    }

     */ // final keyword can't be applicable for constructors

    public static void main(String[] args) {

        final char gender = 'M';

        System.out.println(gender);

        //gender = 'F';

        System.out.println(gender);

        System.out.println("---------------------------------------------");

        final LocalDate DOB = LocalDate.now();

        System.out.println(DOB);

        // DOB = DOB.plusYears(1);

        System.out.println(DOB);

        System.out.println("-----------------------------------------------------");

        new Student().language();
        new FinalKeyword().language();


        System.out.println("----------------------------------------------------");

        final String name ="James";

        // name = null; eligible for garbage collection
        // name = "Daniel";

        System.out.println(name);

    }
}
