/**
 * Clase para lanzar la bateria de ejecuciones sobre todos los conjuntos de datos
 */
public class Main2 {

    public static final int SEMILLA1 = 77361422;
    public static final int SEMILLA2 = 77377144;
    public static final int SEMILLA3 = 36142277;
    public static final int SEMILLA4 = 37714477;
    public static final int SEMILLA5 = 14227736;

    public static void main(String[] args) {

        Filemanager filemanager1 = new Filemanager("./archivos_guion/instancias/graph05/");
        Filemanager filemanager2 = new Filemanager("./archivos_guion/instancias/graph06/");
        Filemanager filemanager3 = new Filemanager("./archivos_guion/instancias/graph07/");
        Filemanager filemanager4 = new Filemanager("./archivos_guion/instancias/graph11/");
        Filemanager filemanager5 = new Filemanager("./archivos_guion/instancias/graph12/");
        Filemanager filemanager6 = new Filemanager("./archivos_guion/instancias/graph13/");
        Filemanager filemanager7 = new Filemanager("./archivos_guion/instancias/scen06/");
        Filemanager filemanager8 = new Filemanager("./archivos_guion/instancias/scen07/");
        Filemanager filemanager9 = new Filemanager("./archivos_guion/instancias/scen08/");
        Filemanager filemanager10 = new Filemanager("./archivos_guion/instancias/scen09/");
        Filemanager filemanager11 = new Filemanager("./archivos_guion/instancias/scen10/");

        //filemanager6.imprimeDatos();

        Filemanager[] fileFinal = {filemanager1, filemanager2, filemanager3, filemanager4, filemanager5, filemanager6, filemanager7,
                filemanager8, filemanager9, filemanager10, filemanager11};
        int[] semillaFinal = {SEMILLA1, SEMILLA2, SEMILLA3, SEMILLA4, SEMILLA5};

        for (Filemanager fl : fileFinal) {
            System.out.println("---------------------------------------------");

            for (Integer in : semillaFinal) {
                //AGE sin blx
                AGE miAGE = new AGE(fl, in);
                miAGE.inicializacion();
                miAGE.puntuacionesPoblacion();
                /*
                miAGE.ejecucion(20000, 1);
                miAGE.puntuacionesPoblacion();

                //AGE con blx
                AGE miAGE2 = new AGE(fl, in);
                miAGE2.inicializacion();
                miAGE2.ejecucion(20000, 2);
                miAGE2.puntuacionesPoblacion();

                //AGG sin blx
                AGG myAGG = new AGG(fl, in, false);
                myAGG.ejecucion(20000);
                myAGG.mostrarResultados();

                //AGG con blx
                AGG myAGG2 = new AGG(fl, in, true);
                myAGG2.ejecucion(20000);
                myAGG2.mostrarResultados();
                */
                System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>");
            }
        }

    }
}

