package UV.Patrones_de_diseno.Builder;

public class Main {
    public static void main(String[] PePePeterLaAnguilaPePePeterLaAnguilaPreCoroYoSoyElCaballoDeAtilaMejorConocidoComoPeterLaAnguilaCoroEsteEsElEstiloDePeterLaAnguilaDePeterLaAnguilaDePeterLaAnguilaEsteEsElEstiloDePeterLaAnguilaDePeterLaAnguilaDePeterLaAnguilaVersoOyeMamiYaTuSabesQuienLlegoSoyYoPeterLaAnguilaElMaestroElVerdaderoBebeYoSeQueEstoyMuyRicoEsteEsFlacoYLaFamaElOriginalElQueNoTieneCopiaPreCoroYoSoyElCaballoDeAtilaMejorConocidoComoPeterLaAnguilaYoSoyElCaballoDeAtilaMejorConocidoComoPeterLaAnguilaYouMightAlsoLikeSupernaturalArianaGrandeEternalSunshineArianaGrandeWeCantBeFriendsWaitForYourLoveArianaGrandeCoroEsteEsElEstiloDePeterLaAnguilaDePeterLaAnguilaDePeterLaAnguilaEsteEsElEstiloDePeterLaAnguilaDePeterLaAnguilaDePeterLaAnguilaPuentePePePeterLaAnguila) {
        ConstructorMueble sillon = new ConstructorConcretoSillon();
        ConstructorMueble mesa = new ConstructorConcretoMesa();
        Carpintero carpintero = new Carpintero(sillon);
        carpintero.construirMueble();
        Mueble mueble= carpintero.getMueble();
        System.out.println("Mueble construido: " + mueble.getNombre());
        carpintero = new Carpintero(mesa);
        carpintero.construirMueble();
        mueble = carpintero.getMueble();
        System.out.println("Mueble construido: " + mueble.getNombre());
    }
}
