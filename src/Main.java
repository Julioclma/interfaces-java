import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Main {
    public static void main(String[] args) {
        EquipamentoMultifuncional impressora = new EquipamentoMultifuncional();

        impressora.digitalizar();
    }
}