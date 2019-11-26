import java.util.ArrayList;
import java.util.List;

public class Thanos {

    public static void main(String[] args) {

        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("Hulk", 49));
        heroes.add(new Hero("Black Widow", 34));
        heroes.add(new Hero("Captain America", 100));
        heroes.add(new Hero("Thor", 1501));

        // TODO 1 : Modify Hero to implements Comparable and sort by name (ascending)
        int numberOfHeroes = heroes.size();
        Hero tempHero;
        
        for(int i = 0; i < numberOfHeroes; i++) {
            for(int j = i+1; j < numberOfHeroes; j++) {
            	
            	// Compare l'attribut NAME de l'objet du tableau à l'index i (heroes.get(i))
            	// Avec l'attribut NAME de l'objet du tableau à l'index j = i+1 (heroes.get(j))
            	// Si > 0 ==> Tri par ordre croissant
                if(heroes.get(i).Comparable(heroes.get(j).getName()) > 0) {
                	// Stocker l'objet à l'index i dans un conteneur objet temporaire (tempHero)
                	tempHero  = heroes.get(i);
                    
                    // Mettre l'objet à l'index i+1 de la liste, dans l'index i
                    heroes.set(i, heroes.get(j));
                    
                    //  Mettre tempHero (objet à l'index i) dans l'index j = i+1 de la liste
                    heroes.set(j, tempHero);
                }
            }
        }        
        


        System.out.println("\nOrder by name:");
        showList(heroes);

        // TODO 2: Add a Comparator and sort by age (descending)
        for(int i = 0; i < numberOfHeroes; i++) {
            for(int j = i+1; j < numberOfHeroes; j++) {
            	
            	// Compare l'attribut AGE de l'objet du tableau à l'index i (heroes.get(i))
            	// Avec l'attribut AGE de l'objet du tableau à l'index j = i+1 (heroes.get(j))
            	// Si heroes.get(i) < heroes.get(j) ==> Tri par ordre décroissant
                if(heroes.get(i).getAge() < heroes.get(j).getAge()) {
                	// Stocker l'objet à l'index i dans un conteneur objet temporaire (tempHero)
                	tempHero  = heroes.get(i);
                    
                    // Mettre l'objet à l'index i+1 de la liste, dans l'index i
                    heroes.set(i, heroes.get(j));
                    
                    //  Mettre tempHero (objet à l'index i) dans l'index j = i+1 de la liste
                    heroes.set(j, tempHero);
                }
            }
        }        


        System.out.println("\nOrder by age:");
        showList(heroes);
    }

    private static void showList(List<Hero> heroes) {
        for (Hero heroe : heroes) {
            System.out.println(heroe.getName() + ", " + heroe.getAge());
        }
    }
}