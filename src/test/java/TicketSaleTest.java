import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TicketSaleTest {
  @Test
  public void getsSubtotalForJustChildren() {
    TicketSale sale = new TicketSale(0, 2, 25, 15);
    assertEquals(2 * 15.00, sale.subtotal());
  }

  @Test
  public void getSubtotalForJustAdults() {
    TicketSale sale = new TicketSale(4,0, 25, 15);
    assertEquals(25 * 4, sale.subtotal());
  }

  @Test
  public void getSubtotalForCombinedTickets() {
    TicketSale sale = new TicketSale(2, 4, 25, 15);
    assertEquals(2*25.0+4*15.0, sale.subtotal());
  }

  @Test
  public void getTotalIncludesTax() {
    TicketSale sale = new TicketSale(2, 4, 25, 15);
    assertEquals((2*25.0+4*15.0)*1.06, sale.total());
  }
}
