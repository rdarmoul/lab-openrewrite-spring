# Lab of Open-Rewrite to Upgrade/Migrate Java applications

## Overview
Lab of Open-Rewrite to Rewrite Technical Debt Remediation Sample
More details about Open-Rewrite can be found at https://openrewrite.org/

# OpenRewrite in a Nutshell
OpenRewrite is a powerful tool for automating code refactoring and migrations in Java applications. It provides a framework for defining and applying recipes that can modify source code, making it easier to keep your codebase up-to-date with the latest best practices and frameworks.
OpenRewrite 
1. Transform code into a LST (Lossless Semantic Tree), see more https://docs.openrewrite.org/concepts-and-explanations/lossless-semantic-trees
2. Appy recipes to the LST, which consists of a set of actions on the tree nodes
3. Transform the LST into code and save on disc. 

# Getting started
This is an example project that shows how to get started with Rewrite to automatically perform framework migrations and eliminate technical debt! The default branch (2.1.x) contains a slightly messier form of the last modification made to the famous [Spring PetClinic](https://github.com/spring-projects/spring-petclinic) sample in the Spring Boot 1.5.x line.
To see how this repository can be used, check out the [OpenRewrite quickstart guide](https://docs.openrewrite.org/running-recipes/getting-started).

```mvn rewrite:run``` to apply open-rewrite recipes defined by the plugin in the configuration.
```mvn rewrite:dryRun``` to see what changes would be applied without actually applying them.
```mvn rewrite:dryRun -Drewrite.activeRecipes=com.yourorg.ChangePackageExample```

# Concepts
Recipes: A recipe is a set of instructions that define how to transform code.
## Visitors
Actions are implemented as visitors, which traverse the LST and make modifications based on the defined rules.
- Visitors are existing as Type-Specific Visitors (a nethod or class visitor) or as a Generic Visitors.

# Using OpenRewrite
Using OpenRewrite in a Maven project involves adding the OpenRewrite Maven plugin to your `pom.xml` file and configuring 
it to use the desired recipes.
Note: Using recipes also requires to include its dependencies in the rewrite plugin configuration in the `pom.xml` file.

## rewrite.yml
The `rewrite.yml` file is the main configuration file for OpenRewrite.
It defines the recipes to be applied to the codebase. Here is an example of a `rewrite.yml` file.
The default location of the file is in the root of the project.

# Writing recipes
## Provide recipes
## Combine recipes
## Templates
Templates are a powerful feature in OpenRewrite that allow you to define code patterns and transformations using a templating syntax. 
They enable you to create reusable and parameterized code snippets that can be applied across
see also 
- https://errorprone.info/docs/refaster
- https://docs.openrewrite.org/how-to-guides/writing-recipes/using-templates

# Pitfalls
- Do not mix text based and AST based refactorings in the same recipe. Text based refactorings are applied before AST based refactorings, which can lead to unexpected results.




