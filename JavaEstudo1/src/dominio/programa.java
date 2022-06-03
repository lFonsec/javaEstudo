package dominio;

import entities.Pessoa;

public class programa {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(1, "lucas", "lucas@lucas");
        Pessoa p2 = new Pessoa(2, "pedro", "pedro@pedro");
        Pessoa p3 = new Pessoa(3, "paulo", "paulo@paulo");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
