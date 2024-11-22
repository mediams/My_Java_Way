package sweets;

public class Demo {
    public static void main(String[] args) {
        Candy candy = new Candy();
        candy.setName("Candy_01");
        candy.setWeight(2.5);
        candy.setSugarWeight(0.5);

        Cookie cookie = new Cookie();
        cookie.setName("Cookie_01");
        cookie.setWeight(2.2);
        cookie.setSugarWeight(0.3);

        Lollipop lollipop = new Lollipop();
        lollipop.setName("Lollipop_01");
        lollipop.setWeight(1.9);
        lollipop.setSugarWeight(0.4);

        Present present = new Present();
        present.addSweet(candy);
        present.addSweet(candy);

        System.out.println(present);
    }
}
