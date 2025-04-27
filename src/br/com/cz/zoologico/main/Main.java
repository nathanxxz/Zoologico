package br.com.cz.zoologico.main;

import br.com.cz.zoologico.model.animal.Arara;
import br.com.cz.zoologico.model.animal.Jacare;
import br.com.cz.zoologico.model.animal.Leao;
import br.com.cz.zoologico.model.habitat.Aereo;
import br.com.cz.zoologico.model.habitat.Aquatico;
import br.com.cz.zoologico.model.habitat.Terrestre;
import br.com.cz.zoologico.model.pessoa.Funcionario;
import br.com.cz.zoologico.model.pessoa.Visitante;
import br.com.cz.zoologico.model.zoologico.Recinto;
import br.com.cz.zoologico.model.zoologico.Zoologico;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico=new Zoologico("Ilha dos tritao",10,10,10);
        Funcionario funcionario=new Funcionario(150.00,1,"1234567891011","Lula",71);
        Visitante visitante=new Visitante(2,"10101010101","Dilma",65,true);
        Leao leao=new Leao(3,4,"Auuuuuu","amarelo",false);
        Arara arara=new Arara(5,2,"PiuPiuuu","Verde","Angu");
        Jacare vapracasajacare=new Jacare(8,4,"vudo e pra jacu",15.10);
        Aquatico aquatico = new Aquatico(true, false, true, true);
        Terrestre terrestre = new Terrestre(true, true, true, true);
        Aereo aereo = new Aereo(false, true, true, 5);
        Recinto recintoAq=new Recinto(1,"Pantano",aquatico,1);
        recintoAq.inserirAnimal(vapracasajacare);
        Recinto recintoTer=new Recinto(2,"Selva",terrestre,1);
        recintoTer.inserirAnimal(leao);
        Recinto recintoAer = new Recinto(3,"Amazonia",aereo,1);
        recintoAer.inserirAnimal(arara);
        zoologico.inserirFuncionario(funcionario);
        zoologico.removerFuncionario(1);
        zoologico.inserirVisitante(visitante);
        zoologico.removerVisitante(2);
        zoologico.inserirRecinto(recintoAq);
        zoologico.inserirRecinto(recintoTer);
        zoologico.inserirRecinto(recintoAer);

        zoologico.listarFuncionarios();
        zoologico.listarVisitantes();
        zoologico.listarRecintos();

    }
}
