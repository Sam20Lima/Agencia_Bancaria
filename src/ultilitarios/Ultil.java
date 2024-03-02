package ultilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Ultil {
    static NumberFormat Valores = new DecimalFormat("R$ #,##0.00");

    public static String dobleToString(Double valor){
        return Valores.format(valor);
    }
}
