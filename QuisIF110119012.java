
package quis.pkgif.pkg1.pkg10119012;
import java.util.Scanner;

/**
 *   NAMA   : DAMAI SAPUTRA LAOLI
 *   KELAS  : IF-1
 *   NIM    : 10119012
 * @author damai
 */
public class QuisIF110119012 {

    
    
  public static void main(String[] args) {
	// write your code here
        int serviceItem;

        boolean isMember;

        float price, discount;

        Scanner scanner = new Scanner(System.in);
        ServicePrice service = new ServicePrice();
        Customer customer    = new Customer();
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name \t : ");
        customer.setName(scanner.next());
        System.out.print("Customer Email \t : ");
        customer.setEmail(scanner.next());

        service.displayService();
        serviceItem = scanner.nextInt();
        service.setPriceService(service.getPrice(serviceItem));

        System.out.print("Are you Member (yes/no) : ");
        isMember = service.checkMemberStatus(scanner.next());

        discount = service.getSale(isMember, service.getPriceService());
        System.out.println("\n");
        System.out.println("#******************************#");
        System.out.println("#******************************#");
        System.out.println("Date Transaction : " + customer.currentTime());
        System.out.println("Service Price : " + service.getPriceService());
        System.out.println("Discount : " + discount);
        System.out.println("Total Pay : " + service.getTotalPay(service.getPriceService(), discount));
    }
}