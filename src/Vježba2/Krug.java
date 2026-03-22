package Vježba2;

public class Krug {

    Double radius;
     public Krug(Double radius) {
        this.radius = radius;
    }

    void povrsina(){
         System.out.println("Površina kruga je: " + radius*radius*3.14);
    }

    void opseg(){
         System.out.println("Opseg kruga je: " + 2*3.14*radius);
    }

    public static void main (String[] args){
         Krug k = new Krug(12.3);
         k.povrsina();
         k.opseg();
    }
}
