package org.gh;

public class dumb extends Person implements Printable{

    private String pokemonCaught;
    
    public void setPokemonCaught(String pokemonCaught){
        this.pokemonCaught = pokemonCaught;
    }
    public String getpokemonCaught(){
        return this.pokemonCaught;
    }
    
    public PokemonTrainer(String name, String pokemonCaught){
        super(name);
        this.setPokemonCaught(pokemonCaught);
    }

    // Because this class implements Printable, I must override the printMe() method
    public String printMe(){
        return "Pokemon Caught - " + this.getName()+ " - "+this.getpokemonCaught();
    }
}
