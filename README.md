# TestConsole

TestConsole is a test console project. The name suggests a tool for exercising and testing components interactively, but this repository does not yet document its purpose in detail.

## Status

This checkout currently contains only the `LICENSE` file. No source code or build files (for example `pom.xml`, `build.xml` or `ant.bat`) are present, so there are no build or run instructions yet.

When the project sources are added, document here:

- what TestConsole does and its main dependencies
- how to build it (for example `mvn package` if a `pom.xml` is added)
- how to run it

## Build tooling and ignored files

When the sources are added, the project is expected to use these tools:

- Ant: run `ant.bat` (or `ant`) to build with `build.xml`.
- Maven: run `mvn package` to build with `pom.xml`; output goes to `target/`.
- XJC: run `xjc.bat` to generate JAXB classes from XML schemas.

The `certs/` directory holds certificates and key material used for local testing. It is listed in `.gitignore` and must not be committed. Build output (`target/`, `classes/`, `*.jar`) is ignored for the same reason.

These build files are not in this checkout yet, so confirm the commands against them once they are added.

## License

See [LICENSE](./LICENSE).
