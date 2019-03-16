package Lesson_02.Entities;

import java.util.Date;

public class Item extends Data {
    public String name;
    public int quantity;
    public double price;

    public Item(int codigo, Date dataHoraInclusao, Date dataHoraEdicao, String name, int quantity, double price) {
        super(codigo, dataHoraInclusao, dataHoraEdicao);
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
