/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factorymethod_grupo6;

/**
 *
 * @author Heloara
 */
public class FabricaCacauShow implements FabricaDeChocolate{
    @Override
    public BarraDeChocolate criarChocolateBarra() {
        return new LaCreme();    
    }

    @Override
    public BombomDeChocolate criarChocolateBomBom() {
	return new AngelRose();
    }
}
