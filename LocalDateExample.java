import java.security.KeyStore.LoadStoreParameter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
public class LocalDateExample {
    public static void main(String[] args){
        // LocalDate dob=LocalDate.of(2006,10,03);
        // System.out.println(dob);
        // LocalDate today=LocalDate.now();
        // System.out.println(today);
        // Period age=Period.between(dob, today);
        // System.out.println("age "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days ");
        //  LocalDate loanDate = LocalDate.now();
        //  LocalDate duDate = loanDate.plusDays(30);
        //  System.out.println("loan date:"+ loanDate);
        //  System.out.println("due date"+ duDate);
     
        // LocalDate expiryDate = LocalDate.of(2026, 5 ,15);
        // LocalDate today = LocalDate.now();
        // if(today.isAfter(expiryDate))
        // {
        //     System.out.println("product expired");
        //         }else{
        //             System.out.println("product not expired ");
                // }
                // LocalDateTime now = LocalDateTime.now();
                // System.out.println(now.getHour());
                // System.out.println(now.getMinute());
                // System.out.println(now.getSecond());
                // // System.out.println(now.getDayOfMonth());
                // LocalDateTime now = LocalDateTime.now();
                // System.out.println(now.plusDays(2));
                // System.out.println(now.plusHours(2));
                // System.out.println(now.plusMinutes(30));


                LocalDateTime otpTime = LocalDateTime.now();
                System.out.println(otpTime);
                LocalDateTime exptime = otpTime.plusMinutes(2);
                System.out.println(exptime);
                   LocalDateTime curTime = LocalDateTime.now().plusMinutes(1);
                if(curTime.isAfter(exptime))
                    System.out.println("otp expired");
                else
                    System.out.println("otp valid");

            }
        
                
        
    }
