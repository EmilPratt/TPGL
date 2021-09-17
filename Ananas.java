public class Ananas
{
    private double prix;
    private String origine;
	
    public Ananas() 
    {
        this.prix = 0.5;    // prix en euros
        this.origine = "Antilles";
    }
    
    public Ananas(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  // une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
        this.origine = "Antilles";  // Antilles par défaut
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
        return "Ananas de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o)     // predicat pour tester si 2 Ananas sont equivalentes
    {
        if(o != null && getClass() == o.getClass())
        {
            Ananas an = (Ananas) o;
            return (prix == an.prix && origine.equals(an.origine));
        }
        return false;
    }

    public boolean isSeedless()         // predicat indiquant qu'une Ananas a des pepins
    {
        return false;
    }

    public static void main (String[] args)
    {
        // ecrire ici vos tests
        System.out.println("Début premier test Ananas !");

        // creation des instances de type Ananas
        Ananas a1 = new Ananas();
        Ananas a2 = new Ananas(1.50, "République Dominicaine");
        Ananas a3 = new Ananas(-1.80, "");
        Ananas a4 = new Ananas(4.00, "Guyane");

        // tests des differentes methodes
        double pr1 = a1.getPrix();
        System.out.println("Le prix de la première Ananas est de : " + pr1);

        a2.setPrix(3.50);
        System.out.println("Le prix de la deuxième Ananas est de : " + a2.getPrix());

        String or2 = a2.getOrigine();
        System.out.println("L'origine de la deuxième Ananas est : " + or2);

        a3.setOrigine("Pérou");
        System.out.println("L'origine de la troisième Ananas est : " + a3.getOrigine());

        boolean b1 = a1.equals(a2);
        System.out.println("Les 2 premières Ananass sont-elles équivalentes ? " + b1);

        boolean b2 = a4.isSeedless();
        System.out.println("La quatrième Ananas a-t-elle des pépins ? " + b2);

        System.out.println("Ananas 1 : " + a1.toString());
        System.out.println("Ananas 2 : " + a2.toString());
        System.out.println("Ananas 3 : " + a3.toString());
        System.out.println("Ananas 4 : " + a4.toString());

        // message de fin de programme
        System.out.println("Fin du premier test Ananas !");
    }
}
