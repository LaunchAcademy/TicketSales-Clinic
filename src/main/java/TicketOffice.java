public class TicketOffice {
  private static double ADULT_PRICE = 24.50;
  private static double CHILD_PRICE = 17.50;

  private int childTicketsLeft;
  private int adultTicketsLeft;

  public TicketOffice() {
    childTicketsLeft = 0;
    adultTicketsLeft = 0;
  }

  public int getChildTicketsLeft() {
    return childTicketsLeft;
  }

  public int getAdultTicketsLeft() {
    return adultTicketsLeft;
  }

  public void restockChildTickets(int numTickets) {
    childTicketsLeft = childTicketsLeft + numTickets;
  }

  public void restockAdultTickets(int numTickets) {
    adultTicketsLeft = adultTicketsLeft + numTickets;
  }

  public TicketSale makeSale(int adultTickets, int childTickets) {
    if(adultTicketsLeft - adultTickets > 0 && childTicketsLeft - childTickets > 0) {
      adultTicketsLeft = adultTicketsLeft - adultTickets;
      childTicketsLeft = childTicketsLeft - childTickets;
      return new TicketSale(adultTickets, childTickets, ADULT_PRICE, CHILD_PRICE);
    }
    else {
      return null;
    }
  }

}
