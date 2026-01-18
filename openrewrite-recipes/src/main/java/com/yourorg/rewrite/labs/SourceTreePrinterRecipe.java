package com.yourorg.rewrite.labs;

import java.util.Arrays;
import java.util.List;

import org.openrewrite.ExecutionContext;
import org.openrewrite.NlsRewrite;
import org.openrewrite.Preconditions;
import org.openrewrite.Recipe;
import org.openrewrite.TreeVisitor;
import org.openrewrite.java.search.FindComments;
import org.openrewrite.java.search.UsesType;

public class SourceTreePrinterRecipe extends Recipe {
    @Override
    public @NlsRewrite.DisplayName String getDisplayName() {
        return "Printer for a class file";
    }

    @Override
    public @NlsRewrite.Description String getDescription() {
        return "This is my first custom recipe, does not do anything yet.";
    }

    @Override
    public TreeVisitor<?, ExecutionContext> getVisitor() {
        //use preconditions to limit the files this visitor is applied to, here for example
        //only files are printed that use org.slf4j.Logger
        return Preconditions.check(new UsesType<>("org.slf4j.Logger",true ),
                new SourceTreePrinterVisitor());

    }

    @Override
    public List<Recipe> getRecipeList() {
        return Arrays.asList(new FindComments(Arrays.asList("TODO", "FIXME")));
    }
}
