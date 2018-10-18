
package projectile;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Projectile {

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        variables var = new variables();         
        
        
        System.out.print("Enter initial height: ");
        double initialHeight = scan.nextDouble();                 
        System.out.print("Enter initial velocity: ");
        double initialVel = scan.nextDouble();
        
        double cTime=0;
        double timeDiff = var.getTimeOfFlight(initialHeight)/20;  
        double y=0;
        double heightTravelled = initialHeight - y;
       
        while(heightTravelled > 0)
        {
            double x = var.getHorDist(initialVel, cTime);
            x = BigDecimal.valueOf(x).setScale(3,RoundingMode.HALF_UP).doubleValue();
            
            y = var.getVerDist(0, cTime);
            heightTravelled = initialHeight - y;
            heightTravelled = BigDecimal.valueOf(heightTravelled).setScale(3,RoundingMode.HALF_UP).doubleValue();
            
            if(heightTravelled<0){
                continue;
            }
            cTime = BigDecimal.valueOf(cTime).setScale(7,RoundingMode.HALF_UP).doubleValue();
            System.out.println("x travelled: "+x+" height left: "
                    +heightTravelled+" Time taken: "+cTime);
            
            cTime+=timeDiff;
        }
    }
    
}
