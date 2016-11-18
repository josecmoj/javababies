package br.com.javababies.transporte;

import br.com.javababies.transporte.motor.EstadoMotor;
import br.com.javababies.transporte.motor.Motor;
import br.com.javababies.transporte.motor.PosicaoMotor;
import br.com.javababies.transporte.pessoa.condutor.terrestre.Motorista;
import br.com.javababies.transporte.pessoa.condutor.terrestre.habilitacao.Categoria;
import br.com.javababies.transporte.pessoa.condutor.terrestre.habilitacao.Habilitacao;
import br.com.javababies.transporte.veiculo.terrestre.Automovel;

import java.sql.Date;
import java.time.Instant;

/**
 * Created by josemoj on 17/11/16.
 */
public class Transporte {

    public static void main(String[] args){

        PosicaoMotor dll = new PosicaoMotor("DLL", "Dianteiro-Longitudinal-Linha");
        PosicaoMotor dlv = new PosicaoMotor("DLV", "Dianteiro-Longitudinal-V");
        PosicaoMotor dtl = new PosicaoMotor("DTL", "Dianteiro-Transversal-Linha");
        PosicaoMotor dtv = new PosicaoMotor("DTV", "Dianteiro-Transversal-V");

        PosicaoMotor cll = new PosicaoMotor("CLL", "Central-Longitudinal-Linha");
        PosicaoMotor clv = new PosicaoMotor("CLV", "Central-Longitudinal-V");
        PosicaoMotor ctl = new PosicaoMotor("CTL", "Central-Transversal-Linha");
        PosicaoMotor ctv = new PosicaoMotor("CTV", "Central-Transversal-V");

        PosicaoMotor tll = new PosicaoMotor("TLL", "Traseiro-Longitudinal-Linha");
        PosicaoMotor tlv = new PosicaoMotor("TLV", "Traseiro-Longitudinal-V");
        PosicaoMotor ttl = new PosicaoMotor("TTL", "Traseiro-Transversal-Linha");
        PosicaoMotor ttv = new PosicaoMotor("TTV", "Traseiro-Transversal-V");

        Motor motorDll = new Motor("LL4", "4 Cilindros em Linha Longitudinal", EstadoMotor.DESLIGADO, dll );

        Automovel vwgol = new Automovel("VWGOL", "Volkswagen Gol");
        vwgol.motor = motorDll;

        Motorista motorista1 = new Motorista("1","Jose","134.456.433-00");
        motorista1.habilitacao = new Habilitacao();
        motorista1.habilitacao.renovar(Date.from(Instant.parse("2020-12-03T00:00:00.00Z")));
        motorista1.habilitacao.categoria = Categoria.C;

        vwgol.conduzir(motorista1);
        vwgol.motor.ligar();

    }
}
