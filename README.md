# Playwright Java Example

This project demonstrates UI testing using [Playwright](https://playwright.dev/java/) with Java and JUnit.

## Prerequisites

- Java 17+
- Maven 3.9+
- Docker (optional, for containerized runs)

## Running Tests Locally

1. Install dependencies and run tests:
    ```
    mvn test
    ```

2. Test reports will be shown in the console.

## Running Tests with Docker

1. Build the Docker image:
    ```
    docker build -t playwright-java-tests .
    ```

2. Run the tests in a container:
    ```
    docker run --rm playwright-java-tests
    ```

## Project Structure

- `src/test/java/com/okeim/playwright/pages/` — Page Object classes
- `src/test/java/com/okeim/playwright/tests/` — Test classes
- `Dockerfile` — For running tests in a container

## Example Test

See `SuccessfulLoginTest.java` for a sample login test using Playwright.

## License

Refer [LISENCE](LISENCE) file
