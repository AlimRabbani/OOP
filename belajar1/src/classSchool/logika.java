package classSchool;

public class logika {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c;

        // konjungsi (&&) dan 
        c = a && b;
        System.out.println("true && false : " + c);

        //disjungsi (atau) 
        c = a || b;
        System.out.println("true | | false : " + c);

        //negasi(bukan) 
        System.out.println("negasi , true : " + !a);

    }

}
