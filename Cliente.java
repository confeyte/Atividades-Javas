public class Cliente {

    // atributo boolean
    // true ou false

    boolean temDivida;

    // =====================================
    // MÉTODO
    // =====================================

    // void = não retorna nada
    // apenas executa algo

    public void podeComprarFiado() {

        // verifica condição

        if (temDivida == false) {

            // executa se NÃO tiver dívida
            System.out.println("Pode comprar fiado");

        } else {

            // executa se tiver dívida
            System.out.println("Nao pode comprar fiado");
        }
    }
}