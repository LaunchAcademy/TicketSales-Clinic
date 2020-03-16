import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TicketOfficeTest {
  @Test
  public void startsWithNoChildrenTickets() {
    TicketOffice office = new TicketOffice();
    assertEquals(office.getChildTicketsLeft(), 0);
  }

  @Test
  public void startsWithNoAdultTickets() {
    TicketOffice office = new TicketOffice();
    assertEquals(office.getAdultTicketsLeft(), 0);
  }

  @Test
  public void restockChildTickets() {
    TicketOffice office = new TicketOffice();
    office.restockChildTickets(100);
    assertEquals(office.getChildTicketsLeft(), 100);
  }

  @Test
  public void restockAdultTickets() {
    TicketOffice office = new TicketOffice();
    office.restockAdultTickets(100);
    assertEquals(office.getAdultTicketsLeft(), 100);
  }

  @Test
  public void makeTicketSaleReturnsObject() {
    TicketOffice office = new TicketOffice();
    office.restockAdultTickets(100);
    office.restockChildTickets(50);
    TicketSale ticketSale = office.makeSale(5, 4);
    assertNotEquals(ticketSale, null);
  }

  @Test
  public void makeTicketSalesReturnsNullWhenOutOfStock() {
    TicketOffice office = new TicketOffice();
    TicketSale ticketSale = office.makeSale(5, 4);
    assertEquals(ticketSale, null);
  }

  @Test
  public void makeTicketSaleReducesAdultStock() {
    TicketOffice office = new TicketOffice();
    office.restockAdultTickets(100);
    office.restockChildTickets(50);
    TicketSale ticketSale = office.makeSale(5, 4);
    assertEquals(office.getAdultTicketsLeft(), 95);
  }

  @Test
  public void makeTicketSaleReducesChildStock() {
    TicketOffice office = new TicketOffice();
    office.restockAdultTickets(100);
    office.restockChildTickets(50);
    TicketSale ticketSale = office.makeSale(5, 4);
    assertEquals(office.getChildTicketsLeft(), 46);
  }



}
