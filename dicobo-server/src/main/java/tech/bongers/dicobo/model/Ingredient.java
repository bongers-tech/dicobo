package tech.bongers.dicobo.model;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name", length = 250, nullable = false)
    private String name;

    @Column(name = "amount", nullable = false)
    private Integer amount;

    @Enumerated(EnumType.STRING)
    @Column(name = "unit", length = 250, nullable = false)
    private Unit unit;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    public Ingredient() {
        // No-args
    }

    public Ingredient(String name, Integer amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAmount() {
        return amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", unit=" + unit +
                '}';
    }
}
