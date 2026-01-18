package com.yourorg.rewrite.labs;

import org.openrewrite.ExecutionContext;
import org.openrewrite.NlsRewrite;
import org.openrewrite.Recipe;
import org.openrewrite.TreeVisitor;

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
        return super.getVisitor();
    }
}
