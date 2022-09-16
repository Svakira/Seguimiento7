package model;

import exceptions.NegativeNumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
private Ingredient ingredient;


//Scenario 1
public void setUpStage1(){
    ingredient = new Ingredient("Tomate",245);
}

@Test
public void testAddWeight(){
    setUpStage1();
    ingredient.addWeight(54);
    assertEquals(299,ingredient.getWeight());
}

@Test
    public void testNegativeAddWeight(){
            setUpStage1();
            boolean we=false;
            try{
                ingredient.addWeight(-100);
            }catch (NegativeNumberException ex){
                ex.printStackTrace();
                we=true;

            }
            assertEquals(245,ingredient.getWeight());
            assertTrue(we);
    }

@Test
public void testRemoveWeight(){
    setUpStage1();
    ingredient.removeWeight(45);
    assertEquals(200,ingredient.getWeight());
}

@Test
public void testNegativeRemoveWeight(){
    setUpStage1();
    boolean we=false;
    try{
        ingredient.removeWeight(-100);
    }catch (NegativeNumberException ex){
        ex.printStackTrace();
        we=true;

    }
    assertEquals(245,ingredient.getWeight());
    assertTrue(we);
}

}