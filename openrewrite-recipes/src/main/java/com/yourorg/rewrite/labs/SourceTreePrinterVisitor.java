package com.yourorg.rewrite.labs;

import org.openrewrite.ExecutionContext;
import org.openrewrite.java.JavaIsoVisitor;
import org.openrewrite.java.TreeVisitingPrinter;
import org.openrewrite.java.tree.J;

public class SourceTreePrinterVisitor extends JavaIsoVisitor<ExecutionContext> {
    @Override
    public J.CompilationUnit visitCompilationUnit(J.CompilationUnit cu, ExecutionContext executionContext) {
        System.out.println(TreeVisitingPrinter.printTree(getCursor()));
        return super.visitCompilationUnit(cu, executionContext);
    }

    @Override
    public J.MethodDeclaration visitMethodDeclaration(J.MethodDeclaration method, ExecutionContext executionContext) {
        System.out.println("visit method declaration: " +method.getSimpleName());
        return super.visitMethodDeclaration(method, executionContext);
    }
}
