package tech.bongers.dicobo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instruction")
public class Instruction {

    @Id
    @GeneratedValue
    private Long id;
    private Integer sequence;
    private String title;
    private String description;

    public Long getId() {
        return id;
    }

    public Integer getSequence() {
        return sequence;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Instruction{" +
                "id=" + id +
                ", sequence=" + sequence +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
