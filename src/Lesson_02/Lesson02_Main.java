package Lesson_02;

import Lesson_02.DataManager.PedidoDataSource;
import Lesson_02.Entities.Item;
import Lesson_02.Entities.Pedido;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Lesson02_Main {
    public void main02() {
        PedidoDataSource dataSource = new PedidoDataSource();
        int command = -1;
        int itemCodigo = 0;
        int pedidoCodigo = 0;

        System.out.printf("Digite o nome da filial: ");
        String nomeFilial = new Scanner(System.in).nextLine();

        while (command != 0) {
            System.out.println("Lista de comandos:");
            System.out.println("1 - Adicionar pedido.");
            System.out.println("2 - Remover pedido.");
            System.out.println("3 - Editar pedido.");
            System.out.println("4 - Listar pedidos");
            System.out.println("0 - Sair");
            System.out.printf("Comando: ");
            command = new Scanner(System.in).nextInt();
            System.out.println();


            switch (command) {
                case 0:
                    System.out.println("Obrigado.");
                    System.out.println();
                    break;
                case 1:
                    System.out.printf("Digite o nome do cliente: ");
                    String nomeCliente = new Scanner(System.in).nextLine();
                    Pedido pedido = new Pedido(pedidoCodigo++, Date.from(Instant.now()), Date.from(Instant.now()), nomeCliente, nomeFilial);
                    System.out.printf("Digite a quantidade de itens do pedido: ");
                    int itemAmount = new Scanner(System.in).nextInt();
                    for (int i = 0; i < itemAmount; i++) {
                        System.out.println("Item #" + (i + 1));
                        System.out.printf("Digite o nome do item: ");
                        String name = new Scanner(System.in).nextLine();
                        System.out.printf("Digite a quantidade do item: ");
                        int quantity = new Scanner(System.in).nextInt();
                        System.out.printf("Digite o preço do item: R$");
                        double price = new Scanner(System.in).nextDouble();
                        pedido.addItem(new Item(itemCodigo++, Date.from(Instant.now()), Date.from(Instant.now()), name, quantity, price));
                        System.out.println();
                    }
                    dataSource.addPedido(pedido);
                    break;
                case 2:
                    System.out.printf("Digite o código do pedido: ");
                    int codido = new Scanner(System.in).nextInt();
                    if (dataSource.removePedido(codido)) {
                        System.out.println("Pedido removido com sucesso!");
                    } else {
                        System.out.println("Não foi possivel remover este pedido!");
                    }
                    break;
                case 3:
                    // Edit Pedido method
                    break;
                case 4:
                    List<Pedido> pedidos = dataSource.get_pedidos();
                    for (Pedido item : pedidos) {
                        System.out.println(item);
                    }
                    break;
                default:
                    System.out.println("Comando inválido.");
                    System.out.println();
                    break;
            }
        }
    }
}
