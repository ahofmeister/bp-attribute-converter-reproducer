package org.acme;

import com.blazebit.persistence.view.CreatableEntityView;
import com.blazebit.persistence.view.EntityView;
import com.blazebit.persistence.view.IdMapping;
import com.blazebit.persistence.view.MappingSingular;
import java.util.Set;
import java.util.UUID;

@EntityView(Recipe.class)
@CreatableEntityView
public interface RecipeCreateView {

  @IdMapping
  UUID getId();

  @MappingSingular
  Set<MealCategory> getMealCategories();

  void setMealCategories(Set<MealCategory> mealCategories);

}
