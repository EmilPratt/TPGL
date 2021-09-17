/**
 *
 * @author roudet
 */

public class Orange
{
    private double prix;
    private String origine;
	
    public Orange() 
    {
        this.prix = 0.5;    // prix en euros
        this.origine = "Espagne";
    }
    
    public Orange(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  // une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
        this.origine = "Espagne";  // Espagne par défaut
	else
        this.origine = origine;   
    }

    public double getPrix()
    {
	   return prix;
    }

    public void setPrix(double prix)
    {
	   this.prix = prix;
    }

    public String getOrigine()
    {
	   return origine;
    }
 
    public void setOrigine(String origine)
    {
	   this.origine = origine;
    }

    @Override
    public String toString()
    {
        return "Orange de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o)     // predicat pour tester si 2 oranges sont equivalentes
    {
        if(o != null && getClass() == o.getClass())
        {
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless()         // predicat indiquant qu'une orange a des pepins
    {
        return false;
    }

    public static void main (String[] args)
    {
        // ecrire ici vos tests
        System.out.println("Premier test Orange !");

        // creation des instances de type Orange
        Orange o1 = new Orange();
        Orange o2 = new Orange(1.50, "Italie");
        Orange o3 = new Orange(-2.20, "");
        Orange o4 = new Orange(1.30, "Maroc");

        // tests des differentes methodes
        double pr1 = o1.getPrix();
        System.out.println("Le prix de la première orange est de : " + pr1);

        o2.setPrix(1.40);
        System.out.println("Le prix de la deuxième orange est de : " + o2.getPrix());

        String or2 = o2.getOrigine();
        System.out.println("L'origine de la deuxième orange est : " + or2);

        o3.setOrigine("Grèce");
        System.out.println("L'origine de la troisième orange est : " + o3.getOrigine());

        boolean b1 = o1.equals(o2);
        System.out.println("Les 2 premières oranges sont-elles équivalentes ? " + b1);

        boolean b2 = o4.isSeedless();
        System.out.println("La quatrième orange a-t-elle des pépins ? " + b2);

        System.out.println("Orange 1 : " + o1.toString());
        System.out.println("Orange 2 : " + o2.toString());
        System.out.println("Orange 3 : " + o3.toString());
        System.out.println("Orange 4 : " + o4.toString());

        // message de fin de programme
        System.out.println("Fin du premier test Orange !");
    }
}
