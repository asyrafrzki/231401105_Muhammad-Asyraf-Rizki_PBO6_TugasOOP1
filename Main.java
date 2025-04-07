//inheritance
public class Main extends Payment {

    public Main(double totalPrice, String paymentMethod) {
        //inheritance constructor dari class Payment
        super(totalPrice, paymentMethod);
    }

    public static void main(String[] args) {
        // Case Siti
        Main siti = new Main(3500000, "Kartu Kredit");
        System.out.println("=== Pembayaran Siti ===");
        System.out.println("Total Harga Sebelum Diskon: Rp " + (int)siti.totalPrice); // casting nilai dari double ke int
        siti.payCredit("Kartu Kredit");
        siti.displayPaymentDetails();
        System.out.println();

        // Case Ciciripi
        Main ciciripi = new Main(10000000, "Voucher Diskon");
        System.out.println("=== Pembayaran Ciciripi ===");
        System.out.println("Total Harga Sebelum Diskon: Rp " + 10000000);
        ciciripi.payVoucher("Voucher Diskon", 15); // 15% discount
        System.out.println("Total Harga Setelah Diskon: Rp " + (int)ciciripi.getTotalPrice());
        ciciripi.displayPaymentDetails();
        System.out.println();

        // Case Asnawi
        Main asnawi = new Main(1200000, "Transfer Bank");
        System.out.println("=== Pembayaran Asnawi ===");
        System.out.println("Total Harga Sebelum Diskon: Rp " + (int)asnawi.totalPrice); //casting nilai dari double ke int
        asnawi.payBank("Transfer Bank");
        asnawi.displayPaymentDetails();
    }
}