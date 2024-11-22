public class Dog {
    int size;
    String breed;
    String name;

    
    public Dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    

    void bark() {
        System.out.println("Ruff! Ruff!");
    }



    public void setSize(int size) {
        this.size = size;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getBreed() {
        return breed;
    }

    public String getName() {
        return name;
    }

    
}
