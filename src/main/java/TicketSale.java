public class TicketSale {
  private static double TAX_RATE = 0.06;

  private int adultTicketCount;
  private int childTicketCount;
  private double adultPrice;
  private double childPrice;

  public TicketSale(int adultTicketCount, int childTicketCount, double adultPrice, double childPrice) {
    this.adultTicketCount = adultTicketCount;
    this.childTicketCount = childTicketCount;
    this.adultPrice = adultPrice;
    this.childPrice = childPrice;
  }

  public double subtotal() {
    return (this.adultPrice * this.adultTicketCount) + (this.childTicketCount * this.childPrice);
  }

  public double total() {
    return this.subtotal() * (1 + TAX_RATE);
  }

}
