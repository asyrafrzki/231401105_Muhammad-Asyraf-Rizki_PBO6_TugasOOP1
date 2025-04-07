public class Payment {
    // Attribute
    protected double totalPrice;
    protected String paymentMethod;
    protected String paymentStatus;

    // Constructor
    public Payment(double totalPrice, String paymentMethod) {
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pending";
    }

    //overloading bank transfer dan credit card
    public void pay(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
    }
    
    //overloading diskon
    public void pay(String paymentMethod, double discountPercent) {
        this.paymentMethod = paymentMethod;
        double discount = totalPrice * (discountPercent / 100);
        totalPrice -= discount;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod + " (Diskon " + discountPercent + "%)";
    }
    

    // Void Method Menampilkan detail pembayaran
    public void displayPaymentDetails() {
        System.out.println("Metode Pembayaran: " + paymentMethod);
        System.out.println("Status Pembayaran: " + paymentStatus);
    }

    // return type totalprice setelah diskon (jika pakai voucher)
    public double getTotalPrice() {
        return totalPrice;
    }
}