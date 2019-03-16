package Lesson_02.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido extends Data {
    String nomeCliente;
    String nomeFilial;
    private List<Item> items = new ArrayList<Item>();

    public Pedido(int codigo, Date dataHoraInclusao, Date dataHoraEdicao, String nomeCliente, String nomeFilial) {
        super(codigo, dataHoraInclusao, dataHoraEdicao);
        this.nomeCliente = nomeCliente;
        this.nomeFilial = nomeFilial;
    }

    public boolean addItem(Item item) {
        items.add(item);

        if (items.contains(item)) return true;
        return false;
    }

    public boolean updateItem(Item item) {
        if (!items.contains(item)) return false;
        int index = items.indexOf(item);
        items.remove(item);
        items.add(index, item);

        return items.contains(item);
    }

    public boolean removeItem(int codigo) {
        Item target = getItem(codigo);
        if (target != null) {
            items.remove(target);
            return true;
        }
        return false;
    }

    public double getValor() {
        double sum = 0;
        for (int i = 0; i < items.size(); i++) sum += items.get(i).price * items.get(i).quantity;
        return sum;
    }

    private Item getItem(int codigo) {
        Item target = null;
        for (Item item : items) {
            if (item.equals(codigo)) {
                target = item;
                break;
            }
        }
        return target;
    }
}
