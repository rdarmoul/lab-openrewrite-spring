package com.yourorg.rewrite.labs;

import org.openrewrite.NlsRewrite;
import org.openrewrite.Recipe;

public class MyRecipes extends Recipe {
    @Override
    public @NlsRewrite.DisplayName String getDisplayName() {
        return "This is my first custom recipe, does not do anything yet.";
    }

    @Override
    public @NlsRewrite.Description String getDescription() {
        return "This is my first custom recipe, does not do anything yet.";
    }
}
