package fr.efrei.domain;

//Salesman class
public class Salesman {
    private String firstName;
    private String lastName;
    private int id;

    private Salesman (){}

    private Salesman(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.id = builder.id;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String lastName;
        private int id;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Salesman build(){return new Salesman(this);}
    }
}
