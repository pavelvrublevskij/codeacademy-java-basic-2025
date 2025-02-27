# Java Code Standards for CA2025 Project

## Table of Contents
1. [Project Structure](#project-structure)
2. [Naming Conventions](#naming-conventions)
3. [Code Formatting](#code-formatting)
4. [Documentation](#documentation)
5. [Best Practices](#best-practices)
6. [Testing](#testing)

## Project Structure

### Package Naming
- All packages should start with `lt.codeacademy.ca2025`
- Use lowercase letters for package names
- Package structure:
  - `controller` - REST/Web controllers
  - `service` - Business logic
  - `dto` - Data Transfer Objects
  - `mapper` - Object mappers
  - `dao` - Data Access Objects
  - `entity` - Database entities
  - `domain` - Domain models
  - `exception` - Custom exceptions
  - `config` - Configuration classes
  - `util` - Utility classes

## Naming Conventions

### Classes
- Use PascalCase (e.g., `UserController`, `OrderService`)
- Suffix classes based on their role:
  - Controllers: `*Controller`
  - Services: `*Service`
  - DTOs: `*Dto`
  - Entities: No suffix
  - Mappers: `*Mapper`
  - Exceptions: `*Exception`

### Methods
- Use camelCase (e.g., `getUserById`, `createNewOrder`)
- Method names should be verbs or verb phrases
- Getter methods start with "get"
- Setter methods start with "set"
- Boolean methods should start with "is", "has", "can", or "should"

### Variables
- Use camelCase
- Should be descriptive and meaningful
- Avoid single-letter variables (except for loops)
- Constants should be UPPER_SNAKE_CASE

## Code Formatting

### General
- Use 4 spaces for indentation (no tabs)
- Maximum line length: 120 characters
- Use blank lines to separate logical blocks
- No trailing whitespace

### Braces
```java
// Correct
if (condition) {
    // code
}

// Wrong
if (condition) 
{
    // code
}
```

### Imports
- No wildcard imports (avoid `import package.*`)
- Organize imports in groups:
  1. Java core packages
  2. Third-party packages
  3. Project packages
- Remove unused imports

## Documentation

### JavaDoc
- Required for public methods and classes
- Should describe:
  - What the method does
  - Parameters (@param)
  - Return values (@return)
  - Exceptions (@throws)
- Example:
```java
/**
 * Retrieves a user by their unique identifier.
 *
 * @param id The unique identifier of the user
 * @return The user if found
 * @throws UserNotFoundException if no user exists with the given id
 */
public User getUserById(Long id) {
    // implementation
}
```

## Best Practices

### General
- Follow SOLID principles
- Use dependency injection
- Prefer immutable objects when possible
- Use lombok annotations to reduce boilerplate
- Handle exceptions appropriately
- Use logging instead of System.out.println()

### DTOs
- Use record classes for DTOs when possible
- Include validation annotations
- Keep DTOs simple and focused

### Services
- Keep business logic in service layer
- Use interfaces for services
- Implement transaction management

### Controllers
- Keep controllers thin
- Use proper HTTP methods
- Handle exceptions with @ExceptionHandler
- Use proper response status codes

## Testing

### Unit Tests
- Test naming convention: `methodName_scenario_expectedBehavior`
- Use meaningful test data
- One assertion per test
- Use @DisplayName for better test descriptions
- Follow AAA pattern (Arrange-Act-Assert)

### Test Coverage
- Minimum 80% code coverage
- 100% coverage for critical business logic
- Use mocks appropriately

### Example Test
```java
@Test
@DisplayName("Should throw exception when user not found")
void getUserById_userNotFound_throwsException() {
    // Arrange
    Long nonExistentId = 999L;
    
    // Act & Assert
    assertThrows(UserNotFoundException.class, 
        () -> userService.getUserById(nonExistentId));
}
```

## Version Control

### Commit Messages
- Use meaningful commit messages
- Follow format: `type(scope): description`
- Types: feat, fix, docs, style, refactor, test, chore
- Example: `feat(user): add email validation`

### Branches
- Main branches: main, develop
- Feature branches: feature/description
- Bugfix branches: bugfix/description
- Release branches: release/version

## Code Review

### Review Checklist
- Code follows these standards
- All tests pass
- No unnecessary comments
- No debug code left
- Proper error handling
- Appropriate logging
- Documentation updated 

## IDE and Tools Configuration

### GitHub Copilot Setup

1. Prerequisites:
   - Active GitHub Copilot license
   - GitHub account with Copilot subscription
   - IDE (IntelliJ IDEA, VS Code, or Cursor)

2. Cursor Configuration:
   - Open Cursor Settings (Ctrl+,)
   - Navigate to "GitHub Copilot" section
   - Click "Sign in to GitHub"
   - Complete the authentication process
   - Verify activation: Look for Copilot icon in status bar

3. Cursor Copilot Shortcuts:
   - Accept suggestion: Tab
   - Next suggestion: Alt + ]
   - Previous suggestion: Alt + [
   - Trigger inline suggestions: Alt + \
   - Open Copilot Chat: Ctrl + Shift + I
   - Generate code with Copilot: Ctrl + Enter
   - Accept word completion: Tab or Right arrow

4. Cursor-specific Features:
   - Use `/fix` in Copilot Chat to fix code issues
   - Use `/test` to generate unit tests
   - Use `/doc` to generate documentation
   - Use `/explain` to get code explanations

### Copilot Usage Guidelines

1. Code Review:
   - Always review Copilot suggestions thoroughly
   - Ensure generated code follows our standards
   - Verify security implications of suggested code
   - Test generated code properly

2. Best Practices:
   - Use Copilot for:
     - Boilerplate code generation
     - Test case creation
     - Common patterns implementation
     - Documentation generation
   - Avoid using Copilot for:
     - Security-sensitive code
     - Complex business logic without review
     - Direct API key or credential suggestions

3. Keyboard Shortcuts:
   - Accept suggestion: Tab
   - Next suggestion: Alt + ] (VS Code) / Alt+Right (IntelliJ)
   - Previous suggestion: Alt + [ (VS Code) / Alt+Left (IntelliJ)
   - Trigger inline suggestions: Alt + \ (VS Code) / Alt+Enter (IntelliJ)
   - Open Copilot panel: Ctrl + Shift + P → "Copilot"

4. Configuration Tips:
   - Enable auto-suggestions in your IDE
   - Configure suggestion delay if needed
   - Set up language-specific settings
   - Use .gitignore for sensitive files 