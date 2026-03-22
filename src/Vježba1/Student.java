package Vježba1;

import java.util.Scanner;

public class Student {

    String ime;
    String prezime;
    int dob;

    public Student(String ime, String prezime, int dob) {
        this.ime = ime;
        if(ime==null || ime.trim().isEmpty()){
            this.ime="Nepoznato";
        }


        if (prezime == null || prezime.trim().isEmpty()) {
            Scanner sc = new Scanner(System.in);
            String p;
            do {
                System.out.print("Unesite prezime: ");
                p = sc.nextLine().trim();
            } while (p.isEmpty());
            this.prezime = p;
             sc.close();
        } else {
            this.prezime = prezime.trim();

        }
        //this.prezime = prezime;


        if(dob<0){
            System.out.println("Dob ne smije biti negativna. Unesite ponovno:");
            int d;
            Scanner sc = new Scanner(System.in);
            do{
                d = sc.nextInt();
            } while (d<0);
            this.dob =d;
        }
        else{
            this.dob = dob;
        }

    }


    public void ispis(){
        System.out.println("Ime: "+ this.ime+" Prezime: "+this.prezime+" Dob: "+this.dob);
    }

}