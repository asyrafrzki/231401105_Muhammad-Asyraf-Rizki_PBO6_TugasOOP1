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

    // Overloading Method Credit Card
    public void payCredit(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
    }

    // Overloading Method Bank Transfer
    public void payBank(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
    }

    // Overloading Method Voucher
    public void payVoucher(String paymentMethod, double discountPercent) {
        this.paymentMethod = paymentMethod;
        double discount = totalPrice * (discountPercent / 100);
        totalPrice = totalPrice - discount;
        this.paymentStatus = "Pembayaran Berhasil dengan " + paymentMethod;
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