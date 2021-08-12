package model.Produits;

public class Mobile extends OrdinateurEtMobile {

    private boolean support_cartes_memoire;
    private String type_de_cartes_supportees;
    private boolean double_SIM;
    private TypeConnecteurUSB typeUSB;
    private CameraMobile camera;
    private boolean batterie_amovible;
    private boolean recharge_sans_fil;

    /*Definition de l enum  Type USB*/
    private enum TypeConnecteurUSB{MicroUSB,TypeC,USB3};
    /*Defintion de la class Camera mobile*/
    private class CameraMobile{

        private int[] capteurs;
        private boolean flash;
        private boolean capteurEnFacade;
        public CameraMobile(boolean flash,boolean capteurEnFacade,int...capteurs  ){
            this.flash = flash;
            this.capteurEnFacade=capteurEnFacade;
            this.capteurs = capteurs;
        }
    }



    public Mobile(String discreption,
                  String marque,
                  double prix,
                  int nmbDesArticlesEnStock,
                  int nmbDesArticlesReserves,
                  int nmbDesArticleVendu,
                  String systeme,
                  String processeur,
                  int nombre_de_coeurs,
                  double frequence_processeur,
                  String carte_graphique,
                  boolean support_cartes_memoire,
                  String type_de_cartes_supportees,
                  int ram,
                  int capacite_du_stockahge,
                  boolean double_SIM,
                  Ecran ecran,
                  TypeConnecteurUSB typeUSB,
                  CameraMobile camera,
                  double largeur,
                  double hauteur,
                  double epaisseur,
                  double poids,
                  boolean batterie_amovible,
                  int capacite_de_la_batterie,
                  boolean recharge_sans_fil) {
        super(discreption, marque, prix, nmbDesArticlesEnStock, nmbDesArticlesReserves, nmbDesArticleVendu, CategorieP.MOBILE
                , largeur,  hauteur, epaisseur,poids,systeme,ecran,processeur,nombre_de_coeurs,ram,capacite_du_stockahge,
                frequence_processeur,carte_graphique,capacite_de_la_batterie);

        this.support_cartes_memoire = support_cartes_memoire;
        this.type_de_cartes_supportees = type_de_cartes_supportees;
        this.double_SIM = double_SIM;
        this.typeUSB = typeUSB;
        this.camera = camera;
        this.batterie_amovible = batterie_amovible;
        this.recharge_sans_fil = recharge_sans_fil;

    }
    //la methode toString()
    @Override
    public String toString() {
        return (super.toString()+
                ", support cartes memoire "  + support_cartes_memoire +
                ", type de cartes supportees " + type_de_cartes_supportees +
                ", double_SIM " + double_SIM +
                ", typeUSB " + typeUSB +
                ", camera " + camera +
                ", batterie amovible " + batterie_amovible +
                ", recharge sans fil " + recharge_sans_fil).replace("true","Oui")
                .replace("false","-").replace("null","-").replace("0","-");
    }
}
