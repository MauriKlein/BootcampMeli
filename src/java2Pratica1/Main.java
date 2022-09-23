package java2Pratica1;

import java2Pratica1.entity.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("PES01", "Mauri", 41);
        Pessoa p3 = new Pessoa("PES01", "Mauri", 41, 80.0, 1.85);


        switch (p3.calcularIMC()){
            case -1:
                System.out.println(p3.getNome()+" esta Abaixo do peso");
                break;
            case 0:
                System.out.println(p3.getNome()+ " está com Peso Saudável");
                break;
            case 1:
                System.out.println(p3.getNome()+ "está Acima do Peso");
                break;
        }

        if(p3.ehMaiorIdade()){
            System.out.println(p3.getNome()+ " é Maior de Idade");
        }else{
            System.out.println(p3.getNome()+ " não é Maior de Idade");
        }


    }
}
