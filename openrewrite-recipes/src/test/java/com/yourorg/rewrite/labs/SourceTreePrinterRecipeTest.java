package com.yourorg.rewrite.labs;

import static org.openrewrite.java.Assertions.java;

import org.junit.jupiter.api.Test;
import org.openrewrite.test.RecipeSpec;
import org.openrewrite.test.RewriteTest;

class SourceTreePrinterRecipeTest implements RewriteTest {
    private static final String CDI_SCOPE = "ApplicationScoped";
    private static final String SPRING_SCOPE = "ApplicationScope";

    @Override
    public void defaults(RecipeSpec spec) {
        spec.recipe(new SourceTreePrinterRecipe());
    }


    @Test
    void doesNotChangeAnything() {
        rewriteRun(java("""
                package com.yourorg;
                
                import org.slf4j.Logger;
                
                class FooBar {
                  private static Logger logger;
                  
                  void doSomething() {
                      logger.info("Doing somthing");
                  }
                }
                
                """));
    }

    @Test
    void changedByMarkerRecipeFromRecipeList() {
        rewriteRun(java("""
                package com.yourorg;
                
                import org.slf4j.Logger;
                
                class FooBar {
                  private static Logger logger;
                  
                  void doSomething() {
                      //FIXME: there is a typo in the log message
                      logger.info("Doing somthing");
                  }
                }
                
                """,
                """
                package com.yourorg;
                
                import org.slf4j.Logger;
                
                class FooBar {
                  private static Logger logger;
                  
                  void doSomething() {
                      /*~~>*///FIXME: there is a typo in the log message
                      logger.info("Doing somthing");
                  }
                }
                
                """));
    }


}