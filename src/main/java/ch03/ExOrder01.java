package ch03;
/**
 복합조건: 주문 가능 여부 체크조건 : 재고수량이 0 보다 크고 사용자가 로그인한 상태이고
 VIP이거나 장바구니 금액이 50,000 이상이면 주문이 가능하다
 * */
public class ExOrder01 {
    public static void main(String[] args) {
        int stock = 10;     //재고수량
        boolean isLogin = true; //로그인 여부
        boolean isVip = false;
        int cartTotal = 60000;  //카트에 담긴 물건
        boolean cartOrder = (stock > 0 && isLogin) && (isVip || cartTotal >= 5000);
        //boolean cartOrder = (stock > 0 && isLogin == true) && (isVip == true || cartTotal >= 50000);

        /*if(stock > 0 && isLogin == true && (isVip == true || cartTotal >= 50000)){
            cartOrder = true;
        }*/

        if(cartOrder){
            System.out.println("주문이 가능합니다.");
        }else{
            System.out.println("주문 조건을 충족하지 않았습니ㄷㅏ.");
        }


    }
}
