package just.hazard.ormstudy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class CategoryItem {

    @Id
    @GeneratedValue
    @Column(name = "CATEGORY_ITEM_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    public void setCategory(Category category) {
        this.category = category;
        category.getCategoryItem().add(this);
    }

    public void setItem(Item item) {
        this.item = item;
        item.getCategoryItems().add(this);
    }
}
