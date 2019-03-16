package Lesson_02.DataManager;

import Lesson_02.Entities.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDataSource {
    private List<Pedido> _pedidos = new ArrayList<Pedido>();

    public boolean addPedido(Pedido pedido) {
        return _pedidos.add(pedido);
    }

    public boolean updatePedido(Pedido pedido) {
        Pedido target = getPedido(pedido.codigo);
        int index = _pedidos.indexOf(target);
        _pedidos.remove(target);
        _pedidos.add(index, pedido);
        return _pedidos.contains(pedido);
    }

    public boolean removePedido(int codigo) {
        Pedido target = getPedido(codigo);
        if (target != null) return _pedidos.remove(target);
        return false;
    }

    public Pedido getPedido(int codigo) {
        Pedido target = null;
        for (Pedido pedido : _pedidos) {
            if (pedido.equals(codigo)) {
                target = pedido;
                break;
            }
        }
        return target;
    }

    public List<Pedido> get_pedidos() {
        return _pedidos;
    }
}
