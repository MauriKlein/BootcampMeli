package java2Pratica2.exercicio02;

import java2Pratica2.exercicio02.entity.NaoPereciveis;
import java2Pratica2.exercicio02.entity.Pereciveis;
import java2Pratica2.exercicio02.entity.Produto;
import java2Pratica2.exercicio02.entity.ItemVenda;

import java.util.ArrayList;
import java.util.List;

public class Distribuidora {
    public static void main(String[] args) {

        Produto queijo = new Pereciveis("Queijo", 5.50, 10);
        Produto presunto = new Pereciveis("Presunto", 9.75, 1);
        Produto peixe = new Pereciveis("Peixe", 13.60, 2);
        Produto picanha = new Pereciveis("picanha", 12.80, 3);
        Produto laranja = new Pereciveis("laranja", 3.45, 20);

        Produto macarrao = new NaoPereciveis("Macarrão", 2.63, "industrializado");
        Produto feijao = new NaoPereciveis("Feijão", 5.64, "in natura");
        Produto soja = new NaoPereciveis("Soja", 4.30, "in natura");
        Produto arroz = new NaoPereciveis("Arroz", 3.99, "in natura");
        Produto café = new NaoPereciveis("Café", 19.45, "industrializado");

        List<ItemVenda> itensVenda = new ArrayList<>();

        itensVenda.add(new ItemVenda(queijo, 5));
        itensVenda.add(new ItemVenda(presunto, 2));
        itensVenda.add(new ItemVenda(peixe, 2));
        itensVenda.add(new ItemVenda(picanha, 1));
        itensVenda.add(new ItemVenda(laranja, 20));

        itensVenda.add(new ItemVenda(macarrao, 2));
        itensVenda.add(new ItemVenda(feijao, 3));
        itensVenda.add(new ItemVenda(soja, 2));
        itensVenda.add(new ItemVenda(arroz, 15));
        itensVenda.add(new ItemVenda(café, 1));

        double valorTotal = 0;
        for(ItemVenda iv: itensVenda){
            valorTotal+=iv.getProduto().calcular(iv.getQuantidade());
            System.out.println(iv.getProduto());
        }

        System.out.println("TOTAL = " +valorTotal);

    }
}
