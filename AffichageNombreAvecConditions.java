/**
 * Class métier du test java pour afficher les nombres de 1 à 100 avec conditions
 **/
public class AffichageNombreAvecConditions {

    /**
     * permet de parcourir les nombres entre 1 et 100
     * si le nombre est multiple de (3 ou 5) ou contient (3 ou 5) on affiche Fizz et/ou Buzz
     * sinon on affiche juste le nombre
     **/
    public static void containOrMultipler() {
        boolean phraseAfficher;
        for (int i = 1; i <= 100; i++) {
            // permet de dire si Fizz ou Buzz est déjà affiché sinon on affiche i
            phraseAfficher = false;

            if (iContainOrMultiplerNbr(i, NombreAverifie.Fizz.nombre)) {
                System.out.println("..." + NombreAverifie.Fizz.name() + "...");
                phraseAfficher = true;
            }

            if (iContainOrMultiplerNbr(i, NombreAverifie.Buzz.nombre)) {
                System.out.println("..." + NombreAverifie.Buzz.name() + "...");
                phraseAfficher = true;
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

}
