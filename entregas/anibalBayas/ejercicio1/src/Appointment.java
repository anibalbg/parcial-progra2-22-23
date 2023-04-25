public class Appointment {
    Client owner;
    Pet pet;
    CustomDate date;
    String description;

    public Appointment(Pet pet, CustomDate date, String description) {
        this.pet = pet;
        this.date = date;
        this.description = description;
    }
    String ToString(){
        return "Appointment with " + pet.getName() + " on " + date.toString() + " for " + description;
    }
    void setOwner(Client owner){
        this.owner=owner;
    }
}
