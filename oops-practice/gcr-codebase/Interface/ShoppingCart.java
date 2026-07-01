public class ShoppingCart implements ICouponValidator{

    @Override
    static boolean isLength(String code){
        return ICouponValidator.isLength(code) && code.startsWith("SAVE");
    }

}
