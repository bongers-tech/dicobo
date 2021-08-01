package tech.bongers.dicobo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "recipe")
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    //@OneToMany
    //@JoinColumn(name = "owner_user_id")
    //private User owner;
    private String name;
    private String summary;
    private Integer servings;
    private Integer preparationTime;
    private Integer cookingTime;
    private Integer totalTime;
    private Integer rating;
    private Double price;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Ingredient> ingredients;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Instruction> instructions;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Tag> tags;

    public Long getId() {
        return id;
    }

    //public User getOwner() {
    //    return owner;
    //}

    public String getName() {
        return name;
    }

    public String getSummary() {
        return summary;
    }

    public Integer getServings() {
        return servings;
    }

    public Integer getPreparationTime() {
        return preparationTime;
    }

    public Integer getCookingTime() {
        return cookingTime;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public Integer getRating() {
        return rating;
    }

    public Double getPrice() {
        return price;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setId(Long id) {
        this.id = id;
    }

    //public void setOwner(User owner) {
    //    this.owner = owner;
    //}

    public void setName(String name) {
        this.name = name;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    public void setCookingTime(Integer cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                //", owner=" + owner +
                ", name='" + name + '\'' +
                ", summary='" + summary + '\'' +
                ", servings=" + servings +
                ", preparationTime=" + preparationTime +
                ", cookingTime=" + cookingTime +
                ", totalTime=" + totalTime +
                ", rating=" + rating +
                ", price=" + price +
                ", ingredients=" + ingredients +
                ", instructions=" + instructions +
                ", tags=" + tags +
                '}';
    }
}
