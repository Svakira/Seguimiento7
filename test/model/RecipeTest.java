package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {
    private Recipe recipe;
    private Ingredient ingredient;


    //Scenario 1
    public void setUpStage1(){
        recipe = new Recipe();
    }


    //Scenario 2
    public void setUpStage2(){
        recipe = new Recipe();
        recipe.addIngredient("Cebolla",315);
        recipe.addIngredient("Ajo",58);
        recipe.addIngredient("Arroz",520);
    }

    @Test
    public void testAddIngredientStage1(){
        setUpStage1();
        recipe= new Recipe();
        recipe.addIngredient("Sal",12);
        assertEquals(1,recipe.getIngredients().size());
        assertEquals("Sal"+12.0,recipe.getIngredients().get(0).getName()+recipe.getIngredients().get(0).getWeight());
    }

    @Test
    public void testAddIngredientStage2(){
        setUpStage2();
        recipe.addIngredient("Pimienta",6);
        assertEquals(4,recipe.getIngredients().size());
        assertEquals("Pimienta"+6.0,recipe.getIngredients().get(3).getName()+recipe.getIngredients().get(3).getWeight());

    }

    @Test
    public void testAddIngredientPlusWeight(){
        setUpStage2();
        recipe.addIngredient("Ajo",21);
        assertEquals(3,recipe.getIngredients().size());
        assertEquals(79,recipe.getIngredients().get(1).getWeight());
    }

    @Test
    public void testRemoveIngredient(){
        setUpStage2();
        recipe.removeIngredient("Ajo");
        assertEquals(2,recipe.getIngredients().size());
        assertEquals("Cebolla",recipe.getIngredients().get(0).getName());
        assertEquals("Arroz",recipe.getIngredients().get(1).getName());

    }
}