
package projectile;

public class VariablesProj 
{
    /* 
    ux = initial horizontal velocity
    vx = final horizontal velocity
    uy = initial vertical velocity
    vy = final vertical velocity
    x = horizontal distance travelled
    y = vertical distance travelled
    t = time at that instant
    u = initial velocity (resultant of ux and uy)
    angle = angle at which the projectile is thrown
    g = accelaration of gravity
    */
    private double ux, vx, uy, vy, x, y, t, u, angle;   
    private final double g = 9.8;
    
     /*
    ux = horizontal component of velocity = |velocity| * cos(projectile angle)
    uy = vertical component of velocity = |velocity| * sin(projectile angle)
    */
    double getVelComp(double vel, double angle)
    {
        angle = Math.toRadians(angle);
        double cos = Math.cos(angle);
        double sin = Math.sin(angle);
        ux = vel*cos;
        uy = vel*sin;
        this.angle = angle; 
        return ux;
    }
    
     /*
    vy = final vertical velocity at the time instant t
       = vertical component of initial velocity  - (acc. due to gravity * time)
    */
    double getVerVel(double initial_ver_vel, double time)
    {
        uy = initial_ver_vel;
        t = time;
        vy = uy - (g*t);
        return vy;
    }
    
    /*
    vx = final horizontal velocity at the time instant t
       = initial horizontal velocity 
    */
    double getHorVel(double initial_hor_vel)
    {
        ux = initial_hor_vel;
        vx = ux;
        return vx;
    }
    
    /*
    x = horizontal distance travelled at the time instant t
      = horizontal component of initial velocity * time at that instant
    */
    double getHorDist(double initial_hor_vel, double time)
    {
        ux = initial_hor_vel;
        t = time;
        x = ux*t;
        return x;
    }
   
    /*
    Horizontal distance covered' Range(R)
    */
    double getHorRangeProj(double initial_vel, double angle)
    {
     angle = Math.toRadians(angle);
     u = initial_vel;
     double HorRange = ( u*u*(Math.sin(2*angle)))/g ;
     return HorRange;
    }
    
     /*
    total time of flight (T)
    */
    double getTimeOfFlightProj(double initial_vel, double angle)
    {
        angle = Math.toRadians(angle);
        u = initial_vel;
        t = ( 2*u*(Math.sin(angle)) ) / g;
        return t;
    }
    
    /*
    Max height attained(H)
    */
    double getMaxHeightProj(double initial_vel, double angle)
    {
        angle = Math.toRadians(angle);
        u = initial_vel;
        double VerHeight = (u*u*(Math.sin(angle))*(Math.sin(angle)))/2*g ;
        return VerHeight;
    }
    
    /*
    Vertical distance at the moment
    */
    double getVerDistProj(double initial_ver_vel, double time)
    {
        uy = initial_ver_vel;
        t = time;
        y = (uy*t) -(g*t*t)/2;           
        return y;
    }
     
    
    
    
   
}
