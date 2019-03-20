package Lesson_02.Entities;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido extends Data {
    private String nomeCliente;
    private String nomeFilial;
    private List<Item> items = new ArrayList<>();

    public Pedido(int codigo, Date dataHoraInclusao, Date dataHoraEdicao, String nomeCliente, String nomeFilial) {
        super(codigo, dataHoraInclusao, dataHoraEdicao);
        this.nomeCliente = nomeCliente;
        this.nomeFilial = nomeFilial;
    }

    public boolean addItem(Item item) {
        items.add(item);

        return items.contains(item);
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

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("Pedido: " + codigo + System.lineSeparator()
                + "Cliente: " + nomeCliente + System.lineSeparator()
                + "Filial: " + nomeFilial + System.lineSeparator());
        for (int i = 0; i < items.size(); i++) {
            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            string.append(i + 1).append(" item: ").append(items.get(i).name).append(", ").append(items.get(i).quantity).append("units, $").append(df.format(items.get(i).price)).append(System.lineSeparator());
        }

        return string.toString();
    }
}
