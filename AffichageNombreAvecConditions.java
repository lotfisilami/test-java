import java.util.HashMap;

/**
 * Class métier du test java pour afficher les nombres de 1 à 100 avec conditions
 **/
public class AffichageNombreAvecConditions {

    private static HashMap<Integer,String> listeDesNombresAverifier = new HashMap<>();

    /**
     * permet de parcourir les nombres entre 1 et 100
     * si le nombre est multiple de ou contient un nombre dans la liste listeDesNombresAverifier on affiche le libelle (Fizz,Buzz..)
     * sinon on affiche juste le nombre
     **/
    public static void containOrMultipler() {
        initialiserListeDesNombresAverifier();
        boolean phraseAfficher;
        for (int i = 1; i <= 100; i++) {
            // permet de dire si le libelle de la liste listeDesNombresAverifier (Fizz,Buzz..) est déjà affiché sinon on affiche i
            phraseAfficher = false;

            //Parcourir les nombres à vérifier
            for (Integer nombreAverifier:listeDesNombresAverifier.keySet()) {
                if (iContainOrMultiplerNbr(i, nombreAverifier)) {
                    System.out.println("..." + listeDesNombresAverifier.get(nombreAverifier) + "...");
                    phraseAfficher = true;
                }
            }

            if (!phraseAfficher) {
                System.out.println(i);
            }

        }
    }

    /**
     * Vérifie si le nombre i contient ou multiple de nbrAverifie
     *
     * @param i
     * @param nbrAverifie
     * @return boolean
     */
    private static boolean iContainOrMultiplerNbr(int i, int nbrAverifie) {
        return iContainNbr(i, nbrAverifie) || iMultiplerNbr(i, nbrAverifie);
    }

    /**
     * @param i
     * @param nbrAverifie
     * @return boolean
     */
    private static boolean iContainNbr(int i, int nbrAverifie) {
        return String.valueOf(i).contains(String.valueOf(nbrAverifie));
    }

    /**
     * @param i
     * @param nbrAverifie
     * @return boolean
     */
    private static boolean iMultiplerNbr(int i, int nbrAverifie) {
        return i % nbrAverifie == 0;
    }

    /**
     * Permet d’initialiser la liste des nombres à vérifier
     *
     * @return void
     */
    private static void initialiserListeDesNombresAverifier(){
        listeDesNombresAverifier.put(NombreAverifie.Fizz.nombre,NombreAverifie.Fizz.name());
        listeDesNombresAverifier.put(NombreAverifie.Buzz.nombre,NombreAverifie.Buzz.name());
    }

}
