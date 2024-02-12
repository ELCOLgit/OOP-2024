
package ie.tudublin;

public class Cat {
    
    String name;
	private int numLives;

	public void setName(String name)
	{
		this.name = name;
        
	}
	// A constructor. Same name as the file. 
	// No return value
	// Member of the Cat class
	public Cat()
	{
		this.name = "rescue Kitty";
        this.numLives = 9;
	}
	
	// A constructor that takes name
	public Cat(String name)
	{
		this.name = name;
        this.numLives = 9;
	}

    public int getNumLives()
    {
        return numLives;
    }

    public void kill()
    {
        this.numLives = this.numLives - 1;
        if (this.numLives > 0) {
            System.out.println("Ouch");
        }
        else{
            System.out.println("Dead");
        }
    }


	// A method
	public void speak()
	{
		System.out.println("Meow. I am " + name);
	}

    
}

package ie.tudublin;

public class Cat extends Animal {
    public void speak()
    {
        System.out.println("Meaow: " + getName());
    }

    public Cat(String name)
    {
        setName(name);
    }
    
}

