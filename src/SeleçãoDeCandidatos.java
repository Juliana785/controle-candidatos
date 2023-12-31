import java.util.concurrent.ThreadLocalRandom;

public class SeleçãoDeCandidatos {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE", "MARCIA", "FABRICIO", "MIRELA", "DANIELA"};
        
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int indice = 0; indice < candidatos.length;indice++){
        System.out.println("O candidato de nº" + indice + " é" + candidatos[indice]);
        }
        }

        
static void selecaoCandidatos(){
    String[] candidatos = {"FELIPE", "MARCIA", "JOÃO", "ANDRE", "GUSTAVO", "FABRICIO", "MIRELA", "DANIELA", "JORGE", "BERBARDO"};

    int candidatosSelecionados = 0;
    int candidatosAtual = 0;
    double salarioBase = 2000.0;
    while (candidatosSelecionados <5 && candidatosAtual < candidatos.length){
        String candidato = candidatos[candidatosAtual];
        double salarioPretendido = valorPretendido();
    

        System.out.println("O candidato" + candidato + "solicitou este valor de salário" +salarioPretendido);
        if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato" + candidato + "foi selecionado para a vaga");
            candidatosSelecionados ++;
}
        candidatosAtual ++;

    }
}


static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
}

static void analisarCandidato (double salarioPretendido){
    double salarioBase = 2000.0;
   
    if (salarioBase > salarioPretendido){
         System.out.println("LIGAR PARA O CANDIDATO");
    }  
    else if (salarioBase == salarioPretendido){
         System.out.println("LIGAR PARA O CANDIDATO COM UMA CONTRA PROPOSTA");
    }
    else {
        System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
    }
}
}


