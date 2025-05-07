/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod_grupo6;

/**
 *
 * @author Heloara
 */
public class FactoryMethod_Grupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaDeChocolate fabrica;               
                BarraDeChocolate barra;
                BombomDeChocolate bombom; 
		
                fabrica = new FabricaGaroto();
                
                barra       = fabrica.criarChocolateBarra();
		barra.exibirInfoBarra();                                 
                
                bombom     = fabrica.criarChocolateBomBom();
                bombom.exibirInfoBombom();
          
                fabrica = new FabricaCacauShow();
                
                barra       = fabrica.criarChocolateBarra();
		barra.exibirInfoBarra();                                 
                
                bombom     = fabrica.criarChocolateBomBom();
                bombom.exibirInfoBombom();
    }
    
}
