package factorymethod_grupo6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Heloara
 */
public class FabricaGaroto implements FabricaDeChocolate {

    @Override
    public BarraDeChocolate criarChocolateBarra() {
        return new Sensacoes();    
    }

    @Override
    public BombomDeChocolate criarChocolateBomBom() {
        return new Serenata();
    }

    
    
}
