package Vježba4.Zadatak3;

import Vježba4.Zadatak4.InvalidAgeException;

public class InvalidAge {

    public static void checkAge(Integer dob){
        if(dob<18){
            throw new InvalidAgeException("Korisnik je maloljetan.");
        }
        else{
            System.out.println("Pristup je dozvoljen.");
        }
    }

        public static void main(String[] args){

            try {
                checkAge(11);
            } catch (InvalidAgeException e) {
                System.out.println(e);
            }
            finally {
                System.out.println("Program gotov.");
            }

            }

}
