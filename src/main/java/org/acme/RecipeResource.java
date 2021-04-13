package org.acme;

import com.blazebit.persistence.view.EntityViewManager;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("recipes")
public class RecipeResource {


  @Inject
  EntityViewManager entityViewManager;

  @Inject
  EntityManager entityManager;

  @POST
  @Transactional
  @Consumes(MediaType.APPLICATION_JSON)
  public void add(@Valid RecipeCreateView view) {
    entityViewManager.save(entityManager, view);
  }

}
