package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("copia equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("digitaliza equipamento multifuncional");
    }

    public void imprimir() {
        System.out.println("imprime equipamento multifuncional");
    }
}
