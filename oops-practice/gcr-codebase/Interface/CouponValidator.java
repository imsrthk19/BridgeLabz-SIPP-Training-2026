public interface CouponValidator {
    public static void main(String[] args) {
        String[] coupons = {
            "Save123",
            "Hii 123",
            "HSA@%^",
            "SAVE6789",
            "SaVe1234",
            "tuigvj12334"
        };

        ICouponValidator validator = new ShoppingCart();

        for(String coupon: coupons){
            if(validator.couponValidator(coupon)){
                System.out.println("It is a valid coupon");
            }
            else{
                System.out.println("It is invalid coupon");
            }
        }
    }    
}
