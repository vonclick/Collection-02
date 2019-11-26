public class Hero {

    // attributs
    private String name;
    private int age;

    // constructeurs
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method which implements Comparable By Name
    public int Comparable(String name) {
        
        if( this.name.compareTo(name) > 0 ) {
         return 1;
        }
        else{
        	
            if( this.name.compareTo(name) < 0 ) {
                return -1;
            }       	
            else{
            	return 0;
            }
        }	
    }   
    
    
    
    // accesseurs (getters)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // mutateurs (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}