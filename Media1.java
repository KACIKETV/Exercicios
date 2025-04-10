import java.util.Scanner;
public class Media1 {
    public static void main (String[]args){
        Scanner SC = new Scanner (System.in);

        double A, B, C, Media;
        A = SC.nextDouble();
        B = SC.nextDouble();
        C = SC.nextDouble();

        Media = ((A*2)+(B*3)+(C*5))/10;
        
        System.out.printf("Media = %.1f\n", Media);

        SC.close();

    } 
    
}
