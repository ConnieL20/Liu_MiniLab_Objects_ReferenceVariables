public class Parrot {
        // Instance variables
        private String species;
        private String name;
        private int age;

        // This is the constructor to create a Parrot object
        public Parrot(String species, String name, int age) {
            this.species = species;
            this.name = name;
            this.age = age;
        }

        // getter and setter methods
        public String getSpecies() {
            return species;
        }

        public void setSpecies(String newSpecies) {
            species = newSpecies;
        }

        public String getName() {
            return name;
        }

        public void setName(String newName) {
            name = newName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int newAge) {
            age = newAge;
        }

        //  Returns a string containing info about the parrot object
        public String info() {
            return "Parrot! Species: " + species + ", Name: " + name + ", Age: " + age;
        }
    }
